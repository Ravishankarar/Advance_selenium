package advnceseltest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo
{
	@Test
	public void test()
	{
		Reporter.log("hello world" ,true);
	}
	@Test
	public void test1()
	{
		Reporter.log("hello " ,true);
	}
}
