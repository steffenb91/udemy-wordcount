package com.steffenboe;

import java.io.IOException;
import java.util.List;

class Metrics {

    private List<Metric> all;

    Metrics(Metric... all){
        this.all = List.of(all);
    }

    void collectAll() throws IOException{
        for (Metric metric : all) {
            metric.collect();
        }
    }
}
