package com.ricesercizi;

/**
 * Created by Ric on 14/03/16.
 */
public class GestoreArray
{
    private int[] myArray;

    public GestoreArray(int[] myArray)
    {
        this.myArray = myArray;
    }

    public int indexOf(int n)
    {
        for (int i = 0; i< myArray.length; i++)
            if (myArray[i] == n) return i;
        return -1;
    }

    public void concat(int[] newArray)
    {
        int len1 = myArray.length;
        int len2 = newArray.length;

        int[] concatArray = new int[len1+len2];
        for (int i = 0; i < len1; i++) concatArray[i] = myArray[i];
        for (int i = 0, j = len1; i < len2; i++, j++) concatArray[j] = newArray[i];
    }
}
