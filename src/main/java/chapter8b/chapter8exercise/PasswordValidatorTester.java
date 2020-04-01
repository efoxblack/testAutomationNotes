package chapter8b.chapter8exercise;

public class PasswordValidatorTester extends PasswordValidator{

    public static void main(String[] args) {
        var validator = login();
        validator.printPasswordRules();

        do {
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()) {
                System.out.println(validator.getErrorMessage());
            }

        } while(!validator.isValid());

        System.out.println("The proposed password is valid!");

        validator.closeScanner();
    }
}
