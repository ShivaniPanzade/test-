package Parameter;

import org.testng.annotations.Test;

public class Description {
  @Test
  public void english() {
	  System.out.println("english");
	  
  }
  @Test(description = "Nationl science Day is celebrated in India on February 28")
  public void science() {
	  System.out.println("science");
  }
}
