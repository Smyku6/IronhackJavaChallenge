
public class Challenge {

  public void lineBreak() { 
    System.out.println("-------------------------");
  }

  //Challenge 1: Find Maximum
  //Write a method maximum that returns the largest integer in the list. You can assume that the list has at least one element");
	public int maximum(int[] numList) {
		int max=numList[0];
		  // for(int i=0;i<numList.length;i++) {
			//   if (numList[i]>max) {
			// 	  max=numList[i];
			// }
		  for(int number : numList) {
			  if (number>max) {
				  max=number;
			}
		}
		return max;
	}

  //Challenge 2: Print number in word
  //Write a program called printNumberInWord which prints `ONE`, `TWO`,... , `NINE`, `OTHER` if the int variable `number` is 1, 2,... , 9, or other, respectively. Use:");
  public String printNumberInWordIf(int num) {
    String numberString="";
    if (num == 1){
      numberString="ONE";  
    } else if (num == 2){
      numberString="TWO";
    } else if (num == 3){
      numberString="THREE";
    } else if (num == 4){
      numberString="FOUR";
    } else if (num == 5){
      numberString="FIVE";
    } else if (num == 6){
      numberString="SIX";
    } else if (num == 7){
      numberString="SEVEN";
    } else if (num == 8){
      numberString="EIGHT";
    } else if (num == 9){
      numberString="NINE";
    } else {
      numberString="OTHER";
    }
  return numberString;
  }

  public String printNumberInWordSwitch(int num) {
    String numberString="";
    switch(num){
      case 1:
        numberString=("ONE");
        break;
      case 2:
        numberString=("TWO");
        break;
      case 3:
        numberString=("THREE");
        break;
      case 4:
        numberString=("FOUR");
        break;
      case 5:
        numberString=("FIVE");
        break;
      case 6:
        numberString=("SIX");
        break;
      case 7:
        numberString=("SEVEN");
        break;
      case 8:
        numberString=("EIGHT");
        break;
      case 9:
        numberString=("NINE");
        break;
      default:
      numberString=("OTHER");
        break;
    }
  return numberString;
}

  //Challenge 3: Check Odd/Even
	//Write a method called checkOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0.");

  public void checkOddEven(int num) { 
    if (num % 2 == 0){
      System.out.println("Random number " + num + " is EVEN");
    } else {
      System.out.println("Random number " + num + " is ODD");
    }
  }

  //Challenge 4: Calculate the average
	//Write a method average that returns the average of the integer in the list. You can assume that the list has at least one element.

  public double average(int[] numList) { 
    double sum=0;
		for(int number : numList) {
      sum += number;
		}
		return sum / numList.length;
  }
}
  