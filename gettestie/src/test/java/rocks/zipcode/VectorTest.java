package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void setSizeTest() {
        Vector<String> heroVec = new Vector<>();
        heroVec.add("Dust");
        heroVec.add("Shift");
        heroVec.add("Dust");

        heroVec.setSize(2);

        System.out.println(heroVec);
    }

    @Test
    public void sizeTest() {
        Vector<String> heroVec = new Vector<>();
        heroVec.add("Dust");
        heroVec.add("Shift");
        heroVec.add("Dust");

        Integer expected = 3;
        Integer actual = heroVec.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearIsEmptyTest() {
        Vector<String> heroVec = new Vector<>();
        heroVec.add("Dust");
        heroVec.add("Shift");
        heroVec.add("Dust");
        heroVec.clear();

        Assert.assertTrue(heroVec.isEmpty());
    }
}
