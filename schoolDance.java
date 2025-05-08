import java.io.*;
import java.util.*;

public class schoolDance {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<SchoolPerson> people = new ArrayList<>();
    int totalToday = 0;
    System.out.println("*** Welcome to Tiger Dance Ticket Sales ***");
    System.out.print("Would you like to start the AMCHS ticket sales program? (Y/N): ");
    String start = in.nextLine();
    if (start.equalsIgnoreCase("y") || start.equalsIgnoreCase("yes")) {
      System.out.print("Do you have a previous data file to upload first? (Y/N): ");
      String hasFile = in.nextLine();
      if (hasFile.equalsIgnoreCase("y") || hasFile.equalsIgnoreCase("yes")) {
        System.out.print("Enter data txt file name: ");
        String filename = in.nextLine();
        try {
          Scanner fin = new Scanner(new File(filename));
          while (fin.hasNextLine()) {
            String line = fin.nextLine();
            String[] parts = line.split(" ");
            if (parts.length == 4 && parts[2].equalsIgnoreCase("Y")) {
              people.add(new Student(parts[0], Integer.parseInt(parts[1]), true));
              totalToday += 20;
            }
            else if (parts.length == 4 && parts[2].equalsIgnoreCase("N")) {
              people.add(new Student(parts[0], Integer.parseInt(parts[1]), false));
              totalToday += 10;
            }
            else if (parts.length == 3) {
              people.add(new Guest(parts[0], Integer.parseInt(parts[1]), parts[2]));
            }
          }
          fin.close();
        } 
        catch (Exception e) {
          System.out.println("Error reading file: " + e.getMessage());
        }
      }
      boolean keepGoing = true;
      while (keepGoing) {
        System.out.print("Enter Student's Name: ");
        String studentName = in.nextLine();
        System.out.print("Enter Student's Grade: ");
        int studentGrade = Integer.parseInt(in.nextLine());
        if (studentGrade < 9 || studentGrade > 12) {
          System.out.println("Student not eligible to attend.");
          continue;
        }
        boolean canBringGuest = studentGrade >= 10;
        boolean bringingGuest = false;
        int charge = 10;
        if (canBringGuest) {
          System.out.print("Does student want to bring a guest? (Y/N): ");
          String wantsGuest = in.nextLine();
          if (wantsGuest.equalsIgnoreCase("y") || wantsGuest.equalsIgnoreCase("yes")) {
            System.out.print("Enter Guest's Name: ");
            String guestName = in.nextLine();
            System.out.print("Enter Guest's Grade: ");
            int guestGrade = Integer.parseInt(in.nextLine());
            System.out.print("Enter Guest's School: ");
            String guestSchool = in.nextLine();
            if (guestGrade >= 10 && guestGrade <= 12) {
              Guest guest = new Guest(guestName, guestGrade, guestSchool);
              people.add(guest);
              bringingGuest = true;
              charge = 20;
            }
            else {
              System.out.println("Guest cannot attend dance. Guest must be in grades 10-12.");
            }
          }
        }
        System.out.println("Please collect $" + charge + " from student.");
        totalToday += charge;
        Student student = new Student(studentName, studentGrade, bringingGuest);
        people.add(student);
        System.out.print("Would you like to continue? (Y/N): ");
        String cont = in.nextLine();
        if (!(cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes"))) {
          keepGoing = false;
        }
      }
      // summary output
      int totalStudents = 0, totalGuests = 0;
      int seniors = 0, juniors = 0, sophomores = 0, freshmen = 0;
      for (SchoolPerson p : people) {
        if (p instanceof Student) {
          totalStudents++;
          int grade = p.getGrade();
          if (grade == 12)
            seniors++;
            else if (grade == 11) 
              juniors++;
               else if (grade == 10) 
                sophomores++;
                   else if (grade == 9) 
                    freshmen++;
                      if (((Student)p).isBringingGuest()) 
                        totalGuests++;
        }
      }

      System.out.println("\n************************************************");
      System.out.println("The ticket sales for today is: $" + totalToday);
      System.out.println("The total number of students attending is: " + totalStudents);
      System.out.println("The total number of guests attending is: " + totalGuests);
      System.out.println("The number of seniors attending is: " + seniors);
      System.out.println("The number of juniors attending is: " + juniors);
      System.out.println("The number of sophomores attending is: " + sophomores);
      System.out.println("The number of freshman attending is: " + freshmen);
      // write data to file
      try {
        FileWriter fw = new FileWriter("ClassDanceData.txt");
        for (SchoolPerson p : people) {
         fw.write(p.toString() + "\n");
        }
        fw.close();
      } 
      catch (IOException e) {
         System.out.println("Failed to write to file: " + e.getMessage());
      }
        }
         else {
            System.out.println("Aw man.");
        }

        in.close();
    }
}
