/**
 * This class is an example class to
 * demonstrate javadocs.
 * To generate the java doc
 * run the command
 * javadoc [-author] [-private] filename
 * @author Suchith Sridhar
 */
public class JavaDocsExample{
    /**
     * The x value of this param
     */
    private double x;

    /**
     * The string value of something
     */
    String something;

    /**
     * This method prints your name a
     * specific numbber of times
     * @param name The input name of param
     * @param times The numebr of times to print
     * @return returns true if successful
     */
    public static boolean printName(String name, int times){
        for(int i=0;i<times;i++){
            System.out.println(name);
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("This is a demo class to show the"
                +"use of java docs");
        printName("Suchith", 3);
    }
}

