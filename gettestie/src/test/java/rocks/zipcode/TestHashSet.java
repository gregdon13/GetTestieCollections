package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    @Test
    public void HashSetSizeAndAdd() {
        Integer expected = 2;
        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("second");

        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashSetContains() {
        Set<String> set = new HashSet<>();
        set.add("first");

        Assert.assertTrue(set.contains("first"));
    }

    @Test
    public void HashSetRemove() {
        Set<String> set = new HashSet<>();
        Set<String> compare = new HashSet<>();
        compare.add("pen");
        set.add("first");
        set.add("pen");
        set.remove("first");

        Assert.assertEquals(compare, set);
    }

    @Test
    public void HashSetClear() {
        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("pen");
        set.clear();

        Assert.assertTrue(set.isEmpty());
    }

//    @Test
//    public void HashSetClone() {
//        HashSet<String> original = new HashSet<>();
//        original.add("can");
//        original.add("cat");
//
//        Set<String> copy = (Set<String>) original.clone();
//
//        Assert.assertEquals(original, copy);
//    }
}
