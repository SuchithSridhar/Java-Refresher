public class ConvertTypes{
	public static void main(String[] args){
		int x=12;
		String intval = "12";
        
        // String to int
		int y = Integer.parseInt(intval);

        // Int to string
		String strval = Integer.toString(x);


		System.out.println(strval);
		System.out.println(y);
	}
}

