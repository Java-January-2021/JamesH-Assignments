public class Mammal {
    protected int energyLevel = 100;

     public int displayEnergy() {
         System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
    public int mammal(int energy){
        return this.energyLevel = energy;
    }
}
