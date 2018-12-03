package Program;

import org.junit.jupiter.api.Test;

class checkingWithoutChangingTest {

	//Checking of method checkingNumbers without elements for changing
	@Test
	public void testWithoutNumbers()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingNumbers("Let's check this");
		//Checking this test case
		assert(variable).matches("Let's check this");
	}

	//Checking of method checkingLetters without elements for changing
	@Test
	public void testWithoutLetters()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingLetters("Let's check this");
		//Checking this test case
		assert(variable).matches("Let's check this");
	}
	
	//Checking of method checkingBothTypes without elements for changing
	@Test
	public void testWithoutBothTypes()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingBothTypes("Let's check this");
		//Checking this test case
		assert(variable).matches("Let's check this");
	}
}
