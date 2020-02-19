public class Apple extends Fruit {
    static int number=0;
    public Apple() {
        number++;
    }

    @Override
    public Float getWeight() {
        return 1.0f;
    }

}
