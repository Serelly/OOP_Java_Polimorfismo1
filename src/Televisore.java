//subclass
public class Televisore extends DispositivoElettronico {

    /**
     * costruttore della subclass che richiama quello della superclass
     * @param marca
     */
    public Televisore(String marca) {
        super(marca);
    }

    @Override
    public void accendi(){
        super.accendi();
        System.out.println("il televisore"+ " " + marca + " " + "si sta accendendo");
    }
}
