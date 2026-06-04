package cpsc2150.registration;

/**
 * A course has a course code, how many credits it's worth, and whether it's full.
 *
 * @param courseCode the code for the course; its identifier
 * @param creditHours the amount of credits this class is worth
 * @param full a flag for whether the course is full or not
 */
public record Course(String courseCode, int creditHours, boolean full) {}
