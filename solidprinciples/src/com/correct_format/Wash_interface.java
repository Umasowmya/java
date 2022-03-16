package com.correct_format;

public interface Wash_interface {
    void provide_pairs(int pairs);
    void provide_detergent();
}


interface Normal_interface{
    void provide_fragrance();
    String normal_wash(String mode,int repetitions);
}


interface Strong_interface{

    String  strong_wash(String mode);
}

