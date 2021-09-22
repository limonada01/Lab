package timeMachine;

import java.util.Date;
import java.util.concurrent.Semaphore;


public class Reloj implements Runnable {
    private int hora;
    private int minutos;
    Semaphore flag= new Semaphore(1);

    public Reloj(){
        Date actual=new Date();
        this.hora=actual.getHours();
        this.minutos=actual.getMinutes();
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinutos(){
        return this.minutos;
    }

    public void setHora(int hora){
        this.hora=hora%24;
    }

    public void setMinutos(int minutos){
        this.minutos=minutos%60;
    }

    public String getHorarioActual(){
        return this.hora+":"+this.minutos;
    }

    public void pausarReloj(){
        try {
            flag.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void onReloj(){
        flag.release();
    }
    @Override
    public void run() {
        
        while(true){
            try {
                flag.acquire();
                Thread.sleep(60000);
                minutos+=1;
                if(minutos==60){
                    minutos=0;
                    hora=(hora+1)%24;
                }
                flag.release();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
