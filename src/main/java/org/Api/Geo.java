package org.Api;

public class Geo {

    private String lat;
    private double lng;

    public  Geo(String lat,double lng){
        this.lat=lat;
        this.lng=lng;
    }

    public void  setLat(String lat){
        this.lat=lat;
    }
    public  void  setLng(double lng){
        this.lng=lng;
    }

    public  String getLat(){
        return lat;
    }

    public double getLng(){
        return lng;
    }


}
