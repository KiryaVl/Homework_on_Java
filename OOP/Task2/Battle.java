package HomeWorkTasks.OOP.Task2;

public class Battle {
    private Warrior attacker;
    private Warrior defender;
    private Warrior temp;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }
    public Warrior run(){
        while (true) {
            int attack = attacker.harm();
            temp = attacker;
            if (!defender.secondWeapon.block()) {
                defender.reduceHp(attack);
                System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n ", temp.getName(), attack, defender.getName(), defender.getHp());
                if (!defender.isAlive()) {
                    System.out.printf("\nWarrior %s is dead, %s winner! ", defender.getName(), temp.getName());
                    System.out.println(temp);
                    break;
                }
                else {
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
            }
            else {
                System.out.println("Blocked");
            }
    } return null;
    }
}
