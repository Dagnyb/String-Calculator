package is.ru.stringcalculator;

public class Calculator {


	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains("//")){
			int slashIndex = text.indexOf("/");
			int delimIndex = slashIndex+1;
			String delimiter = text.substring(slashIndex+2, slashIndex+3);
			return sum(splitNumbers(text.substring(delimIndex+2), delimiter));
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return 1;

		//TODO: Calling Add with a negative number will throw an exception
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
    
    private static String[] splitNumbers(String numbers, String delimiter){
	    return numbers.split(delimiter);
	}

    private static int sum(String[] numbers){
 	   int total = 0;
 	   int num = 0;
 	   for(String number : numbers){
		   num = toInt(number);
		   if(num > 1000){
		   	num = 0;
		   }

		   total += num;		
		}		
			return total;
	}	

  
}