package eserciziario.es322;

public class TestCoppie
{
    public static void main(String[] args)
    {
        CollezioneCoppie<String> collInt = new CollezioneCoppie<>();
        collInt.aggiungi("cane", "dio");
        collInt.aggiungi("cane", "gesu");
        collInt.aggiungi("cane", "madonna");
        collInt.aggiungi("cane", "dio");
        collInt.aggiungi("porco", "dio");
        collInt.aggiungi("porco", "dio");


        System.out.println(collInt);

        collInt.elimina("droga", "dio");
        System.out.println(collInt);
        System.out.println(collInt.getCoppiaPerX("droga"));
    }
}
