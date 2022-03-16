package com.company;

public class Student {
    String name,gender,engDepartment;
    int year_of_enrollment,id,age;
    double perTillDate;

    //id,name,age,gender,engDepartment,year of enrollment ,perTillDate
    Student(int id,String name,int age,String gender,String engDepartment,int year_of_enrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.year_of_enrollment=year_of_enrollment;
        this.perTillDate=perTillDate;
    }

    public  String getName(){
        return this.name;
    }

    public  String getDept(){
        return this.engDepartment;
    }

    public int getEnrol(){
        return this.year_of_enrollment;
    }

    public  String getGender(){
        return this.gender;
    }

    public  double getPer(){
        return this.perTillDate;
    }

    public int getAge(){
        return this.age;
    }


}
