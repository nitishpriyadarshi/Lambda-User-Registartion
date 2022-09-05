package Bridgelab;

public class UserRegistrationRegex {
    public static void main(String[] args) throws Exception {
        UserRegistration userInformation = new UserRegistration();

        System.out.println(userInformation.userFirstName());
        System.out.println(userInformation.userLastName());
        System.out.println(userInformation.userEmailId());
        System.out.println(userInformation.userMobNum());
        System.out.println(userInformation.userPassword());
    }
}
