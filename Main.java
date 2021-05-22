import java.util.Arrays;
import java.util.Random;

class Main {
  
  public static void main(String[] args) {

    Challenge challenge=new Challenge();


    challenge.lineBreak();
    System.out.println("CHALLENGE #1: Find Maximum");
		int[] numList={-33, 61, 53, -33, -32, -89, 56, -80, 90, -47, 35, -56, -48, 60, -61, 82, -23, -47, -15, 30, 79, 4};
 		System.out.println("Example of array: " + Arrays.toString(numList));
		int max=challenge.maximum(numList);
		System.out.println("Maximum number is: "+ max);

    challenge.lineBreak();
		System.out.println("CHALLENGE #2: Print number in word");

    Random rand = new Random();
    int upperbound = 12;
    int num=rand.nextInt(upperbound); 
    System.out.println("Random number as a digit is: "+ num);
    String numberString1=challenge.printNumberInWordIf(num);
    System.out.println("(IF) Random number as a word is: "+ numberString1);
    String numberString2=challenge.printNumberInWordSwitch(num);
    System.out.println("(SWITCH) Random number as a word is: "+ numberString2);

    challenge.lineBreak();
		System.out.println("CHALLENGE #3: Check Odd/Even");
    challenge.checkOddEven(num);
   
    challenge.lineBreak();
		System.out.println("CHALLENGE #4: Calculate the average");
    System.out.println("Average of the numList from Challenge #1 is " + challenge.average(numList));
    System.out.println("-------------------------");
	}
}