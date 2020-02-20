public class Apple extends Fruit {
    static int number = 0;

    public Apple() {
        this.weight = 1.0f;
        number++;
        name = "Яблоко № " + number;
    }

    @Override
    public Float getWeight() {
        return 1.0f;
    }

}
