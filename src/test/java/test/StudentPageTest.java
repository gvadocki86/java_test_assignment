package test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import test.pageObject.StudentPage;

public class StudentPageTest extends FunctionalTest {

	@Test
	public void checkTitle(){
		driver.get("localhost:3000/student");
		
		StudentPage studentPage = new StudentPage(driver);
		Assertions.assertEquals("Student",studentPage.confirmationTitle());

	}	

}