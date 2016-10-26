package command;

public class Bottone
{
    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void premi()
    {
        command.execute();
    }
}
