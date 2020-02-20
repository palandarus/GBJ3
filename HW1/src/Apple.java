public class Apple extends Fruit {
    static int number=0;
    public Apple() {
        name="Яблоко";
        this.weight=1.0f;
        number++;
    }

    @Override
    public Float getWeight() {
        return 1.0f;
    }

}
