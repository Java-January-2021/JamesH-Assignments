import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava solver = new PuzzleJava();

        //1.)
        int[] arrayA = {3,5,1,2,7,9,8,13,25,32};
        int sum = solver.sumTheArray(arrayA);
        ArrayList<Integer> gT10 = solver.greaterThanTenArray(arrayA);
        System.out.println("Sum: " + sum);
        System.out.println("Greater than 10: " + gT10);

        //2.)
        String[] arrayB = {"Nancy","Jinichi","Fujihayashi","Momochi","Ishikawa"};
        System.out.println("Original list: " + Arrays.asList(arrayB));
        String[] shuff = solver.arrayShuffler(arrayB);
        System.out.println("Shuffled list: " + Arrays.asList(shuff));

        ArrayList<String> arrayListB = new ArrayList<String>();
        Collections.addAll(arrayListB, arrayB);
        ArrayList<String> mT5 = solver.moreThan5Char(arrayListB);
        System.out.println("More than five characters: " + mT5);
        
        //3.)
        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Character[] shuffed = solver.charArrayShuffler(alphabet);
        System.out.println(Arrays.asList(shuffed));
        System.out.println("First: " + shuffed[0]);
        System.out.println("Last: " + shuffed[25]);
        Character[] vowel = {'a','e','i','o','u'};
        for(int v = 0; v < vowel.length; v++) {
            if(vowel[v] == shuffed[0]) {
                System.out.println("First letter is a vowel!"); 
            }
        }

        //4, 5)
        int[] rando = solver.randomIntArray(55, 100);
        System.out.println(Arrays.toString(rando));

        //6.)
        Character randChar = solver.randomChar();
        String randString = "";
        for(int i = 0; i < 5; i++) {
            randChar = solver.randomChar();
            randString = randString + randChar;
        }
        System.out.println("Random string: " + randString);
        
        //7.)
        String[] randoArray = new String[10];
        for(int i = 0; i < randoArray.length; i++) {
            randString = "";
            for(int j = 0; j < 5; j++) {
                randChar = solver.randomChar();
                randString = randString + randChar;
            }
            randoArray[i] = randString;
        }
        System.out.println("Array of random strings: " + Arrays.toString(randoArray));
    }
}