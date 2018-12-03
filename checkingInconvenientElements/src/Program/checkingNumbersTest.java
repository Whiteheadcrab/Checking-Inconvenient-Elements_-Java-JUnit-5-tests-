package Program;

import org.junit.jupiter.api.Test;

class checkingNumbersTest {

	//Checking of method checkingNumbers only with elements ?
	@Test
	public void testEmptyRandomNumber()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingNumbers("????");
		//Checking this test case
		assert(variable).matches("[0-9][0-9][0-9][0-9]");
	}
	
	//Checking of method checkingNumbers with elements ? and spaces
	@Test
	public void testEmptyRandomNumberWithSpaces()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingNumbers("? ???  ? ");
		//Checking this test case
		assert(variable).matches("[0-9] [0-9][0-9][0-9]  [0-9] ");
	}
	
	//Checking of method checkingNumbers inside normal text
	@Test
	public void testEmptyRandomNumberInsideText()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingNumbers("Let's check this  ?");
		//Checking this test case
		assert(variable).matches("Let's check this  [0-9]");
	}
	
}
