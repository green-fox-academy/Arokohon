public class Person {

  String name;
  int age;
  String gender;

  Person (String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person person1 = new Person("Jane Doe", 30, "female");

  public static void introduce(String name, int age, String gender) {
    System.out.println("Hy, I'm " + name + ", " + age + "year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: live for the moment!");
  }
}
