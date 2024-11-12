//creo classe che utilizza il polimorfismo

public class GestioneDispositivi {

    /**
     * creo metodo statico per la gestione dei dispositivi
     * @param dispositivo
     */
    public void gestisciDispositivo(DispositivoElettronico dispositivo){
        dispositivo.accendi();
        dispositivo.connettiAllaRete();
        dispositivo.spegniti();
    }

    public static void main(String[] args) {

        //istanzio un oggetto GestioneDispositivi dalla classe GestioneDispositivi per poterlo chiamare per usare i metodi
        //come al solito :)
        GestioneDispositivi gd = new GestioneDispositivi();

        //creo istanze delle diverse subclassi (dai relativi costruttori)
        DispositivoElettronico smartphone = new Smartphone("Apple"); //polimorfismo
        DispositivoElettronico computer = new Computer("MacBook");  //polimorfismo
        DispositivoElettronico televisore = new Televisore("LG");   //polimorfismo

        //uso il metodo statico pergestire i vari dispositivi
        System.out.println("\n Gestione smartphone:");
        gd.gestisciDispositivo(smartphone);

        System.out.println("\n Gestione computer:");
        gd.gestisciDispositivo(computer);

        System.out.println("\n Gestione televisore:");
        gd.gestisciDispositivo(televisore);




    }
}
