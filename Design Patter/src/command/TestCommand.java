package command;

public class TestCommand
{
    public static void main(String[] args)
    {
        Command c1 = new Bottone1();
        Command c2 = new Bottone2(10, 5);

        Bottone bottone = new Bottone();

        bottone.setCommand(c1);
        bottone.premi();

        bottone.setCommand(c2);
        bottone.premi();
    }
}
