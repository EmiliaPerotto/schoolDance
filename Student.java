public class Student extends SchoolPerson {
  private boolean bringingGuest;
  private int ticketCost;
   public Student(String name, int grade, boolean bringingGuest) {
    super(name, grade);
    this.bringingGuest = bringingGuest;
    this.ticketCost = 10;
  }
  public boolean isBringingGuest() {
    return bringingGuest;
  }
   public int getTicketCost() {
    return ticketCost;
    }

    public String toString() {
      return name + " " + grade + " " + (bringingGuest ? "Y" : "N") + " $" + ticketCost;
    }
}