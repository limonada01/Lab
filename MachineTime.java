package timeMachine;

import java.util.Date;

public class MachineTime {
    
   
    private Date fecha;
    private Estado state;

    public MachineTime(String folderPath) {
        fecha = new Date();
        
       /*  try {
            
            state = new EstadoDetenido(this);
        } catch (IOException e) {
            e.printStackTrace();
        } */
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
    
    
    protected void saltarUnMes() {
        this.fecha.setMonth(this.fecha.getMonth()+1);
        
    }

    protected void retrocederUnMes() {
        this.fecha.setMonth(this.fecha.getMonth()-1);
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
