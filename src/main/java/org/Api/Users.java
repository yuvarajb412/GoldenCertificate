package org.Api;

import java.util.List;

public class Users {

    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


    public Users(){

    }

    public Users(int id,
                 String name,
                 String username,
                 String email,
                 Address address,
                 String phone,
                 String website,
                 Company company){

        this.address=address;
        this.company=company;
        this.email=email;
        this.id=id;
        this.name=name;
        this.username=username;
        this.phone=phone;
        this.website=website;


    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Company getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }
}
