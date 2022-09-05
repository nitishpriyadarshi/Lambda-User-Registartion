package Bridgelab;
import java.util.regex.Pattern;
public class ValidUserRegistration {
    public String firstName(String firstName) throws UserRegistrationException{

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if(firstName.isEmpty())
                throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);

            //Matcher matcher = pattern.matcher(firstName);
            ValidationInterface fNameValidate = (fName) -> pattern.matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(firstName);
//            if(matcher.matches()) {
//                return "Happy";
//            }
//            else {
//                return "Sad";
//            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
        }
    }

    public String lastName(String lastName) throws UserRegistrationException{
        //regex pattern
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if(lastName.isEmpty())
                throw new UserRegistrationException("Please enter valid Last Name!" , UserRegistrationException.ExceptionType.INVALID_LAST_NAME);

            // Matcher matcher = pattern.matcher(lastName);
            ValidationInterface fNameValidate = (fName) -> pattern.matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(lastName);
//            if(matcher.matches()) {
//                return "Happy";
//            }
//            else {
//                return "Sad";
//            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
        }
    }

    public String emailId(String emailId) throws UserRegistrationException {
        String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        try {
//            Pattern pattern = Pattern.compile(regex);
            if(emailId.isEmpty())
                throw new UserRegistrationException("Please enter valid Email ID!" , UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);

            ValidationInterface fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(emailId);
//            Matcher matcher = pattern.matcher(emailId);
//            if(matcher.matches()) {
//                return "Happy";
//            }
//            else {
//                return "Sad";
//            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid Email ID!" , UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
        }
    }

    public String mobNum(String mobNum) throws UserRegistrationException {
        String regex = "^[0-9]{1,3}-[0-9]{10}$";
        try {
//            Pattern pattern = Pattern.compile(regex);
            if(mobNum.isEmpty())
                throw new UserRegistrationException("Please enter valid Mobile Number!" , UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);

            ValidationInterface fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(mobNum);
//            Matcher matcher = pattern.matcher(mobNum);
//            if(matcher.matches()) {
//                return "Happy";
//            }
//            else {
//                return "Sad";
//            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid Mobile Number!" , UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);
        }
    }

    public String password(String pswrd) throws UserRegistrationException {
        String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
        try {
//            Pattern pattern = Pattern.compile(regex);
            if(pswrd.isEmpty())
                throw new UserRegistrationException("Please enter valid Password!" , UserRegistrationException.ExceptionType.INVALID_PASSWORD);

            ValidationInterface fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(pswrd);
//            Matcher matcher = pattern.matcher(pswrd);
//            if(matcher.matches()) {
//                return "Happy";
//            }
//            else {
//                return "Sad";
//            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid Password!" , UserRegistrationException.ExceptionType.INVALID_PASSWORD);
        }
    }
}
