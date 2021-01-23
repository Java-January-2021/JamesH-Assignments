public class Wizard extends Human {
    public Wizard() {
        health = 50;
    }
    protected int intelligence = 8;
    public void heal(Human target) {
        target.health += this.intelligence;
    }
    public void fireball(Human target) {
        target.health -= (this.intelligence * 3);
    }
}