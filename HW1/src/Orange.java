public class Orange extends Fruit {
    static int number=0;
    public Orange() {
        name="Апельсин";
        this.weight=1.5f;
        number++;
    }

    @Override
    public Float getWeight() {
        return weight;
    }
}
