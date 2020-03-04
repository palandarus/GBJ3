
import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    public static Semaphore tunnelSemaphore;
    public Tunnel(int throughput) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        this.tunnelSemaphore=new Semaphore(throughput);
    }

    @Override
    public void go(Car c) {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                tunnelSemaphore.acquire();


                tunnelSemaphore.release();
            }

    }
    
}

