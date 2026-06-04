package cpsc2150.registration;

/**
 * A class representing a Student. Students have a name, whether they have completed the
 * prerequisite for a course, and how many credit hours they are currently taking.
 */
public class Student {

  private final String name;

  private final boolean completedPrerequisite;

  private int currentCreditHours;

  public Student(String aName, boolean aCompletedPrereq, int aCurrentCreditHours) {
    this.name = aName;
    this.completedPrerequisite = aCompletedPrereq;
    this.currentCreditHours = aCurrentCreditHours;
  }

  public String getName() {
    return name;
  }

  public boolean hasCompletedPrerequisite() {
    return completedPrerequisite;
  }

  public int getCurrentCreditHours() {
    return currentCreditHours;
  }

  public void addCreditHours(int creditHours) {
    currentCreditHours += creditHours;
  }
}
