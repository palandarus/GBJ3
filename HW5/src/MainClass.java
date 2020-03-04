
import java.util.concurrent.*;

public class MainClass {
    public static final int CARS_COUNT = 1000;


    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(CARS_COUNT,new Road(60), new Tunnel(CARS_COUNT/2), new Road(40));

        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        race.startCD.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        race.endCD.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        if(race.getWinnerList().size()>1) System.out.println("Победили несколько участников");
        for (Car car:race.getWinnerList()
             ) {
            System.out.println("Победитель - "+car.getName());
        }

        for (int i = 0; i < cars.length; i++) {
            if(!cars[i].isFinished()) System.out.println("Участник "+cars[i].getName()+" не смог закончить гонку");
        }
    }
}










