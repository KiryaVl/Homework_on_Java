package HomeWorkTasks.OOP.Task2;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Paladin> paladins = new Team<>();
        archers.addPersons(new Archer("Robbin", 100, new Bow(20), new Shield()));
        archers.addPersons(new Archer("Goblin", 105, new Bow(15), new Shield()));
        paladins.addPersons(new Paladin("Dominik", 100, new Knife(), new Shield()));
        paladins.addPersons(new Paladin("Keskulla", 110, new Knife(), new Shield()));
        Paladin paladin1 = new Paladin("Robbin", 100, new Knife(), new Shield());
        Paladin paladin2 = new Paladin("Marmot", 100, new Knife(), null);
        Battle fight  = new Battle(archers, paladins);
//        for (int i = 0; i < paladins.persons.size(); i++) {
//            for (int j = 0; j < archers.persons.size(); j ++) {
//                fight = new Battle(paladins.persons.get(i), archers.persons.get(j));
//                warriorTeam = fight.run();
//            }
//        }
        //fight.run();
    }
}
