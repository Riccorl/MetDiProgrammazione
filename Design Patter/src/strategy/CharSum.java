package strategy;

public class CharSum implements ToInt
{
    @Override
    public int toInt(String s)
    {
        return s.chars().reduce(0, (x, y) -> x+y);
    }
}
