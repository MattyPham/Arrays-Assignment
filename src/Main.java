import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Array Practice Problem 1
        int one = 0;
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) ((Math.random()*6)+1);
            if (arr[i] == 1){
                one++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("There are " +one+ "1's in this line of numbers.");
        System.out.println("---------------------------------------------------------------------");
        //Array Practice Problem 2
        int totalsum = 0;
        int[] arr2 = new int[10];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = (int) ((Math.random()*100)+1);
            totalsum += arr2[i];
        }
        int t = totalsum / 10;
        System.out.println(Arrays.toString(arr2));
        System.out.println("The total sum of these numbers equate to " +totalsum);
        System.out.println("Meaning that the average of the total numbers equate to " +t);
        System.out.println("---------------------------------------------------------------------");
        int change = arr2[2];
        arr2[2] = arr2[7];
        arr2[7] = change;
        System.out.println(Arrays.toString(arr2));
        System.out.println("Numbers " +arr2[7]+ " and " +arr2[2]+ " have been swapped");
        System.out.println("---------------------------------------------------------------------");
        int zero = arr2[0];
        int oneth = arr2[1];
        int two = arr2[2];
        int three = arr2[3];
        int four = arr2[4];
        int five = arr2[5];
        int six = arr2[6];
        int seven = arr2[7];
        int eight = arr2[8];
        int nine = arr2[9];

        arr2[9] = zero;
        arr2[8] = oneth;
        arr2[7] = two;
        arr2[6] = three;
        arr2[5] = four;
        arr2[4] = five;
        arr2[3] = six;
        arr2[2] = seven;
        arr2[1] = eight;
        arr2[0] = nine;

        System.out.println(Arrays.toString(arr2));
        System.out.println("Here are the numbers now in reversed order.");


        







    }
}
