import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String CARACTERES = "abcdefghkijlmnopqrstuvwyxABCDEFGHIJKLMNOPQRSTUVXYWZ0123456789!@#$%¨&*()_-><:^`{}";
    
    public static  String generatePassword(int passLength) {
    SecureRandom passGenerator = new SecureRandom();
    StringBuilder password = new StringBuilder(passLength);

    for (int i = 0; i < passLength; i++) {
        int index = passGenerator.nextInt(CARACTERES.length());
        password.append(CARACTERES.charAt(index));
    }

    return password.toString();

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Type the length of your password: ");
        int passwordFinalLength = scn.nextInt();
        String password = generatePassword(passwordFinalLength);
        System.out.println("Your password is: " + password);

    }
    
    


}
