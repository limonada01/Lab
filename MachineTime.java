package timeMachine;

import java.util.Date;

public class MachineTime {
    
   
    
    private Estado state;
    private Reloj reloj;
    private Thread hiloReloj;

    public MachineTime() {
        reloj=new Reloj();
        hiloReloj = new Thread(reloj);
        state = new EstadoReproduciendo(this);
    }


    public void play() {
        state.play();
    }

    public void stop() {
        state.stop();
    }

    public void siguiente() {
        state.siguiente();
    }

    public void anterior() {
        state.anterior();
    }

    public String estadoActual() {
        return state.estadoActual();
    }
    
    public Estado getEstado(){
        return this.state;
    }
    
    public Reloj getReloj(){
        return this.reloj;
    }
    

    /*
    Protected methods of player. Exposed to in-package classes
     */

    /**
     * Change state method.
     * @param s state to transition to
     */
    protected void cambiarEstado(Estado s) {
        this.state = s;
    }
   
    protected Date getFecha(){
        return this.fecha;
    }
    
    
    protected void avanzar10Min() {
        this.reloj.setMinutos(reloj.getMinutos()+10);;
        
    }

    protected void retroceder10Min() {
        this.reloj.setMinutos(reloj.getMinutos()-10);;
    }

    protected void avanzar1hora(){
        this.reloj.setHora(reloj.getHora()+1);;
    }

    protected void retroceder1hora(){
        this.reloj.setHora(reloj.getHora()-1);;
    }

    protected void pausarTiempo(){
        reloj.pausarReloj();
    }

    protected void onTiempo(){
        reloj.onReloj();
    }

    protected String getHorarioActual(){
        return reloj.getHorarioActual();
    }


   /*  protected Time getMediaTime() {
        return javaMediaPlayer.getMediaTime();
    }

    protected Time getDuration() {
        return javaMediaPlayer.getDuration();
    }

    
    public static String timeToHuman(Time t) {
        int totalSeconds = (int)t.getSeconds();
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    } */
    
}
