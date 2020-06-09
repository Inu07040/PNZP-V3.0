import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NodTest {
    Nod arr = new Nod();

    @Test
    public void simpleTest() {
        int[] b = {12, 18, 66, 22};
        int actual = arr.nod(b);
        int expected = 2;
        assertEquals(expected, actual);
        int[] c = {10, 10, 10, 10};
        actual = arr.nod(c);
        expected = 10;
        assertEquals(expected, actual);
        int[] a = {};
        actual = arr.nod(a);
        expected = 1001;
        assertEquals(expected, actual);
    }

    @Test
    public void stressRandomTest() {
        for (int i = 0; i < 10001; i = i + 100) {
            System.out.println(arr.nod(generateArrRandom(1000 + i)));
        }
    }

    @Test
    public void stressSimpleTestOne() {
        int actual = arr.nod(generateArrSimple(10000));
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void stressSimpleTestTwo() {
        int actual = arr.nod(generateArrSimple(100000));
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void stressSimpleTestThree() {
        int actual = arr.nod(generateArrSimple(1000000));
        int expected = 1;
        assertEquals(expected, actual);
    }

    private int[] generateArrSimple(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    private int[] generateArrRandom(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
