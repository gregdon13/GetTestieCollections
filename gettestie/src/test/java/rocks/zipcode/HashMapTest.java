package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void putAndRemoveTest() {
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");
    }
}
