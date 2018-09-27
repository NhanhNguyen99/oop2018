package week3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax()
    {
        assertEquals(1,Week3.max(1,1));
        assertEquals(10,Week3.max(-2, 10));
        assertEquals(100,Week3.max(100,20));
        assertEquals(23,Week3.max(23,18));
        assertEquals(-15,Week3.max(-15,-20));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinofArray()
    {
        int[] a1 = {-3,-15,4,100};
        int[] a2 ={1,2,-3};
        int[] a3 = {5,30,16,4,6,4,10,20,2,15};
        int[] a4 = {-1,-1};
        int[] a5 = {8,0,9,10};
        assertEquals(-15,Week3.minOfArray(a1));
        assertEquals(-3,Week3.minOfArray(a2));
        assertEquals(2,Week3.minOfArray(a3));
        assertEquals(-1,Week3.minOfArray(a4));
        assertEquals(0,Week3.minOfArray(a5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCaculateBMI()
    {
        assertEquals("Thieu can",Week3.calculateBMI(53,1.75));
        assertEquals("Binh thuong",Week3.calculateBMI(49,1.62));
        assertEquals("Beo phi",Week3.calculateBMI(60,1.5));
        assertEquals("Thua can",Week3.calculateBMI(75,1.75));
        assertEquals("Thieu can",Week3.calculateBMI(53,1.75));
    }
}
