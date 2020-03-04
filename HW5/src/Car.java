import org.w3c.dom.ls.LSOutput;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private boolean finished=false;

    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
          System.out.println(this.name + " готовится");
            Thread.sleep(500 /*+ (int) (Math.random() * 800)*/);
            System.out.println(this.name + " готов");
            race.startCD.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            race.startCD.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        race.setWinner(this);
        race.endCD.countDown();
        System.out.println(this.name + " пересек финишную черту");
        finished=true;
    }
    public boolean isFinished(){
        return finished;
    }
}