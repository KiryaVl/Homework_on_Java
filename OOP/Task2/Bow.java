package HomeWorkTasks.OOP.Task2;

public class Bow extends Trowing{
    private final String name;

    public Bow(int distance) {
        super(distance);
        this.name = "Bow";
    }

    @Override
    public Integer damage() {
         if (getDistance() > 10)
             return 20;
         return 10;
    }

    @Override
    public String toString() {
        return "Bow " + name +
               super.toString() ;
    }

    @Override
    public boolean block() {
        return false;
    }
}
