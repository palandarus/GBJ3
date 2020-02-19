import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> arrayList;

    public Box() {
        arrayList = new ArrayList<T>();
    }

    public Box(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public void putIn(T t) {
        arrayList.add(t);

    }

    public void putIn(Box<T> array) {
    arrayList.addAll(array.getArrayList());
    }

    public void putIn(ArrayList<T> arrayList) {
        this.arrayList.addAll(arrayList);
    }

    public void putOut(T t) {
        arrayList.remove(t);
    }

    public void putOutLast() {
        arrayList.remove(arrayList.size() - 1);
    }


    public void putOut(Box<T> array) {

    }

    public boolean compare(Box box) {
        return getWeight().compareTo(box.getWeight()) == 0;

    }

    public Float getWeight() {
        float weight = 0;
        for (T t : arrayList
        ) {
            weight += t.getWeight();
        }
        return weight;
    }

    public void putInOtherBox(Box<T> box) {
        box.putIn(this);
        empty();
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void empty() {
        arrayList.clear();
    }
}
