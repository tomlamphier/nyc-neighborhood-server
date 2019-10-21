package com.datasciex.controller;

import com.datasciex.beans.NeighborhoodQuery;
import com.datasciex.beans.NeighborhoodQueryRes;
import com.datasciex.model.NhoodGeo;
import com.datasciex.repository.NhoodGeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.datasciex.model.NhoodBounds;
import com.datasciex.repository.NhoodBoundsRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NhoodGeoController {
    @Autowired
    NhoodGeoRepository nhoodGeoRepository;
    @Autowired
    NhoodBoundsRepository nhoodBoundsRepository;

    @CrossOrigin(origins = "http://localhost")
    @PostMapping("/nhoodgeo")
    public NeighborhoodQueryRes nhgeos(@RequestBody NeighborhoodQuery neighborhoodQuery) {
        ArrayList<NhoodGeo> nhs = new ArrayList<NhoodGeo>();
        double minlng = 1000.0;    // these bogus values will be replaced by first set of bounds
        double maxlng = -1000.0;
        double minlat = 1000.0;
        double maxlat = -1000.0;
        for (String neighborhood: neighborhoodQuery.getNeighborhoods()) {
            List<NhoodGeo> qry = nhoodGeoRepository.findByNeighborhood(neighborhood);
            nhs.addAll(qry);
            NhoodBounds nhb = nhoodBoundsRepository.findByNeighborhood(neighborhood);
            if (nhb.getMinlng() < minlng) minlng = nhb.getMinlng();
            if (nhb.getMaxlng() > maxlng) maxlng = nhb.getMaxlng();
            if (nhb.getMinlat() < minlat) minlat = nhb.getMinlat();
            if (nhb.getMaxlat() > maxlat) maxlat = nhb.getMaxlat();
        }
        NeighborhoodQueryRes nqr = new NeighborhoodQueryRes();
        StringBuilder sb = new StringBuilder();
        sb.append("{ \"type\": \"FeatureCollection\", \"features\": [");
        String prefix = "";
        for (NhoodGeo ng: nhs) {
            sb.append(prefix);
            sb.append(ng.getGeodata());
            prefix = ",";
        }
        sb.append("] }");
        nqr.setGeodata(sb.toString());
        nqr.setMinlng(minlng);
        nqr.setMaxlng(maxlng);
        nqr.setMinlat(minlat);
        nqr.setMaxlat(maxlat);
        return nqr;
    }
}
