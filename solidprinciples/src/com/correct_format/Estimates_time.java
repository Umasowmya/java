package com.correct_format;

public class Estimates_time {
    int pairs;
    private Estimate_time e;
    Estimates_time( Estimate_time p){
        this.e=p;
    }

    public int get_total_time(){
        return e.estimate_time();
    }

}

