package com.correct_format;

public class Main {

    public static void main(String[] args) {
        Low_level l = new Low_level();
        Normal_wash n = new Normal_wash();
        Dry_clothes d = new Dry_clothes();
        Estimates_time t =new Estimates_time(n);
        l.fill();
        n.provide_pairs(10);
        n.provide_detergent();
        n.provide_fragrance();
        t.get_total_time();
        n.normal_wash("normal",5);
        d.dry();
    }
}
