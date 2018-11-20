public class Sponsor extends Person {

  String company;
  int hiredStudents;

  Sponsor() {
    super();
    company = "Google";
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public int hire() {
    return hiredStudents += 1;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
