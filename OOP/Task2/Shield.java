package HomeWorkTasks.OOP.Task2;

import java.util.Random;

public class Shield implements SecondWeapon {

    private Random random = new Random();
    @Override
    public boolean block() {
        return random.nextBoolean();
    }
}