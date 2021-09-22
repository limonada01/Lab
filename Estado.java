package timeMachine;

public abstract class Estado {

    protected MachineTime maquina;

    public Estado(MachineTime maquina) {
        this.maquina=maquina;
    }

    public abstract void play();

    public abstract void stop();

    public abstract void siguiente();

    public abstract void anterior();

    public abstract String estadoActual();

}
