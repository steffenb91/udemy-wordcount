package com.steffenboe;

import java.io.IOException;

interface Metric {
    
    void collect() throws IOException;
}
