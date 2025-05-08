public class Guest extends SchoolPerson {
  private String school;
  public Guest(String name, int grade, String school) {
    super(name, grade);
    this.school = school;
  }
  public String getSchool() {
    return school;
  }
  public String toString() {
    return name + " " + grade + " " + school;
  }
}