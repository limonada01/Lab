package timeMachine;

public class EstadoDetenido extends Estado {

    public EstadoDetenido(MachineTime maquina) {
        super(maquina);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo en Epoca: \n"+
        " Año: "+maquina.getFecha().getYear() +
        " Mes: "+maquina.getFecha().getMonth()+
        " Dia: "+maquina.getFecha().getDay()
        );
    }

    @Override
    public void stop() {
        Date fechaActual= maquina.getFecha();//guardo la fecha actual para regresar a ella al dar reproducir
        System.out.println("Tiempo Detenido!");
       
    }

    @Override
    public void siguiente() {
        // TODO Auto-generated method stub
    
    }

    @Override
    public void anterior() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String estadoActual() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
