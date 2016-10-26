package strategy;

public class Size implements ToInt
{
    @Override
    public int toInt(String s)
    {
        return s.length();
    }
}
