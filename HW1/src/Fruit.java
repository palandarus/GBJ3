 abstract class Fruit {
    protected Float weight;
    protected String name="Фрукт";
    protected String classname="Фрукт";
    public abstract Float getWeight();

     @Override
    public String toString(){
         return name;
     }
     public String getClassName(){
         return classname;
     }
 }
