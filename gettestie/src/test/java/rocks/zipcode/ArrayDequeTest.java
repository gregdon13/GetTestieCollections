package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    @Test
    public void calculateSizeTest() {
        ArrayDeque<String> heroArr = new ArrayDeque<>();
        heroArr.add("Hulk");
        heroArr.add("Thor");
        heroArr.add("Black Widow");

        Integer expected = 3;

        Integer actual = heroArr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        ArrayDeque<String> heroArr = new ArrayDeque<>();
        heroArr.add("Hulk");
        heroArr.remove("Hulk");

        Assert.assertTrue(heroArr.isEmpty());
    }

    @Test
    public void containsTest() {
        ArrayDeque<String> heroArr = new ArrayDeque<>();
        heroArr.add("Hulk");
        heroArr.add("Thor");
        heroArr.add("Black Widow");

        Assert.assertTrue(heroArr.contains("Black Widow"));
    }

    @Test
    public void clearIsEmptyTest() {
        ArrayDeque<String> heroArr = new ArrayDeque<>();
        heroArr.add("Hulk");
        heroArr.add("Thor");
        heroArr.add("Black Widow");
        heroArr.clear();

        Assert.assertTrue(heroArr.isEmpty());
    }
}
