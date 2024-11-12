
//creo la classe di base
public class DispositivoElettronico {
    //attributo
    protected String marca;

    /**
     * costruttore che inizializza il campo marca
     * @param marca
     */
    public DispositivoElettronico(String marca) {
        this.marca = marca;
    }



    //metodo1

    /**
     * Device set ON
     */
    public void accendi(){
        System.out.println("il dispositivo"+" "+ marca + " " + " si sta accendendo");
    }
    //metodo2

    /**
     * OF
     */
    public void spegniti(){
        System.out.println("il dispositivo si sta spegnendo");
    }
    //metodo3

    /**
     * CONNETTI
     */
    public void connettiAllaRete(){
        System.out.println("il dispositivo" + " " + marca + " " + "è connesso alla rete");
    }

}
