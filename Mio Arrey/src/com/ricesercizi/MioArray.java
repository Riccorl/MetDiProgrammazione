package com.ricesercizi;

/**
 * Created by Ric on 22/03/16.
 */
public class MioArray
{
    private int[] mioArray;

    public MioArray(int[] mioArray)
    {
        this.mioArray = mioArray;
    }

    public boolean bContiene(int i, int valore)
    {
        boolean value = false;
        if (i < mioArray.length && mioArray[i] == valore) value = true;
        return value;
    }

    public int somma2()
    {
        if (mioArray.length == 0) return 0;
        else if (mioArray.length < 2) return mioArray[0];
        else return mioArray[0] + mioArray[1];
    }

    public void scambio(int i, int j)
    {
        if (mioArray.length >= Math.max(i, j))
        {
            int temp = mioArray[i];
            mioArray[i] = mioArray[j];
            mioArray[j] = temp;
        }
    }

    public int maxTripla()
    {
        int last = mioArray.length-1;
        return Math.max(mioArray[0], Math.max(mioArray[last], mioArray[last/2]));
    }

    public int[] falloInDue()
    {
        int[] a = {mioArray[0], mioArray[mioArray.length-1]};
        return a;
    }
}
