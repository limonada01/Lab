package timeMachine;

public class EstadoDetenido extends Estado {

    public EstadoDetenido(MachineTime maquina) {
        super(maquina);
    }

    @Override
    public void play() {
        this.maquina.onTiempo();
        System.out.println("Play en horario actual seteado: \n"+
        this.maquina.getHorarioActual()+" hs."
        );
    }

    @Override
    public void stop() {
        System.out.println("El tiempo ya se encuentra detenido!");
       
    }

    @Override
    public void siguiente() {
        maquina.avanzar1hora();
    
    }

    @Override
    public void anterior() {
        maquina.retroceder1hora();
        
    }

    @Override
    public String estadoActual() {
        // TODO Auto-generated method stub
        return "Detenido";
    }
    
}
