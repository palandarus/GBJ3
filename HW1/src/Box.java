import org.w3c.dom.ls.LSOutput;

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
        if (arrayList.isEmpty()) arrayList.add(t);
        else {
            if (isSameTypeFruit(t)) arrayList.add(t);
            else System.out.println("Вы пытаетесь положить не тот тип фрукта - надо " + arrayList.get(0).getClassName() +
                    ", а это " + t);
        }

    }

    public boolean isSameTypeFruit(T t) {
        return arrayList.get(0).getClass().equals(t.getClass());
    }

    public boolean putIn(Box<T> box) {
        if (isSameTypeFruit(box.getArrayList().get(0))) {
            arrayList.addAll(box.getArrayList());
            return true;
        } else {
            System.out.println("Вы пытаетесь пересыпать коробку с "+ box.getArrayList().get(0).getClassName()+ "ами " +", а это коробка с "+ arrayList.get(0).getClassName()+ "ами ") ;
            ;
            return false;
        }
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
        if (!arrayList.isEmpty()) {
            if (box.putIn(this)) empty();
        } else System.out.println("Коробку пуста, нечего перекладывать");
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void empty() {
        arrayList.clear();
    }
}
