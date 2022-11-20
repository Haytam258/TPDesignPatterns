package com.example.tpdesignpatterns;

import com.example.tpdesignpatterns.Kingdom.Builder.KingDomBuilderImple;
import com.example.tpdesignpatterns.Kingdom.KingDom;
import com.example.tpdesignpatterns.Kingdom.Builder.KingDomBuilder;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarSimulationTest {

    @Test
    public void showKingDom(){
        KingDom kingDom = new KingDomBuilderImple()
                .addKing("Youness")
                .addCountry("France","20","100","50","200","100","100")
                .addCountry("Spain","30","200","40","300")
                .build();
        assertEquals("Youness:|F:<Fc1:20-100,Fc2:50-200,Fc3:100-100>,S:<Sc1:30-200,Sc2:40-300>|",kingDom.report());

    }
    @Test
    public void showKingDomPower(){
        KingDom kingDom = new KingDomBuilderImple()
                .addKing("Youness")
                .addCountry("France","20","100","50","200","100","100")
                .addCountry("Spain","30","200","40","300")
                .build();
        assertEquals(240, kingDom.currentPower());
    }

    @Test
    public void aKingDomHaveSoldiersOnEdges(){
        KingDom kingDom1 = new KingDomBuilderImple()
                .addKing("Youness")
                .addCountry("France","20","100","50","200","100","100")
                .addCountry("Spain","30","200","40","300")
                .addSoldiersOnEdge("500")
                .build();

        KingDom kingDom2 = new KingDomBuilderImple()
                .addKing("Amine")
                .addCountry("USA","500","1000","400","500","200","300","2000","300")
                .build();
        assertEquals("Youness:|F:<Fc1:20-100,Fc2:50-200,Fc3:100-100>-500,S:<Sc1:30-200,Sc2:40-300>-500|",kingDom1.report());
        assertEquals("Amine:|U:<Uc1:500-1000,Uc2:400-500,Uc3:200-300,Uc4:2000-300>|",kingDom2.report());
        assertEquals(240,kingDom1.currentPower());
        assertEquals(3100,kingDom2.currentPower());

    }

    /*@Test
    public void aKingDomCanPrepareAnAttackAnOther(){
        KingDom kingdom1 = new KingDomBuilderImple()
                .addKing("Youness")
                .addCountry("France", "20","100","50","200","100","100")
                .addCountry("Spain", "30", "200", "40", "300")
                .addSoldiersOnEdges("500")
                .build();

        KingDom kingdom2 = new KingDomBuilderImple()
                .addKing("Amine")
                .addCountry("USA", "30","200","40","300")
                .addSoldiersOnEdges("200")
                .build();

        assertEquals("Youness:|F:<Fc1:20-100, Fc2:50-200, Fc3:100-100>-500,S:<Sc1:30-200, Sc2:40-300>-500|",kingdom2.report());
        assertEquals("Amine:|U:<Uc1:30-200,Uc2:40-300>-200|", kingdom2.report());
        assertEquals(240, kingdom1.currentPower());
        assertEquals(70, kingdom2.currentPower());

        War war = new WarBuilder()
                .addKingDom(kingdom1)
                .addKingDom(kingdom2)
                .addMap("France:100:spain, France:1000:USA, Spain:1500:USA")
                .build();

        war.prepareAttack();

        assertEquals("Youness:|F:<Fc1:20-100, Fc2:50-200, Fc3:100-100>-535,S:<Sc1:15-200, Sc2:20-300>-500|", kingdom1.report());
        assertEquals("Amine:|U:<Uc1:30-200,Uc2:40-300>-200|", kingdom2.report());
        assertEquals(205, kingdom1.currentPower());
        assertEquals(70, kingdom2.currentPower());
    }

    @Test
    public void aKingDomCanAttackAnOther(){
        KingDom kingdom1 = new KingDomBuilder()
                .addKing("Youness")
                .addCountry("France", "20", "100", "50", "200", "100", "100")
                .addCoutry("Spain", "30", "200", "40", "300")
                .addSoldierOnEdges("500")
                .build();

        KingDom kingdom2 = new KingDomBuilder()
                .addKing("Amine")
                .addCountry("USA", "30", "200", "40", "300")
                .addSoldiersOnEdges("200")
                .build();

        assertEquals(240, kingdom1.currentPower());
        assertEquals(70, kingdom2.currentPower());

        War war = new WarBuilder()
                .addKingDom(kingdom1)
                .addKingDom(kingdom2)
                .addMap("France:100:Spain,France:1000:USA,Spain:1500:USA")
                .build();

        // the kingdom which has more power prepare Attack on the nearest kingdoms
        // when a kingdom prepare an attack he moves 50% of his army on each city to the country's edge which
        // is the nearest to the other kingdom
        war.prepareAttack();

        assertEquals("Youness:|F:<Fc1:20-100,Fc2:50-200,Fc3:100-100>-535,S:<Sc1:15-200,Sc2:20-300>-500|",kingdom1.report());
        assertEquals("Amine:|U:<Uc1:30-200,Uc2:40-300>-200|",kingdom2.report());
        assertEquals(205, kingdom1.currentPower());
        assertEquals(70, kingdom2.currentPower());
        // the kingdom attack the soldiers on edage of the nearest coutry
        war.start();

        assertEquals("Youness:|F:<Fc1:20-100,Fc2:50-200,Fc3:100-100>-335,S:<Sc1:15-200,Sc2:20-300>-500|",kingdom1.report());
        assertEquals("Amine:|U:<Uc1:30-200,Uc2:40-300>|",kingdom2.report());
        assertEquals(205, kingdom1.currentPower());
        assertEquals(70, kingdom2.currentPower());



    }*/

}
