package Program;

import org.junit.jupiter.api.Test;


class checkingEmptyVariablesTest {

	//Checking of method checkingNumbers without elements
	@Test
	public void testEmptyVariableNumber()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingNumbers("");
		//Checking this test case
		assert(variable).matches("");
	}
	
	//Checking of method checkingLetters without elements
	@Test
	public void testEmptyVariableLetter()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingLetters("");
		//Checking this test case
		assert(variable).matches("");
	}

	//Checking of method checkingBothTypes without elements
	@Test
	public void testEmptyVariableBoth()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingBothTypes("");
		//Checking this test case
		assert(variable).matches("");
	}
	
}
