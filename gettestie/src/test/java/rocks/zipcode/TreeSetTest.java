package rocks.zipcode;

import com.sun.source.util.Trees;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void addRemoveSizeTest() {
        TreeSet<String> artists = new TreeSet<>();
        artists.add("Griz");
        artists.add("Anderson Paak");
        artists.add("Porter");
        artists.add("Feed Me");
        artists.remove("Porter");
        Integer expected = 3;

        Integer actual = artists.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        TreeSet<String> artists = new TreeSet<>();
        artists.add("Griz");
        artists.add("Anderson Paak");
        artists.add("Porter");
        artists.add("Feed Me");

        Assert.assertTrue(artists.contains("Griz"));
    }

    @Test
    public void subsetTest() {
        TreeSet<String> artists = new TreeSet<>();
        artists.add("Griz");
        artists.add("Anderson Paak");
        artists.add("Porter");
        artists.add("Feed Me");

        //artists.subSet("Anderson Paak", "Feed Me");

        System.out.println(artists.subSet("Griz", true, "Porter", true));
    }

    @Test
    public void clearIsEmptyTest() {
        TreeSet<String> artists = new TreeSet<>();
        artists.add("Griz");
        artists.add("Anderson Paak");
        artists.add("Porter");
        artists.add("Feed Me");
        artists.clear();

        Assert.assertTrue(artists.isEmpty());
    }
}
