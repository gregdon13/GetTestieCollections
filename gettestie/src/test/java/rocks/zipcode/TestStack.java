package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testStackPop() {
        Stack<String> stack = new Stack<>();
        Stack<String> expected = new Stack<>();
        expected.push("Hello");
        stack.push("Hello");
        stack.push("Hi");
        stack.pop();


        assertEquals(expected, stack);
    }

    @Test
    public void pushStackTest() {
        Stack<String> stack = new Stack<>();
        Stack<String> expected = new Stack<>();
        Stack<String> different = new Stack<>();
        different.push("blah");
        expected.push("words");
        stack.push("words");

        assertEquals(expected, stack);
        assertFalse(expected == different);
    }

    @Test
    public void peekStackTest() {
        Stack<String> stack = new Stack<>();
        stack.push("lava");


        assertEquals("lava", stack.peek());
    }

}
