package timeMachine;

public class EstadoReproduciendo extends Estado {
    public EstadoReproduciendo(MachineTime maquina) {
        super(maquina);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void play() {
        System.out.println("Ya se encuentra repoduciendo la vida en este horario: \n"+
        this.maquina.getHorarioActual()+" hs."
        );
    }

    @Override
    public void stop() {
        maquina.pausarTiempo();
        System.out.println("Tiempo Detenido en este horario: "+ maquina.getHorarioActual()+" hs.");
       
    }

    @Override
    public void siguiente() {
        maquina.avanzar10Min();
    
    }

    @Override
    public void anterior() {
        maquina.retroceder10Min();
        
    }

    @Override
    public String estadoActual() {
        // TODO Auto-generated method stub
        return "Reproduciendo Vida";
    }
    
}
