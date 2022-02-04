package com.company;

import java.util.Random;

public class Main
{
    static Random randGen = new Random();
    static MyArray<Integer> arr = new MyArray();

    public static void main(String[] args)
    {
        System.out.println(arr);
        for (int i=0; i<33; i++)
        {
            arr.add(randGen.nextInt(100));
        }

        System.out.println(arr);
        for(int i=0; i<arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }//end main
}
