public class TypeCasting{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        int intans;

        double a = 1.2;
        double b = 1.7;
        float c = 1.4;

        float floatans;
        double doubleans;

        floatans = (a * c) // - value is float since one of the operand is a float
        intans = (x / y) // - value is int since you are dividing ints
        doubleans = (x / a) // - value is double since you have a double operand

        intans = (int)doubleans // type casting

    }
}
