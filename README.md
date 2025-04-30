# schoolDance
School Dance Ticket Sales
Final Project Due: Friday, May 16th
First (and only) Checkpoints Due: Friday May 9th
 Complete in VSCode
 Zip your project folder with
all java source files
a file (PDF, TXT, etc) of your output
 a .txt file showing the data stored as you run the program
Description:
Scenario: Your principal has heard that you are good at programming and has asked you to create
a program that will assist the student council in selling tickets to the school dance on Friday. The
principal states that only students in grades 9-12 are allowed into the dance, and only students that
are in grades 10-12 are allowed to bring a guest. The guest must also be in grades 10-12. Tickets
are $10 for each person.
You will create a command-line program that will allow the person selling the tickets to keep inputting
information instead of having to keep restarting the program. It will collect data of all tickets sold and
then store that data in a txt file at the end of the ticket selling session.
Specifications:
 The program should first ask: “Would you like to start the AMCHS ticket sales program? (Y/N) “
 Then it should ask “Do you have a previous data file to upload first? (Y/N) “
  If you answer Y to the second question, ask the user for the name of the data file.
Upload the data in the file, parse it and and store the data in the ArrayList of objects in your
code. See Java Coding concepts later in this document.
 The program should ask for the current date.
 Then it should start asking for the following information from the student(s):
● Name
● Grade
 If they can attend the dance, assign a $10 ticket to them. Otherwise, state that they cannot attend
the dance, “skip” to (12) below.
 If they can bring a guest, Ask “Would you like to bring a guest? (Y/N) “
 If they say “Y”, ask the following information about the guest:
● Name
● Grade
● School they attend
 If the guest is not in grade 10-12, state that they cannot bring a gues.. The name/grade/school
data will not be stored.
 After it has completed the input for one student and possible guest, it should request ticket $.
 The program should now ask “Would you like to continue? (Y/N) “
 Store the data you just collected (one for the student, one/none for the guest) in the ArrayList.
 If Y, go then go to (5) above. If N, the program should exit with a summary. See example output
below.
 When it exits, it should also save all data stored in the ArrayList as line output to a .txt file. Next
session will read in ClassDanceData.txt. Example, ClassDanceData.txt:
John 10 Y $20
sally 10 cshs
tito 9 N $10
EXAMPLE output for the program:
*** Welcome to Tiger Dance Ticket Sales ***
Would you like to start a ticket sales session? (Y/N) Y
Do you have a data file to upload from a previous session? (Y/N) Y
Enter data txt file name: (danceData.txt): danceData.txt
Enter Student's Name: lisa
Enter Student's Grade: 12
Does student want to bring a guest? (Y/N) Y
Enter Guest's Name: bill
Enter Guest's Grade: 12
Enter Guest's School: amchs
Please collect $20 from student for their ticket plus guest ticket.
Would you like to continue? (Y?N) Y
Enter Student's Name: jon
Enter Student's Grade: 9
Student cannot bring a guest, please collect $10 for student's ticket.
Would you like to continue? (Y?N) Y
Enter Student's Name: marcel
Enter Student's Grade: 10
Does student want to bring a guest? (Y/N) N
Please collect $10 for student's ticket.
Would you like to continue? (Y?N) Y
Enter Student's Name: sara
Enter Student's Grade: 10
Does student want to bring a guest? (Y/N) Y
Enter Guest's Name: mike
Enter Guest's Grade: 9
Enter Guest's School: cshs
Guest cannot attend dance. Guest must be in grades 10-12.
Please collect $10 for student's ticket.
Would you like to continue? (Y?N) N
************************************************
The ticket sales for today is: $50
The ticket sales for all sessions is: $ 80
The total number of students attending is: 6
The total number of guests attending is 2
The number of seniors attending is: 2
The number of juniors attending is: 0
The number of sophomores attending is: 4
The number of freshman attending is: 2