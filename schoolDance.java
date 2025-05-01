import java.io.*;
import java.util.*;
public class schoolDance{
public static void main(String args[]) throws IOException {
  FileWriter fout = newFileWriter("ClassDanceData.txt");
 Scanner in = new Scanner(System.in);
  System.out.println("Would you like to start the AMCHS ticket sales program? (Y/N)");
  String start = in.nextLine();
  if(start.equalsIgnoreCase("yes") || start.equalsIgnoreCase('y')){
    System.out.println("Do you have a previous data file to upload first? (Y/N)");
    String data = in.nextLine();
    if(data.equalsIgnoreCase("yes") || data.equalsIgnoreCase('y')){
      System.out.println("Input filename: ");
      String filename = in.nextLine();
      Scanner fin = new Scanner(new File(filename));
      //array of objects
    }
    System.out.println("What is the date today?");//date
    String date = in.nextLine();
    System.out.println("What is the students name?");//name
    String name = in.nextLine();
    System.out.println("What is the students grade?");//grade
    //if the are in 10-12th grade they can bring guest
    //System.out.println("Would you like to bring a guest?");//guest
    System.out.println("You owe $");
    System.out.println("Would you like to continue?(Y/N)");//continue prompt
    if(start.equalsIgnoreCase("yes") || start.equalsIgnoreCase('y')){
      //reutrn to step 5
    }
    else{
      System.out.println("The ticket sales for today is: ");
      System.out.println("The ticket sales for all sessions is: ");
      System.out.println("The total number of students attending is: ");
      System.out.println("The total number of guests attending is: ");
      System.out.println("The number of seniors attending is: ");
      System.out.println("The number of juniors attending is: ");
      System.out.println("The number of sophomores attending is: ");
      System.out.println("The number of freshman attending is: ");
    }
  }
  else{
    System.out.println("Aw man");
  }
}
}