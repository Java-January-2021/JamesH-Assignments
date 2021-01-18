import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public int sumTheArray(int[] array1) {
        int sum = 0;
        for(int i = 0; i < array1.length; i++) {
            sum = array1[i] + sum;
        }
        return sum;
    }
    public ArrayList<Integer> greaterThanTenArray(int[] array1) {
        ArrayList<Integer> greaterThanTen = new ArrayList<Integer>();
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] > 10) {
                greaterThanTen.add(array1[i]);
            }
        }
        return greaterThanTen;
    }
    public String[] arrayShuffler(String[] array1) {
        Collections.shuffle(Arrays.asList(array1));
        return array1;
    }
    public ArrayList<String> moreThan5Char(ArrayList<String> array1) {
        ArrayList<String> mT5 = new ArrayList<String>();
        for( int i = 0; i < array1.size(); i++) {
            if(array1.get(i).length() > 5) {
                mT5.add(array1.get(i));
            }
        }
        return mT5;
    }
    public Character[] charArrayShuffler(Character[] array1) {
        Collections.shuffle(Arrays.asList(array1));
        return array1;
        
    }
   boolean isVowel(char letter) {
       return(
           letter == 'a' ||
           letter == 'e' ||
           letter == 'i' ||
           letter == 'o' ||
           letter == 'u');
   }
   public int[] randomIntArray(int lowerBound, int upperBound) {
        int[] array = new int[10];
        int offset = upperBound - lowerBound;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(offset) + lowerBound;
        }
        Arrays.sort(array);
        return array;
    }
    public Character randomChar() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }
        Random random = new Random();
        int randomNum = random.nextInt(25);
        return alphabet.get(randomNum);
    }
}