package com.example.tpdesignpatterns.Kingdom.Builder;

import com.example.tpdesignpatterns.Kingdom.KingDom;

public interface KingDomBuilder {

    KingDomBuilder addKing(String king);
    KingDomBuilder addCountry(String country, String... details);
    KingDomBuilder addSoldiersOnEdge(String number);
    KingDom build();
}
