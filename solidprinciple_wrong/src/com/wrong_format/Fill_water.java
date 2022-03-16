package com.wrong_format;

public class Fill_water {
    static int time=0;
    String level;
    Fill_water(){

    }

    public void  get_time(Normal_wash obj){
        this.time+=obj.get_timeN();
    }

    public void get_time(Strong_wash obj){
        this.time=+obj.get_timeS();
    }

    public int get_total_time(){
        return time;
    }
    //Single Responsibility principle is violated because two functionalities are being performed by Estimate_Java class
    public void fill(String level){
        this.level=level;
        if (level=="high")
            System.out.println("filling to high level");
        else if (level=="low")
            System.out.println("filling to low level");
    }
    public void dry()
    {
        System.out.println("clothes are drying");
    }
}
