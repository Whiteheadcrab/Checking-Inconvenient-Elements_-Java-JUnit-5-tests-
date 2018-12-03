package Program;

public class checkingVariables {

	//Method for checking string variables with ? and change ? into 1
	public String checkingNumbers (String numString)
	{
		if (numString.isEmpty() || numString == null)
	      {
			  return "";
	      } 
	      else
	      {
	    	  int length=numString.length();
	    	  String result="";
	      
	  
	    	  for (int i = 0 ; i < length ; i++)
	    	  {
	    		  if (numString.substring(i,i+1).equals("?"))
	    		  {
	    			  result=result+"1";
	    		  }
	    		  else
	    		  {
	    			  result=result+numString.substring(i,i+1);
	    		  }
	    	  }
	    	  return result;
	      }
	}
	
	//Method for checking string variables with $ and change $ into s
	public String checkingLetters (String letString)
	{
		if (letString.isEmpty() || letString.equals(null))
	      {
	        return "";
	      } 
	      else
	      {
	    	  int length=letString.length();
	    	  String result="";
	      
	  
	    	  for (int i = 0 ; i < length ; i++)
	    	  {
	    		  if (letString.substring(i,i+1).equals("$"))
	    		  {
	    			  result=result+"s";
	    		  }
	    		  else
	    		  {
	    			  result=result+letString.substring(i,i+1);
	    		  }
	    	  }
	    	  return result;
	      }
	}

	//Method for checking string variables with ? and $ and changing these two parameters
	public String checkingBothTypes (String string)
	{
		if (string.isEmpty() || string.equals(null))
	      {
	        return "";
	      } 
	      else
	      {
	    	  int length=string.length();
	    	  String result="";
	      
	    	  for (int i = 0 ; i < length ; i++)
	    	  {
	    		  if (string.substring(i,i+1).equals("$"))
	    		  {
	    			  result=result+"s";
	    		  }
	    		  else
	    		  {
	    			  if (string.substring(i,i+1).equals("?"))
	    			  {
	    				  result=result+"1";
	    			  }
	    			  else
	    			  {
	    				  result=result+string.substring(i,i+1);
	    			  }
	    		  }
	    	  }
	    	  return result;
	      }
	}
}
