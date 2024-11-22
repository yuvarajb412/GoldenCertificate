package org.Api;

import java.util.List;

public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;


    public Address(String street,String suite,String city,String zipcode,
                   Geo geo){

        this.street=street;
        this.suite=suite;
        this.city=city;
        this.zipcode=zipcode;
        this.geo=geo;

    }


    public  String getStreet(){
        return street;
    }

    public Geo getGeo() {
        return geo;
    }

    public String getCity() {
        return city;
    }

    public String getSuite() {
        return suite;
    }

    public String getZipcode() {
        return zipcode;
    }
}
