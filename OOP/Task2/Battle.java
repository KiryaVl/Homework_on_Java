package HomeWorkTasks.OOP.Task2;

import java.util.LinkedList;

public class Battle {
    private Warrior attacker;
    private Warrior defender;
    private Warrior temp;

    private Warrior tempAttacker;
    private Warrior tempDefender;
    private LinkedList champions = new LinkedList<>();

    public Battle(Team attackers, Team defenders) {
        for (int i = 0; i < attackers.persons.size(); i++) {
            tempAttacker = (Warrior) attackers.persons.get(i);
            for (int j = 0; j < defenders.persons.size(); j++) {
                tempDefender = (Warrior) defenders.persons.get(i);
                this.attacker = tempAttacker;
                this.defender = tempDefender;
            }
            champions = run();
        }
        System.out.println("Champions! " + champions);
    }

//    public Battle(Warrior attacker, Warrior defender) {
//        this.attacker = attacker;
//        this.defender = defender;
//    }
    public LinkedList run(){
        while (true) {
            int attack = attacker.harm();
            temp = attacker;
            if (defender.secondWeapon != null) {
                if (!defender.secondWeapon.block()) {
                    defender.reduceHp(attack);
                    System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n ", temp.getName(), attack, defender.getName(), defender.getHp());
                    if (!defender.isAlive()) {
                        champions.add(attacker.getName());
                        System.out.printf("\nWarrior %s is dead, %s winner! ", defender.getName(), temp.getName());
                        System.out.println(temp);
                        break;
                    } else {
                        attacker = defender;
                        defender = temp;
                    }

//                else if (defender.isAlive()){
//                    attack = defender.harm();
//                    attacker.reduceHp(attack);
//                    System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n ", defender.getName(), attack, attacker.getName(), attacker.getHp());
//                    if (!defender.isAlive()) {
//                        System.out.printf("\nWarrior %s is dead, %s winner! ", attacker.getName(), defender.getName());
//                        System.out.println(defender);
//                        break;
//                    }
//            }
                } else {
                    System.out.printf("%s blocked %s attack\n",defender.getName(), attacker.getName());
                    attacker = defender;
                    defender = temp;
                }
            }
            else {
                defender.reduceHp(attack);
                System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n ", temp.getName(), attack, defender.getName(), defender.getHp());
                if (!defender.isAlive()) {
                    champions.add(attacker.getName());
                    System.out.printf("\nWarrior %s is dead, %s winner! ", defender.getName(), temp.getName());
                    System.out.println(temp);
                    break;
                } else {
                    attacker = defender;
                    defender = temp;
                }
            }
        }
            return champions;
        }
}
