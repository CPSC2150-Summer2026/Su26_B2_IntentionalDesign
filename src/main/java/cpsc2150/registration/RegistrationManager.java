package cpsc2150.registration;

/**
 * A RegistrationManager is verifying that a student is able to register for a course without
 * exceeding credit hour limits.
 */
public class RegistrationManager {
public static final int MAX_CREDIT_HOURS=18;

public RegistrationResult register(Student s, Course c){
if(c.full()){
return new RegistrationResult(false,"Course is full");
}
if(!s.hasCompletedPrerequisite()){
return new RegistrationResult(false,"Missing prerequisite");
}
if(wouldExceedMaxCredits(s,c)){
return new RegistrationResult(false,"Too many credit hours");
}
s.addCreditHours(c.creditHours());
return new RegistrationResult(true,"Registered");
}

public boolean wouldExceedMaxCredits(Student s, Course c){
return s.getCurrentCreditHours()+c.creditHours()>MAX_CREDIT_HOURS;
}
}