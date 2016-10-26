package strategy;

public class ParsedInteger implements ToInt
{
    @Override
    public int toInt(String s)
    {
        return Integer.parseInt(s);
    }
}
