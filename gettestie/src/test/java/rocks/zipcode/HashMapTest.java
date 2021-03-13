package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {

    @Test
    public void putAndRemoveTest() {
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");
        heroMap.remove(2);

        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "Cap");
        expected.put(3, "Spiderman");


        Assert.assertEquals(expected, heroMap);
    }

    @Test
    public void sizeTest() {
        Integer expected = 3;
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");

        Integer actual = heroMap.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyAndClearTest() {
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");

        heroMap.clear();

        Assert.assertTrue(heroMap.isEmpty());
    }

    @Test
    public void getValueTest() {
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");

        String actual = heroMap.get(1);
        String expected = "Cap";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyAndValueTest() {
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");

        Assert.assertTrue(heroMap.containsKey(3));
        Assert.assertTrue((heroMap.containsValue("Iron Man")));
    }

    @Test
    public void keySetTest() {
        HashMap<Integer, String> heroMap = new HashMap<>();
        heroMap.put(1, "Cap");
        heroMap.put(2, "Iron Man");
        heroMap.put(3, "Spiderman");

        Integer[] actual = new Integer[3];
        actual[0] = 1;
        actual[1] = 2;
        actual[2] = 3;

        System.out.println(Arrays.toString(actual));
        System.out.println(heroMap.keySet());
    }
}
