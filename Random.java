package FeetNumber;


/*
Mila 
This program randomly generates an integer between 1 and 12 and 
displays the English month names January, February, ... December for the numbers 
1,2, ... 12, accordingly.

Random.java
*/

public class Random {

	public static void main(String[] args) { 
		int min =1; //declare the min of range
		int max =13; //declare the max of range
        int random = (int)(Math.random()*max+min); //declare random number using math class random method
        switch (random) { //output random numbers in names of month using switch 
        
    case 1:
        System.out.println("January");
        break;

      case 2:
        System.out.println("February");
        break;

      case 3:
        System.out.println("March");
        break;

      case 4:
        System.out.println("April");
        break;

      case 5:
        System.out.println("May");
        break;

      case 6:
          System.out.println("June");
          break;
      case 7:
          System.out.println("July");
          break;
      case 8:
          System.out.println("August");
          break;
      case 9:
          System.out.println("September");
          break;
      case 10:
          System.out.println("October");
          break;
      case 11:
          System.out.println("November");
          break;
      case 12:
          System.out.println("December");
          break;
}
	}
}

