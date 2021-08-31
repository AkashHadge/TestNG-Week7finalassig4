package Akashpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFinal {
	@Test
	  public void f() {
		  System.out.println("Hello akashTest11");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Hello akashTest12");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Hello akashTest13");
	  }

	}



