public class Gorilla extends Mammal {
    
    public void throwSomething() {
        System.out.println("Gorilla throws stuff!");
        energyLevel -= 5;
        System.out.println("Energy level: " + energyLevel);
    }
    public void throwSomething(int numOfTimes) {
        System.out.println("Gorilla throws stuff " + numOfTimes + " times!");
        energyLevel -= 5 * numOfTimes;
        System.out.println("Energy level: " + energyLevel);
    }
    public void eatBanana() {
        System.out.println("Gorilla eats bananas");
        energyLevel += 10;
        System.out.println(energyLevel);
    }
    public void eatBanana(int numOfTimes) {
        System.out.println("Gorilla eats bananas " + numOfTimes + " times!");
        energyLevel += 10 * numOfTimes;
        System.out.println(energyLevel);
    }
    public void climb() {
        System.out.println("Gorilla climbs!");
        energyLevel -= 10;
        System.out.println(energyLevel);
    }
    public void climb(int numOfTimes) {
        System.out.println("Gorilla climbs " + numOfTimes + " times!");
        energyLevel -= 10 * numOfTimes;
        System.out.println(energyLevel);
    }

}