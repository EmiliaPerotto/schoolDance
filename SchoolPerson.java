public class SchoolPerson {
  protected String name;
  protected int grade;
  public SchoolPerson(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public String toString() {
    return name + " " + grade;
  }
}