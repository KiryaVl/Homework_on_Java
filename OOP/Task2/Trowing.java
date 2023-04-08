package HomeWorkTasks.OOP.Task2;

public abstract class Trowing implements Weapon, SecondWeapon{
    private int distance;
    private boolean secondWeapon;


    public Trowing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    @Override
    public  String toString(){
        return "Trowing" +
                " distance: " + distance +
                " damage: " + damage();
    }
}
