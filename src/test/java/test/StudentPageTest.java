package test;

//import org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import test.pageObject.StudentPage;

public class StudentPageTest extends FunctionalTest {

	@Test
	public void checkTitle(){
		driver.get("localhost:3000/student");
		
		StudentPage studentPage = new StudentPage(driver);

		//System.out.println(studentPage.confirmationTitle());
		/*assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you", receiptPage.confirmationHeader());*/
	}	
	
/*	@Test
	public void isStudentPage(){
		driver.get("localhost:3000/student");
		
		StudentPage studentPage = new StudentPage(driver);
//<span class="MuiButton-label">Start</span>
		//System.out.println(studentPage.confirmationTitle());
		
		
		//studentPage.confirmationTitle();
		
		//assertTrue(studentPage.isInitialized());
		
		Assertions.assertEquals("Student", studentPage.confirmationTitle());
*/
	/*	signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you", receiptPage.confirmationHeader());
	}*/
}