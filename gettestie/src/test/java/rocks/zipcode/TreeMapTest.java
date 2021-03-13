package rocks.zipcode;

import apple.laf.JRSUIUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void putAndRemoveTest() {
        TreeMap<Integer, String> heroTree = new TreeMap<>();
        heroTree.put(1, "Rorshach");
        heroTree.put(2, "Silk Spectre");
        heroTree.put(3, "Dr Manhattan");
        heroTree.remove(1);

        TreeMap<Integer, String> expected = new TreeMap<>();
        expected.put(2, "Silk Spectre");
        expected.put(3, "Dr Manhattan");

        Assert.assertEquals(expected, heroTree);
    }

    @Test
    public void clearIsEmptyTest() {
        TreeMap<Integer, String> heroTree = new TreeMap<>();
        heroTree.put(1, "Rorshach");
        heroTree.put(2, "Silk Spectre");
        heroTree.put(3, "Dr Manhattan");
        heroTree.clear();

        Assert.assertTrue(heroTree.isEmpty());
    }

    @Test
    public void checkOrder() {
        TreeMap<Integer, String> heroTree = new TreeMap<>();
        heroTree.put(1, "Rorshach");
        heroTree.put(3, "Dr Manhattan");
        heroTree.put(2, "Silk Spectre");

        System.out.println(heroTree);
    }

    @Test
    public void containsTest() {
        TreeMap<Integer, String> heroTree = new TreeMap<>();
        heroTree.put(1, "Rorshach");
        heroTree.put(3, "Dr Manhattan");
        heroTree.put(2, "Silk Spectre");

        Assert.assertTrue(heroTree.containsKey(2));
        Assert.assertTrue(heroTree.containsValue("Silk Spectre"));
    }
}
