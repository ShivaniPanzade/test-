package Parameter;

import org.testng.annotations.Test;

public class Invocation_count {
  @Test
  public void World() {
	  
  }
  @Test(invocationCount = 1)
public void India() {
	  
  }
  @Test
public void China() {
	  
}
  @Test(invocationCount = 3)
public void America() {
	  
}
  @Test(invocationCount = 2)
public void Pakistan() {
	  
}
}
