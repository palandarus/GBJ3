public class Orange extends Fruit {
    static int number = 0;

    public Orange() {
        this.weight = 1.5f;
        number++;
        name = "Апельсин № " + number;
    }

    @Override
    public Float getWeight() {
        return weight;
    }
}
