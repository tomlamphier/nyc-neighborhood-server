package com.datasciex.beans;

public class ChoroplethQueryRes {
    private Count[] counts;

    public ChoroplethQueryRes() {}

    public ChoroplethQueryRes(Count[] counts) {
        this.counts = counts;
    }

    public Count[] getCounts() {
        return counts;
    }
}
