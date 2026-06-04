package cpsc2150.registration;

public class Main {

  public static void main(String[] args) {

    Student student = new Student("Matthew", true, 12);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    System.out.println(result.getMessage());
    System.out.println("Current credit hours: " + student.getCurrentCreditHours());
  }
}
