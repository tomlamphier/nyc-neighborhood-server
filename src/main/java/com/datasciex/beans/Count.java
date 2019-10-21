package com.datasciex.beans;

public class Count implements Comparable<Count> {
    private String neighborhood;
    private Long count;
    private String rank;

    public Count() {}

    public Count(String neighborhood, Long count) {
        this.setNeighborhood(neighborhood);
        this.setCount(count);
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int compareTo(Count o) {
        return this.count.intValue() - o.count.intValue();
    }
}
