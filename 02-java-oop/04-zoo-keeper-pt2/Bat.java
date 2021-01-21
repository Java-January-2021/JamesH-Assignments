public class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300;
    }
    public void fly() {
        System.out.println("Cheep, cheep, flap, flap, flap!");
        energyLevel -= 50;
        System.out.println("Energy level: " + energyLevel);
    }
    public void fly(int numOfTimes) {
        System.out.println("Cheep, cheep, flap, flap, flap " + numOfTimes + " times!");
        energyLevel -= 50 * numOfTimes;
        System.out.println("Energy level: " + energyLevel);
    }
    public void eatHumans() {
        System.out.println("Chomp Chomp!");
        energyLevel += 25;
        System.out.println("Energy level: " + energyLevel);
    }
    public void eatHumans(int numOfTimes) {
        System.out.println("Chomp Chomp " + numOfTimes + " times!");
        energyLevel += 25 * numOfTimes;
        System.out.println("Energy level: " + energyLevel);
    }
    public void attackTown() {
        System.out.println("The town crackles, embers, and burns!");
        energyLevel -= 100;
        System.out.println(energyLevel);
    }
    public void attackTown(int numOfTimes) {
        System.out.println("The town crackles, embers, and burns " + numOfTimes + " times!");
        energyLevel -= 100 * numOfTimes;
        System.out.println("Energy level: " + energyLevel);
    }
}