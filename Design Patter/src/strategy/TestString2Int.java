package strategy;

public class TestString2Int
{
    public static void main(String[] args)
    {
        String2Integer st = new String2Integer("porcodio");

        st.setToInt(new CharSum());
        System.out.println(st.runToInt());
    }
}
