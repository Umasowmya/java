package com.correct_format;

public class Strong_wash  implements  Wash_interface, Strong_interface,Estimate_time{

    int pairs;

    public void provide_pairs(int pairs){
        this.pairs=pairs;
        System.out.println("pairs are"+pairs);
    }


    public void provide_detergent(){

    }

    @Override
    public int estimate_time() {
        int time=10*pairs;
        return time;
    }



    public String strong_wash(String mode){
        if (mode=="strong")
            System.out.println("strong mode is selected");
        else
            System.out.println("wrong mode");

        return "successfully washed";
    }
}
