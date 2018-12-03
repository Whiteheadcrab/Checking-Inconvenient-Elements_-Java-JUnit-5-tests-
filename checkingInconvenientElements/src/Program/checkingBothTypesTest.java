package Program;

import org.junit.jupiter.api.Test;

class checkingBothTypesTest {

	//Checking of method checkingBothTypes
	@Test
	public void testBothTypesInsideText()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingBothTypes("Let's check this  ?  $");
		//Checking this test case
		assert(variable).matches("Let's check this  [0-9]  [a-z]");
	}
	
	//Checking of checkingNumbers when we have both types of elements for changing
	@Test
	public void testOnlyNumbersInsideText()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingNumbers("Let's check this ? $");
		//Checking this test case
		assert(variable).equals("Let's check this 1 $");
	}
	
	//Checking of checkingLetters when we have both types of elements for changing
	@Test
	public void testOnlyLettersInsideText()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingLetters("Let's check this ? $");
		//Checking this test case
		assert(variable).equals("Let's check this ? s");
	}

}
