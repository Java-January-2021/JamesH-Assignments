public class Samurai extends Human{
    public void deathBlow(Human target) {
        target.health = 0;
        this.health = this.health / 2;
    }
    public void meditate() {
        this.health += this.health / 2;
    }
    private static int numSamurai = 0;
    public static int howMany() {
        return Samurai.numSamurai;
    }
    public Samurai() {
        health = 200;
        Samurai.numSamurai += 1;
    }
}