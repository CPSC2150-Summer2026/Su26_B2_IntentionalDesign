package cpsc2150.registration;

/**
 * A class to represent the result of a registration attempt. It contains a boolean to indicate
 * whether the registration was successful, and a message to provide more information about the
 * result.
 */
public class RegistrationResult {

  private final boolean successful;

  private final String message;

  public RegistrationResult(boolean isSuccessful, String aMessage) {
    this.successful = isSuccessful;
    this.message = aMessage;
  }

  public boolean wasSuccessful() {
    return successful;
  }

  public String getMessage() {
    return message;
  }
}
