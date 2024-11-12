//subclass
public class Computer extends DispositivoElettronico {


    /**
     * costruttore della subclass che richiama quello della superclass
     * @param marca
     */
    public Computer(String marca) {
        super(marca);
    }

    @Override
    public void accendi(){
        super.accendi();
        System.out.println("il computer"+ " "+ marca + " " + "si sta accendendo");
    }
}
