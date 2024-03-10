package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@SuppressWarnings("unused")
public class HelloTest {
  @Test
  public void f() {
	  String name = "@Test-Sanghamitra";
	  Hello.print(name);
  }
  @Test(priority = 1)
  public void f2() {
	  Hello.print("@Test2-Sanghamitra");
  }
  @BeforeTest
  public void beforeTest() {
	  String name = "@BeforeTest-Sanghamitra";
	  Hello.print(name);
  }

  @AfterTest
  public void afterTest() {
	  String name = "@AfterTest-Sanghamitra";
	  Hello.print(name);
  }

}
