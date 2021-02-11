/**
 * A class to manipulate Strings as an example.
 * @author Suchith Sridhar
 */
public class stringManipulations{
    private static String BASE_STRING = "Suchith Sridhar";
    public static void main(String[] args) {
        System.out.println(" = = = String Manipulations = = = ");
        System.out.println("string.charAt(2) - "+BASE_STRING.charAt(2));
        System.out.println("string.compareTo(string) - "+BASE_STRING.compareTo("Suchith Sridhar"));
        System.out.println("string.compareToIgnoreCase(string) - "+BASE_STRING.compareTOIgnoreCase("suchith SRIDHAR"));
        System.out.println("string.contains(subString) - "+BASE_STRING.contains("Suchith"));
        System.out.println("string.concat(something) - "+BASE_STRING.concat(" Khajjayam"));
        System.out.println("string.substring(start, end (exclusive)) - "+BASE_STRING.substring(0, 7));
        System.out.println("string.startsWith(string) - "+BASE_STRING.startsWith("Suchith"));
        System.out.println("string.equals(string) - "+BASE_STRING.equals("Suchith Sridhar"));
        System.out.println("string.format() - "+BASE_STRING.);
        System.out.println("string. - "+BASE_STRING.);

        System.out.println();
        System.out.println("String.valueOf(item) - "+String.valueOf(10));
        System.out.println("string. - "+BASE_STRING.);
    }
}