import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // Scanner to recieve user names

    String[] Students = new String[15];
    // String array of the names

    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    // Intiatlize seat variables 1-15

    for (int i = 0; i <= 14; i++) {
      System.out.println("What is your students name?");
      Students[i] = scan.next();
    }
    // Create a for loop to ask for the names according to the seat number with the scanner 

    int count = 0;

    while (count <= 14) {
      System.out.println(Students[count] + " is going to sit in #" + seats[count]);
      count++;
      // This does the final print of the user's names and seat number