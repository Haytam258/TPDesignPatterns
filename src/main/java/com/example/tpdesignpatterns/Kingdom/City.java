package com.example.tpdesignpatterns.Kingdom;

public class City {

    private String cityName;
    private Integer citizen;
    private Integer soldiers;

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public void setCitizen(Integer citizen){
        this.citizen = citizen;
    }

    public void setSoldiers(Integer soldiers){
        this.soldiers = soldiers;
    }

    public String getCityName(){
        return cityName;
    }

    public Integer getCitizen(){
        return citizen;
    }

    public Integer getSoldiers(){
        return soldiers;
    }

}
