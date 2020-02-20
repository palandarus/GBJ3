 abstract class Fruit {
    protected Float weight;
    protected String name="Fruit";
    public abstract Float getWeight();

     @Override
    public String toString(){
         return name;
     }
 }
