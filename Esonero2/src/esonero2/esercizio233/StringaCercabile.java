package esonero2.esercizio233;

public class StringaCercabile implements Cercabile
{
    private String s;

    public StringaCercabile(String s)
    {
        this.s = s;
    }

    @Override
    public boolean cerca(char c)
    {
        boolean b = false;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c) b = true;

        return b;
    }
}
