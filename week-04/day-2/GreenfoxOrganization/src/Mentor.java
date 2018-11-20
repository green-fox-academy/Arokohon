public class Mentor extends Person {

  String level;

  Mentor() {
    super();
    level = "intermediate";
  }

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
