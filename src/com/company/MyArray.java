package com.company;

public class MyArray<T>
{
    private Object[] arr;
    private int length = 10;
    private int size = 0;

    public MyArray()
    {
        arr = new Object[length];
    }

    public int size()
    {
        return size;
    }

    public T get(int index)
    {
        return (T) arr[index];
    }

    public void add(T element)
    {
        if (size < length )
        {
            arr[size] = element;
            size = size + 1;
        }
        else
        {
            increaseSize();
            arr[size] = element;
            size = size + 1;
        }
    }

    public void add(int index, T element)
    {
        // put in some code here
        // remember error situations
    }

    public boolean remove(int index)
    {
        // put in nogen kode
        // husk håndtere fejlmuligheder
        return false;
    }

    public void clear()
    {
        //mangler nogen kode
    }


    private void increaseSize()
    {
        System.out.println("Shit pommmes frit, vi skal lave den lidt større");
        Object[] arr2 = new Object[arr.length + 10];
        for (int i=0; i<arr.length; i++)
        {
            arr2[i] = arr[i];
        }
        arr = arr2;
        length = arr.length;
    }


}
