package Parameter;

import org.testng.annotations.Test;

public class Enabled {
  @Test(enabled = true)
  public void school() {
	  System.out.println("school");
  }
	  @Test(enabled = false)
	  public void college() {
		  System.out.println("college");
  }
}
