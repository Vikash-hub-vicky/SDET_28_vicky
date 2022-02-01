package CreateContactTest;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test(groups ="smokeTest")
	public void createContactTest() {
		System.out.println("create contact with my number");
		
	}
	@Test(groups ="regressionTest")
	public void createContactWithLeadTest() {
		System.out.println("lead phone number 9990789313");
	}

}
