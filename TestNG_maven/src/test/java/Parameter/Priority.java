package Parameter;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 0)
  public void World() {
	  System.out.println("World");
  } 
  @Test(priority = 1)
	  public void India() {
		  System.out.println("India");
	  }
  @Test(priority = 2)
	  public void Amravti(){
		  System.out.println("Amravti");
	  }
  @Test
  public void Akola() {
	  System.out.println("Akola");
  }
  }
  

