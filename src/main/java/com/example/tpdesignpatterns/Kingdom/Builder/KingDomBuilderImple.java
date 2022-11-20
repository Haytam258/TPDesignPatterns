package com.example.tpdesignpatterns.Kingdom.Builder;

import com.example.tpdesignpatterns.Kingdom.Country;
import com.example.tpdesignpatterns.Kingdom.Factory.CountryFactory;
import com.example.tpdesignpatterns.Kingdom.Factory.CountryFactoryImple;
import com.example.tpdesignpatterns.Kingdom.KingDom;

import java.util.ArrayList;
import java.util.List;

public class KingDomBuilderImple implements KingDomBuilder{
    KingDom kingDom = new KingDom();
    CountryFactory countryFactory = new CountryFactoryImple();

    // Maybe add a builder for Country

    @Override
    public KingDomBuilder addKing(String king) {

        kingDom.setKing(king);
        return this;

    }

    @Override
    public KingDomBuilder addCountry(String country, String... details) {
        List<Integer> citizens = new ArrayList<>();
        List<Integer> soldiers = new ArrayList<>();
        for(int i = 0; i < details.length - 1; i = i+2){
            citizens.add(Integer.parseInt(details[i+1]));
            soldiers.add(Integer.parseInt(details[i]));

        }
        Country countryToAdd = countryFactory.buildCountry(country, citizens, soldiers);
        kingDom.addCountry(countryToAdd);
        return this;
    }

    @Override
    public KingDomBuilder addSoldiersOnEdge(String number) {
        kingDom.addSoldiersOnEdge(Integer.parseInt(number));
        return this;
    }

    @Override
    public KingDom build() {
        return kingDom;
    }
}
