public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    super.introduce();
    System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    return skippedDays += numberOfDays;
  }

  @Override
  public Student clone() {
    return new Student(this.name, this.age, this.gender, this.previousOrganization);
  }
}
