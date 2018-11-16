package com.company;

public class DWongLib {


    public static void bubble(int[] array)
    {
        int temp = 0;
        for(int k = 0; k < array.length; k++)
        {
            for(int i = 0; i < array.length - 1; i++)
            {
                if(array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
