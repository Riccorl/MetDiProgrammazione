package command;

public class Bottone2 implements Command
{
    private int k, j;
    private String label;

    public Bottone2 (int k, int j)
    {
        this.k = k; this.j = j;
    }

    @Override
    public void execute()
    {
        label = ""+k/j;
        System.out.println(label);
    }


}
