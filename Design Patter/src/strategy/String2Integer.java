package strategy;

public class String2Integer
{
    private String s;
    private ToInt toInt;

    public String2Integer(String s)
    {
        this.s = s;
    }

    public void setToInt(ToInt toInt)
    {
        this.toInt = toInt;
    }

    public int runToInt()
    {
        return toInt.toInt(s);
    }
}
