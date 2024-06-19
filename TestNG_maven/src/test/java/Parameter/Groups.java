package Parameter;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = {"High"})
	public void launched_browser() {
		System.out.println("launched browser");
	}

	@Test(groups = {"High"})
	public void hiturl() {
		System.out.println("hit url");
	}

	@Test(groups = {"Medium"})
	public void find_element() {
		System.out.println("find element");
	}

	@Test(groups = {"Medium"})
	public void search() {
		System.out.println("search");
	}

	@Test(groups = {"Medium"})
	public void click_search() {
		System.out.println("click search");
	}

	@Test(groups = {"Low"})
	public void products() {
		System.out.println("products");
	}

}
