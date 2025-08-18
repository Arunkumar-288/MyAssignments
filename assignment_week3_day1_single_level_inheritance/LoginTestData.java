package assignment_week3_day1_single_level_inheritance;
public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username: testleaf");
	}

	public void enterPassword() {
		System.out.println("Password: CRMSFA");
	}

	public static void main(String[] args) {
		LoginTestData log = new LoginTestData();
		log.enterCredentials();
		log.enterUsername();
		log.enterPassword();
		log.navigateToHomePage();
	}
}