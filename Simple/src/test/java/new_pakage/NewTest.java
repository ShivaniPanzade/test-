package new_pakage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void a() {

		System.out.println("test1");
	}

	@Test
	public void j() {
		System.out.println("test2");
	}

	@BeforeSuite
	public void f() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void b() {
		System.out.println("before test");

	}

	@BeforeClass
	public void c() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void d() {
		System.out.println("before method");
	}

	@AfterMethod
	public void e() {
		System.out.println("after method");
	}

	@AfterClass
	public void g() {
		System.out.println("after class");
	}

	@AfterTest
	public void h() {
		System.out.println("after test");
	}

	@AfterSuite
	public void i() {
		System.out.println("after suite");
	}
}
