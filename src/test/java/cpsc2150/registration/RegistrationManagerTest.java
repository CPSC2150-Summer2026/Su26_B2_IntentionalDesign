package cpsc2150.registration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RegistrationManagerTest {

  @Test
  public void testSuccessfulRegistration() {
    Student student = new Student("Ava", true, 12);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    assertTrue(result.wasSuccessful());
    assertEquals("Registered", result.getMessage());
    assertEquals(15, student.getCurrentCreditHours());
  }

  @Test
  public void testCannotRegisterForFullCourse() {
    Student student = new Student("Ben", true, 12);
    Course course = new Course("CPSC 2150", 3, true);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    assertFalse(result.wasSuccessful());
    assertEquals("Course is full", result.getMessage());
    assertEquals(12, student.getCurrentCreditHours());
  }

  @Test
  public void testCannotRegisterWithoutPrerequisite() {
    Student student = new Student("Cara", false, 12);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    assertFalse(result.wasSuccessful());
    assertEquals("Missing prerequisite", result.getMessage());
    assertEquals(12, student.getCurrentCreditHours());
  }

  @Test
  public void testExactlyMaxCreditHoursIsAllowed() {
    Student student = new Student("Eli", true, 15);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    assertTrue(result.wasSuccessful());
    assertEquals("Registered", result.getMessage());
    assertEquals(18, student.getCurrentCreditHours());
  }

  @Test
  public void testFailedRegistrationDoesNotChangeCreditsWhenMissingPrerequisite() {
    Student student = new Student("Fatima", false, 12);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    assertFalse(result.wasSuccessful());
    assertEquals(12, student.getCurrentCreditHours());
  }

  @Test
  public void testFailedRegistrationDoesNotChangeCreditsWhenCourseIsFull() {
    Student student = new Student("Grace", true, 12);
    Course course = new Course("CPSC 2150", 3, true);
    RegistrationManager manager = new RegistrationManager();

    RegistrationResult result = manager.register(student, course);

    assertFalse(result.wasSuccessful());
    assertEquals(12, student.getCurrentCreditHours());
  }

  @Test
  public void testWouldExceedMaxCreditsReturnsFalseAtLimit() {
    Student student = new Student("Jamal", true, 15);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    assertFalse(manager.wouldExceedMaxCredits(student, course));
  }

  @Test
  public void testWouldExceedMaxCreditsReturnsFalseUnderLimit() {
    Student student = new Student("Kai", true, 12);
    Course course = new Course("CPSC 2150", 3, false);
    RegistrationManager manager = new RegistrationManager();

    assertFalse(manager.wouldExceedMaxCredits(student, course));
  }
}
