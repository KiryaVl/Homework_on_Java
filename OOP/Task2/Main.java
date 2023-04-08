package HomeWorkTasks.OOP.Task2;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Paladin> paladins = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), new Shield()))
                .addPersons(new Archer("Bobbin", 105, new Bow(15), new Shield()));
        paladins.addPersons(new Paladin("Omnik", 120, new Knife(), new Shield()))
                .addPersons(new Paladin("Kutikula", 180, new Knife(), new Shield()));
        Paladin paladin1 = new Paladin("Robbin", 100, new Knife(), new Shield());
        Paladin paladin2 = new Paladin("Marmot", 100, new Knife(), new Shield());
        Battle fight  = new Battle(paladin1, paladin2);
        fight.run();
    }
}
