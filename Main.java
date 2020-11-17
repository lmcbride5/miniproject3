class Main {
  public static void main(String[] args) {
    int [] seats = { 1 , 2, 3 , 4 , 5 ,6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15}; 
// Intiatlize seat variables 1-15
    String[] Students = new String [15]; 
//String array of the names 
    for (int i = 15 ; i < Students.length; i++) {
      System.out.println("What is your name?" + seats); 

      System.out.println(Students[i]); 
// Create a for loop to ask for the names according to the seat number.  
      stringScanner Students = new Scanner(System.in);
        System.out.println("Enter name");
        String name = Students.nextLine();

     }
    }
  }