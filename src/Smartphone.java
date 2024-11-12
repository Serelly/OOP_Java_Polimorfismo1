//subclass della classe base DispositivoElettronico
public class Smartphone extends DispositivoElettronico {

    /**
     * costruttore subclass che inizializza i campi della superclass
     * @param marca
     */
    public Smartphone(String marca){
        super(marca); //richiamo il costruttore della superclass
    }

    //sovrascrivo metodo1
    @Override
    public void accendi() {
        super.accendi();
        System.out.println("lo smartphone"+" "+ marca + " " + "si sta accendendo");
    }
    //sovrascrivo metodo2

    @Override
    public void connettiAllaRete() {
        super.connettiAllaRete();
        System.out.println("lo smartphone"+ " " + marca + " " + "è connesso alla rete mobile");
    }
}
