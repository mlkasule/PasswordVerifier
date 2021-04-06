import java.util.Scanner;

/**
 * Chapter 9: Programming Project 2. You are developing a software package for
 * an online shopping site that requires users to enter their own passwords.
 * Your software requires that users' passwords meet the following criteria:
 * 
 * ● The password should be at least six characters long. ● The password should
 * contain at least one upper-case and at least one lower-case letter. ● The
 * password should have at least one digit.
 * 
 * Write a method that verifies that a password meets the stated criteria. Use
 * this method in a program that allows the user to enter a password and then
 * determines whether or not it is a valid password. If it is valid, have the
 * program print "Valid Password". Otherwise, it should print "Invalid Password"
 * 
 * @author Mark Kasule
 *
 */
public class PasswordVerifier {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter password to be verified: ");
		String password = input.nextLine();

		String auth = passwordCorrect(password);

		// print out output
		System.out.println(auth);
	}

	/**
	 * check if password
	 * 
	 * @param pass
	 * @return
	 */
	public static String passwordCorrect(String pass) {

		String str = "Invalid password";
		for (int i = 0; i < pass.length(); i++) {
			if ((pass.length() >= 6) && (pass.charAt(i) >= 65 && pass.charAt(i) <= 90)
					|| (pass.charAt(i) >= 97 && pass.charAt(i) <= 122)
					|| (pass.charAt(i) >= 48 && pass.charAt(i) <= 57))

			{
				str = "Valid Password";
			} else {
				str = "Invalid Password";
			}
		}
		return str;
	}

}
