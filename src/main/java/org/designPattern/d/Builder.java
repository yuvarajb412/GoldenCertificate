package org.designPattern.d;

public class Builder {
    private  int id;
    private  String name;
    private  String address;
    private  String cityName;


    private Builder(UserBuilder builder){
        this.id =builder.id;
        this.name =builder.name;
        this.address = builder.address;
        this.cityName = builder.cityName;
    }

    public String toString(){
        return  this.id+" "+ this.name+" "+this.address+" "+this.cityName;
    }


    public  static  class UserBuilder{

        private  int id;
        private  String name;
        private  String address;
        private  String cityName;

        public  UserBuilder setId(int id){
            this.id =id;
            return  this;
        }

        public UserBuilder setName(String name){
            this.name=name;
            return  this;
        }
        public  UserBuilder setAddress(String address){
            this.address = address;
            return  this;
        }
        public UserBuilder setCityName(String cityName){
            this.cityName = cityName;
            return  this;
        }

        public Builder build(){
            return  new Builder(this);
        }


    }
}

class b{
    public static void main(String[] args) {

        Builder builder = new Builder.UserBuilder().setAddress("csfs")
                .setCityName("chennai")
                .setId(1)
                .build()
                ;
        System.out.println(builder);
    }
}