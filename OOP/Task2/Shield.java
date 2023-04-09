package HomeWorkTasks.OOP.Task2;

import java.util.Random;

public class Shield implements SecondWeapon {
    int shield = 7;
    private Random random = new Random();
    @Override
    public boolean block() {
        if (shield > 0 && random.nextInt(10) < 2) {
            shield-- ;
            return  true;
        }
        return false;
    }
}