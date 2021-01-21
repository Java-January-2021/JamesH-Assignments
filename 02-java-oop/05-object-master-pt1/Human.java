public class Human{
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public void attack(Human target) {
        target.health -= this.strength;
        String name = target.toString();
        System.out.println(name + " was attacked for " + this.stealth + " damage!");
    }
}