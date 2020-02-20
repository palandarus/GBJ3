public class Apple extends Fruit {
    static int number=0;
    public Apple() {
        name="Яблоко № "+number;
        this.weight=1.0f;
        number++;
    }

    @Override
    public Float getWeight() {
        return 1.0f;
    }

}
