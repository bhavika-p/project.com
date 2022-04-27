package sample.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annoclass {
	
  @Test (enabled=false)
  public void class1() {
	  System.out.println("inside class1");
  }
  
  @Test()
  public void class4() {
	  System.out.println("inside class4");
	  Assert.assertEquals(false, true);
  }
  
  @Test (invocationCount=3)
  public void class3() {
	  System.out.println("inside class3");
	  Assert.assertEquals(true, true);
  }
  
  @Test(dependsOnMethods="class3")
  public void class2() {
	  System.out.println("inside class2");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("homepage");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("viewpage");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("reviewpage");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("address");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("mobile");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("electronics");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("loginpage");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("contactus");
  }

}
