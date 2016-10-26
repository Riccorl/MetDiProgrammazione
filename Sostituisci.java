import java.utils.Arrays;
public class Sostituisci
{
	public String sostituisci(int[] arrayInt, int primo, int secondo)
	{
		for (int i = 0; i < arrayInt.length; i++)
		{
			if (arrayInt[i] == primo) arrayInt[i] = secondo;
		}

		return Arrays.toString(arrayInt);
	}

	public static void main(String[] args) {
		Sostituisci swap = new Sostituisci();
        int[] a = {1, 2, 3, 4, 5};
		String s = swap.sostituisci(a, 2, 4);

        System.out.println(s);
	}
}