public class decisionStatements{
    public static void main(String[] args){
        // Decision statements are one type of control structure
        //
        // Decisions Statements, conditional statements,
        // selection statements
        //
        // if, if else, switch
        boolean condition = true;

        if (condition){
            //statements to execute
        } else if (condition){
            // statements to execute
        } else {
            // statements to execute
        }
        
        /* Comparison Operators:
         * == - equals
         * .equals() - equals for objects
         * != - not equals
         * > - greater than
         * < - less than
         * >= - greater than or equal to
         * <= - less than or equal to
         */

        /*
         * NOT Operator
         * !
         * - is a unary operator (ie takes only one operand).
         * - Operand must be boolean
         */

        /*
         * AND Operator
         * &&
         * - performs boolean 'and'
         *
         * OR Operator
         * ||
         * - performs boolean 'or'
         *
         * Exclusive OR
         * ^
         * - Performs exclusive or
         */

        // DANGLING ELSE PROBLEM
        
        int x, y = 6, 3;

        if (x>5)
            if (y>5)
                System.out.println("Both are > 5");
        else
            System.out.println("This else is indented wrong...");
        // Since the indentation points towards the first if's
        // else however, the else is an else to the second if
        if (x>5){

        } else if (x>5) {

        } else {

        }

        int expression = 12;
        int value = 13;

        // expression has to be either a number or a string
        // or a enumerable type
        switch (expression) {
            case value: System.out.println("ha");
                    break;  
            case 14: System.out.println("ba");
                    break;
            default: System.out.println("default");
        }

        // Ignoreing leap year:
        int month = 4;
        int days;
        
        switch (month){
            case 9:
            case 4:
            case 6:
            case 11: days = 30; break;
            case 2: days = 28; break;
            default: days = 31;
        }
    }
}
