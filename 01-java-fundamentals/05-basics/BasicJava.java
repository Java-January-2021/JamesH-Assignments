import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
    public static void main(String[] args) {
        //Print 1-255
        for(int i = 0; i <= 255; i++) {
            System.out.println(i);
        }
        //Print odd numbers between 1-255
        for(int i2 = 0; i2 <= 255; i2++) {
            if (i2 % 2 != 0) {System.out.println(i2);}
        }
        //Print sum
        int sum = 0;
        for(int i3 = 0; i3 <= 255; i3++) {
            sum = sum + i3;
            System.out.println("New number: " + i3 + " Sum: " + sum);
        }
        //Iterating through an array
        int[] arrayX = {1,3,5,7,9,13};
        for(int i4 = 0; i4 < arrayX.length; i4++) {
            System.out.println(arrayX[i4]);
        }
        //Find Max
        int[] arrayY = {-11,-8,-4,-6,-15};
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < arrayY.length; j++) {
            if(arrayY[j] > max) {
                max = arrayY[j];
            }
        }
        System.out.println("Max: " + max); 
        //Get average
        int[] arrayZ = {2,10,3};
        int sumZ = 0;
        int lengthZ = arrayZ.length;
        for(int k = 0; k < arrayZ.length; k++) {
            sumZ = sumZ + arrayZ[k];
        }
        int avg = sumZ / lengthZ;
        System.out.println(avg);
        //Array with odd numbers
        ArrayList<Integer> oddNum = new ArrayList<Integer>();
        for(int l = 0; l <= 255; l++) {
            if(l % 2 != 0){
                oddNum.add(l);
            }
        }
        System.out.println(oddNum);
        //Greater than Y
        int[] arrayA = {1,3,5,7};
        int countA = 0;
        int varY = 3;
        for(int m = 0; m < arrayA.length; m++) {
            if(arrayA[m] > varY) {
                countA = countA + 1;
            }
        }
        System.out.println(countA);
        //Square the values
        int[] arrayB = {1,5,10,-2};
        for(int n = 0; n < arrayB.length; n++) {
            arrayB[n] = arrayB[n] * arrayB[n];
            System.out.println(arrayB[n]);
        }
        //Eliminate negative numbers
        int[] arrayC = {1,5,10,-2};
        for(int o = 0; o < arrayC.length; o++) {
            if(arrayC[o] < 0) {
                arrayC[o] = 0;
            }
            System.out.println(arrayC[o]);
        }
        //Max, min, average
        int[] arrayD = {1,5,10,-2};
        int maxD = Integer.MIN_VALUE;
        int minD = Integer.MAX_VALUE;
        int sumD = 0;
        for(int p = 0; p < arrayD.length; p++) {
            if(arrayD[p] > maxD) {
                maxD = arrayD[p];
            }
            if (arrayD[p] < minD) {
                minD = arrayD[p];
            }
            sumD = sumD + arrayD[p];
        }
        int avgD = sumD / arrayD.length;
        int[] mMA = {maxD, minD, avgD};
        System.out.println(Arrays.toString(mMA));
        //Shifting the values in the array
        int[] arrayE = {1,5,10,7,-2};
        for(int q = 0; q < arrayE.length; q++) {
            if(q < arrayE.length - 1) {
                arrayE[q] = arrayE[q+1];
            }
            else arrayE[q] = 0;
        }
        System.out.println(Arrays.toString(arrayE));
    }
}