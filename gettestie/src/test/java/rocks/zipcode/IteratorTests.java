package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTests {

    @Test
    public void iteratorTrial() {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Green Arrow");
        heroes.add("Superman");
        heroes.add("Batman");
        heroes.add("Flash");
        heroes.add("Nightwing");

        Iterator itr = heroes.iterator();

        while (itr.hasNext()) {
            String hero = (String) itr.next();
            System.out.println(hero);
        }
    }
}
