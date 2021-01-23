public class DandDTest {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        Wizard vivi = new Wizard();
        Samurai jack = new Samurai();
        System.out.println("Health: " + "naruto " + naruto.health + ", vivi " + vivi.health + ", jack " + jack.health);
        naruto.steal(vivi);
        System.out.println("Health: " + "naruto " + naruto.health + ", vivi " + vivi.health + ", jack " + jack.health);
        naruto.runAway();
        vivi.fireball(naruto);
        vivi.heal(vivi);
        vivi.attack(jack);
        System.out.println("Health: " + "naruto " + naruto.health + ", vivi " + vivi.health + ", jack " + jack.health);
        jack.deathBlow(vivi);
        jack.meditate();
        System.out.println(Samurai.howMany());
        System.out.println("Health: " + "naruto " + naruto.health + ", vivi " + vivi.health + ", jack " + jack.health);
        
    }
}