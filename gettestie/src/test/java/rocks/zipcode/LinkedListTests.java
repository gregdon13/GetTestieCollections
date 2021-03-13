package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTests {

    @Test
    public void getFirstTest() {
        LinkedList<String> heroList = new LinkedList<>();
        heroList.add("Hawkeye");
        heroList.add("Vision");
        heroList.addFirst("Cap");

        String expected = "Cap";
        String actual = heroList.getFirst();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastTest() {
        LinkedList<String> heroList = new LinkedList<>();
        heroList.add("Cap");
        heroList.add("Hawkeye");
        heroList.add("Vision");

        String expected = "Vision";
        String actual = heroList.getLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        LinkedList<String> heroList = new LinkedList<>();
        heroList.add("Cap");
        heroList.add("Hawkeye");
        heroList.add("Vision");
        Integer expected = 3;

        Integer actual = heroList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        LinkedList<String> heroList = new LinkedList<>();
        heroList.add("Cap");
        heroList.add("Hawkeye");
        heroList.add("Vision");

        Assert.assertTrue(heroList.contains("Hawkeye"));
    }

    @Test
    public void isEmptyTestAndClearTest() {
        LinkedList<String> heroList = new LinkedList<>();
        heroList.add("Cap");
        heroList.add("Hawkeye");
        heroList.add("Vision");
        heroList.clear();

        Assert.assertTrue(heroList.isEmpty());
    }
}
