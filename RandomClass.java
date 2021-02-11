import java.util.Random;
/**
 * RandomClass
 */
public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Demonstrating Random class from java.");
        System.out.println("java.util.Random");
        System.out.println("A random int: " + r.nextInt());
        System.out.println("It uses a similar interface to Scanner.");
        System.out.println("You can also use Math.random() to generate a random number [0, 1)");
        System.out.println("Math class random: " + Math.random());
    }
}
