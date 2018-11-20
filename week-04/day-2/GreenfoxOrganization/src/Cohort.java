import java.util.ArrayList;
import java.util.List;

public class Cohort {

  String name;
  List<Student> students;
  List<Mentor> mentors;

  Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student newStudent) {
    students.add(newStudent);
  }

  public void addMentor(Mentor newMentor) {
    mentors.add(newMentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
