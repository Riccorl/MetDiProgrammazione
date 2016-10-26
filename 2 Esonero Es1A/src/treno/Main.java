package treno;

public class Main {

    public static void main(String[] args) throws Treno.TrenoFinito, Vagone.VagonePieno
    {
	// write your code here
        VagoneLetto vagletto = new VagoneLetto();
        PasseggeroAssonnato passonato = new PasseggeroAssonnato();

        vagletto.occupa(passonato);


        Treno treno1 = new Treno(new Locomotiva());

        treno1.aggiungiVagone(vagletto);
        treno1.aggiungiVagone(new VagonePasseggeri());
        treno1.aggiungiVagone(new VagoneLetto());
        treno1.aggiungiVagone(new VagonePasseggeri());
        treno1.aggiungiVagone(new VagoneMerci());
        System.out.println(treno1.toString());

        Treno treno2 = treno1.dividiTreno(3, new Locomotiva());

        System.out.println(treno2.toString());
    }
}
