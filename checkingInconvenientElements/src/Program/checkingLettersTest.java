package Program;

import org.junit.jupiter.api.Test;

class checkingLettersTest {

	//Checking of method checkingLetters only with elements $
	@Test
	public void testEmptyRandomLetters()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingLetters("$$$$$");
		//Checking this test case
		assert(variable).matches("[a-z][a-z][a-z][a-z][a-z]");
	}
	
	//Checking of method checkingLetters with elements $ and spaces
	@Test
	public void testEmptyRandomLettersWithSpaces()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingLetters("$  $ $");
		//Checking this test case
		assert(variable).matches("[a-z]  [a-z] [a-z]");
	}

	//Checking of method checkingLetters inside normal text
	@Test
	public void testEmptyRandomLettersInsideText()
	{
		//Importing class
		checkingVariables  check = new checkingVariables();
		//Inputting data for test case
		String variable = check.checkingLetters("Let's check this $");
		//Checking this test case
		assert(variable).matches("Let's check this [a-z]");
	}
}
