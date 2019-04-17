package com.datasciex.rest311a.controller;

import com.datasciex.rest311a.beans.ChoroplethQuery;
import com.datasciex.rest311a.beans.ChoroplethQueryRes;
import com.datasciex.rest311a.beans.Count;
import com.datasciex.rest311a.model.NhoodCount;
import com.datasciex.rest311a.repository.NhoodCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.datasciex.rest311a.model.NhoodBounds;
import com.datasciex.rest311a.repository.NhoodBoundsRepository;

import java.util.*;

import static java.lang.Math.round;

@RestController
public class ChoroplethController {
    @Autowired
    NhoodCountRepository nhoodCountRepository;
    @Autowired
    NhoodBoundsRepository nhoodBoundsRepository;

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("/choropleth")
    public ChoroplethQueryRes choro(@RequestBody ChoroplethQuery choroplethQuery) {
        Map<String, Long> nhscores = new HashMap<String, Long>();
        String[] neighborhoods = choroplethQuery.getNeighborhoods();
        String[] complaints = choroplethQuery.getComplaints();

        double tot;
        for (String n : neighborhoods) {
            tot = 0;
            for (String c : complaints) {
                List<NhoodCount> ncs = nhoodCountRepository.findByNeighborhoodAndComplaint(n, c);
                for (NhoodCount nc : ncs) {
                    tot += nc.getCount();
                }
            }
            // normalize by area
            NhoodBounds nhb = nhoodBoundsRepository.findByNeighborhood(n);
            tot /= nhb.getArea();
            tot *= 2590000;
            nhscores.put(n, round(tot));
        }
        Count[] wk = new Count[nhscores.size()];
        int i = 0;
        for (String n: nhscores.keySet()) {
            wk[i] = new Count(n, nhscores.get(n));
            i++;
        }

        Arrays.sort(wk);
        for (i=0; i<wk.length; i++) {
            wk[i].setRank(String.format("%d of %d", i + 1, wk.length ));
        }

        return new ChoroplethQueryRes(wk);
    }


}
