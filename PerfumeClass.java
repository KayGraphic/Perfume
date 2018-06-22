package com.example.android.rentalproperties;

public class PerfumeClass {

        //metadata basics
        private String collection;
        private String description;
        private int ounces;
        private String name;
        private String image;
        private Double cost;


    //constructor
    public PerfumeConstructor(String collection, String description, int ounces, String name, String image,Double cost){
    this.ounces=ounces;
    this.collection=collection;
    this.description=description;
    this.name= name;
    this.image=image;
    this.cost= cost;


}

    //write your getters

    public String getCollection(){return collection ;}
    public String getDescription(){return  description;}
    public int getOunces(){return ounces;}
    public String getName(){return name;}
    public String getImage(){return image;}
    public Double getCost(){return cost;}
}

