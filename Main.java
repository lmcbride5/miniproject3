import java.util.Scanner; 
public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 
  //Scanner to recieve user names 

    int [] seats = { 1 , 2, 3 , 4 , 5 ,6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15}; 
// Intiatlize seat variables 1-15

    int[] Students = new int [15]; 
//String array of the names 

    for (int i = 0 ; i < Students.length; i++) {
      System.out.println("What is your name?" + seats); 

      Students[i] = scan.nextInt(); 
    }
// Create a for loop to ask for the names according to the seat number with the scanner  
    int count = 1; 
    while (count <= 15) 
      System.out.println(count); 
  }
}