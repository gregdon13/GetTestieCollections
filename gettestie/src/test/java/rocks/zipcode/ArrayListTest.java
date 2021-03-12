package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @Test
    public void SizeAndAddAndRemoveTest() {
        Integer expected = 2;
        List<String> arrList = new ArrayList<>();
        arrList.add("light");
        arrList.add("can");
        arrList.add("yeti");
        arrList.remove("can");
        Integer actual = arrList.size();

        Assert.assertEquals(expected, actual);
        System.out.println(arrList);
    }

    @Test
    public void isEmptyTest() {
        List<String> arrList = new ArrayList<>();
        arrList.add("light");
        arrList.add("can");


        Assert.assertFalse(arrList.isEmpty());
    }

    @Test
    public void containsTest() {
        List<String> arrList = new ArrayList<>();
        arrList.add("light");
        arrList.add("can");

        Assert.assertTrue(arrList.contains("can"));
    }

    @Test
    public void indexTest() {
        List<String> arrList = new ArrayList<>();
        arrList.add("light");
        arrList.add("can");
        arrList.add("yeti");
        Integer expected = 0;

        Integer actual = arrList.indexOf("light");

        Assert.assertEquals(expected, actual);
    }
}
