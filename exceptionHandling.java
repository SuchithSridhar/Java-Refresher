class ExceptionHandling{
	public static void main(String[] args){
		try{
			throw new ArithmeticException();
		}catch (ArithmeticException | NumberFormatException e){
		}catch (Exception e){
		}finally{
			// perform house keeping tasks
		}
	}
}

class CustomException extends Exception{
	CustomException(String message){
		super(message);
	}
}

/*
 * Common Java Exceptions:
 * 
 * NullPointerException
 * NumberFormatException
 * IllegalArgumentException
 * RuntimeException
 * IllegalStateException
 * NoSuchMethodException
 * ClassCastException
 * Exception
 * ParseException
 * InvocationTargetException
 * */
