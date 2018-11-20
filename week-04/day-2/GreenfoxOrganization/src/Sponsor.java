public class Sponsor extends Person {

  String company;
  int hiredStudents;

  Sponsor() {
    super();
    company = "Google";
    hiredStudents = 0,
  }

  Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = hiredStudents;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public int hire(int hiredStudents) {
    return hiredStudents += 1;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
