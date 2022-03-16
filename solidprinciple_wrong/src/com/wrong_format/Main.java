package com.wrong_format;

public class Main {

    public static void main(String[] args) {
        Fill_water t =new Fill_water();
        Normal_wash n = new Normal_wash();
        t.fill("high");
        n.provide_pairs(10);
        t.get_time(n);
        System.out.println("total time is "+t.get_total_time());
        n.provide_detergent();
        n.provide_fragrance();
        n.wash("normal",5);
        t.dry();

    }
}
