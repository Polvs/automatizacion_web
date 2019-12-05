package autmatizacion.automatizacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class automatizacion_TEST {

	WebDriver driver;
	automatizacion_OBJ obj = new automatizacion_OBJ(driver);
	
	@Before
	public void setUp() throws Exception {
		obj.before();
	}

	@After
	public void tearDown() throws Exception {
		obj.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//obj.clickSignIn();
		//obj.signIn("alvaro98@gmail.com", "aaaaaa");
		assertTrue(obj.existElement(obj.signOutBtn));
	}

}
