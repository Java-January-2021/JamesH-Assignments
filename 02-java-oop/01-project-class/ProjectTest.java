public class ProjectTest {
    public static void main(String[] args) {
        Project projectOne = new Project("Coffee Robot", "A robot that makes and brings you coffee!");
        System.out.println(projectOne.elevatorPitch());
        projectOne.setDescription("A robot that makes and brings you coffee with cream and sugar!");
        System.out.println(projectOne.elevatorPitch());

        Project projectTwo = new Project();
        projectTwo.setName("Chem Lab");
        projectTwo.setDescription("Makes desired elements and compounds from various inputs!");
        System.out.println(projectTwo.elevatorPitch());
    }
}