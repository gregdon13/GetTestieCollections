package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class PriorityQueue {

    @Test
    public void addRemoveSizeTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(13);
        numbers.add(4);
        numbers.remove(1);
        Integer expected = 3;

        Integer actual = numbers.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearIsEmptyTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(13);
        numbers.add(4);
        numbers.clear();

        Assert.assertTrue(numbers.isEmpty());
    }

    @Test
    public void offerTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(13);
        numbers.add(4);
        numbers.offer(15);

        System.out.println(numbers);
    }

    @Test
    public void peekTest() {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(13);
        numbers.add(4);
        Integer expected = 1;
        Integer actual = numbers.peek();

        Assert.assertEquals(expected, actual);
    }
}
