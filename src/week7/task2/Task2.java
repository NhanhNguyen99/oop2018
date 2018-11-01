package week7.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public void testNullPointerException() throws NullPointerException
    {
        String a = null;
        System.out.println(a.equals("Nhanh"));
    }

    public void testArrayIndexOfBoundException() throws ArrayIndexOutOfBoundsException
    {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        for(int i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void testArithmeticException()throws ArithmeticException
    {
        int x = 5/0;
        System.out.println(x);
    }

    public void testClassCastException() throws ClassCastException
    {
        Object i = Integer.valueOf(10);
        String str = (String)i;
    }

    public void testFileNotFoundException() throws FileNotFoundException, IOException
    {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("C:\\test.txt"));
        br.close();
    }
    public static void main(String[] args)
    {
        Task2 t = new Task2();
        try
        {
            t.testNullPointerException();
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
        }

        try
        {
            t.testArrayIndexOfBoundException();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        try
        {
            t.testArithmeticException();
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }

        try
        {
            t.testClassCastException();
        }
        catch (ClassCastException e)
        {
            System.out.println("ClassCastException");
        }

        try
        {
            t.testFileNotFoundException();

        }

        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException ");
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
