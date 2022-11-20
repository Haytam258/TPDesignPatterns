package com.example.tpdesignpatterns.Kingdom;

import java.util.ArrayList;
import java.util.List;

public class KingDom {

    private String king;
    private List<Country> countries;

    private Integer soldersOnEdge;

    public void setKing(String king){
        this.king = king;
    }

    public void addCountry(Country country){
        if(this.countries == null){
            this.countries = new ArrayList<>();
        }
        this.countries.add(country);
    }

    public void addSoldiersOnEdge(Integer soldiers){
        this.soldersOnEdge = soldiers;
    }


    public String report(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(king + ":|");
        for(Country country: countries){
            stringBuilder.append(country.getCountryName().charAt(0) + ":<");
            int counter = 1;
            for(City city: country.getCities()){
                stringBuilder.append(country.getCountryName().charAt(0) + "c" + counter++ + ":");
                stringBuilder.append(city.getSoldiers() + "-" + city.getCitizen() + ",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append(">");
            if(this.soldersOnEdge != null){
                stringBuilder.append("-" + soldersOnEdge);
            }
            stringBuilder.append(",");

        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        stringBuilder.append("|");
        return stringBuilder.toString();
    }

    public Integer currentPower(){
        return this.countries.stream().mapToInt(country -> country.getCities().stream().mapToInt(City::getSoldiers).sum()).sum();
    }

}
