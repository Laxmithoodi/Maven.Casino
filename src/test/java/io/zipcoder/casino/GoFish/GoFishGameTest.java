package io.zipcoder.casino.GoFish;

import io.zipcoder.casino.utilities.Card;
import io.zipcoder.casino.utilities.Hand;
import io.zipcoder.casino.utilities.Player;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GoFishGameTest {
// GoFish Game Test

    @Test
    public void testGoFish() {

        boolean expectedCard = false;

        Player playertest = new Player("Laxmi");

        GoFishGame  goFishGame = new GoFishGame(playertest);

        Hand handtest = new Hand();
       //When
        Card card = new Card("", 13);


      Boolean  actual = handtest.contains(card);


        //Then

    Assert.assertEquals(expectedCard, actual);

    }




    @Test
    public void testPlayerTurn() {
//        String  expectedCard = "4";

        Player playertest = new Player("Laxmi");

        GoFishGame  goFishGame = new GoFishGame(playertest);
        ArrayList<String> cardTest = new ArrayList<>();
       cardTest.add(0, "K");
       assertEquals(1, cardTest.size());


    }

}

