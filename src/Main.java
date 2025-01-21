import java.util.ArrayList; //For ArrayLists
import java.util.Scanner;   //For user input
import javax.swing.JOptionPane; //For GUI work
import java.util.Random;    //For random numbers

import java.util.*; //For all java.util packages


//All lessons written in this class come from the "BroCode" YouTube channel
public class Main {
    public static void main(String[] args) {
        //IntelliJ Shortcuts
        /*
        CTRL + r = Find and replace words (filter to include/exclude comments)
        'sout' + TAB = System.out.println();
         */

        //The IntelliJ Debugger
        /*
        1. Add breakpoints by clicking to the left of the line
        2. Conditional breakpoints will hold when the condition is satisfied
        3. Exception breakpoints will hold when an exception has occurred
        4. Know how to step in, step over, and step out of methods on the stack
        5. Select a variable and hit 'evaluate expression' to see all possible values of that variable
        6. Know how to view and delete breakpoints
        7. You can still look at the console during debug mode
         */

        //VARIABLES
        /*
        1. int = integer/whole numbers
        2. String = words/sentences
        3. boolean = 1 or 0, true or false
        4. char = one character
        5. double = decimal numbers

        There are more data types of varying sizes, but these are the ones that are primarily used for simple programs
         */

        //PRACTICE: Swap two variables
        /*
        int x = 8;
        int y = 3;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println();

        int temp = x;   //Use a temporary variable to keep x
        x = y;
        y = temp;

        System.out.println("After swapping x and y: ");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        */

        //PRACTICE: User Input
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write me a sentence: ");
        String sentence = scanner.nextLine();   // For an entire line

        System.out.println("What is your first name? ");
        String name = scanner.next();   //For one word

        System.out.println("What is your last name initial?");
        char lastInitial = scanner.next().charAt(0);

        System.out.println("What is your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.println("What is your age in years?");
        int age = scanner.nextInt();

        //IMPORTANT: Pressing ENTER will add a '\n' to the scanner.
        // If scanner.next() is used after something like scanner.nextInt(), it will grab the '\n'
        //If you don't want this, flush the '\n' using scanner.nextLine()

         */

        //EXPRESSIONS
        /*
        1. Operators
            '+' = add
            '-' = subtract
            '/' = divide ( 5 / 2 returns 2, because the decimal is not counted in integer division)
                         ( 5.0 / 2.0 returns 2.5 because the operands are doubles)
            '*' = multiply
            '%' = modulo (5 % 2 returns 1 because 5 / 2 has a remainder of 1)
        2.  Increment/Decrement
            Let x and y be int variables
            x++; ----- This will increment x by 1
            y--; ----- This will decrement y by y
         */

        //GUI (Graphical User Interface)
        /*
        String name = JOptionPane.showInputDialog("Enter your first and last name");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa"));
        JOptionPane.showMessageDialog(null, "You have a " + gpa + " gpa.");

         */

        //USING MATH CLASS
        /*
        double x = 7.82;
        double y = -52.11;

        double z = Math.max(x, y);
        System.out.println(z);  //Prints maximum of 2 values

        z = Math.abs(y);
        System.out.println(z);  //Prints absolute value of y

        z = Math.sqrt(x);
        System.out.println(z);  //Prints square root of x

        z = Math.pow(x, 2);
        System.out.println(z);  //Prints x squared

        z = Math.round(x);
        System.out.println(z);  //Rounds x

        z = Math.floor(x);  //Always rounds x down
        System.out.println(z);

        z  = Math.ceil(x);  //Always rounds x up
        System.out.println(z);
        */


        //PRACTICE: Find hypotenuse of triangle given a and b from keyboard
        /*
        double a;
        double b;
        double hypotenuse;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of side 1: ");
        a = scanner.nextDouble();

        System.out.println("Enter length of side 2: ");
        b = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse length is " + hypotenuse);

        scanner.close();
        */

        //RANDOM NUMBERS
        /*
        Random random = new Random();

        int x = random.nextInt(6) + 1; //From 1 to 6
        System.out.println(x);  // ((upper - lower + 1) + lower) is the range

        double y = random.nextDouble(); //Between 0 and 1
        System.out.println(y);

        boolean z = random.nextBoolean();   //Either true or false
        System.out.println(z);

         */

        //IF STATEMENTS
        /*
        //Performs a block of code if a condition is met

        int age = 17;   //Manipulate this variable

        if (age >= 18) {
            System.out.println("You are an adult"); //Performed when condition is true
        }
        else if (age >= 15) {
            System.out.println("Go back to Fortnite buddy!");  //Performed if previous condition not true & current condition is true
        }
        else {
            System.out.println("You are not an adult"); //Performs if either condition not true
        }

        Conditional operators
            1. '==' means equal
            2. '>=' means greater than or equal
            3. '<=' means less than or equal
            4. '!=' means not equal
         */

        //SWITCH STATEMENTS

        /*
        //Allows a variable to be tested for equality against a list of values
        //Use instead of many if statements
        String day = "Monday";  //Manipulate days of the week

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;  //If break is not added, all code below in the switch statement will also run
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("I guess the world's ending");
        }

         */

        //LOGICAL OPERATORS
        /*
        1. AND - '&&'
        2. OR - '||'
        3. NOT - '!'
         */

        //WHILE LOOP
        /*
        //While loop executes a block of code CONTINUOUSLY until a condition is false
        //If the condition starts false, then the loop won't run at all

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isEmpty()) {
            System.out.println("Enter your name (DONT LEAVE BLANK): ");
            name = scanner.nextLine();
        }
         */

        // DO while loop
        /*
        //This loop is similar to a while loop, but it will always run at least once
        String name;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your name (DONT LEAVE BLANK): ");
            name = scanner.nextLine();
        } while (name.isEmpty());
         */

        //FOR LOOPS
        /*
        //A for-loop executes a block of code for a given amount of times
        //Used when you know how many times the for loop iterates

        //EX: Count from 0 to 10
        //Order: Declaration of counter; loop condition; counter update
        //The update happens after everything within the loop runs

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
         */

        //NESTED LOOPS
        /*
        //Essentially, it's a loop within a loop
        //For each i in an outer loop, there will be j iterations from an inner loop
        //Typically used when working with 2D or 3D structures

        //EX: Create a rectangle using nested loops

        int rows;
        int cols;
        char symbol;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        cols = scanner.nextInt();

        System.out.println("Enter the symbol you want the rectangle to be made of: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int  j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
         */

        //ARRAYS
        /*
        //Used to store multiple values of the same type in a single variable
        //Accessed by indices starting from 0

        String[] names = {"Diego", "David", "Ana", "Fernando"};
        //names[0] = Diego, 1 is David, and so on

        int[] nums = new int[10];   //Declare an int array with 10 elements
        for (int i = 0; i < nums.length; i++) { //Initialize with a for loop
            nums[i] = i + 1;
        }

        for (int num : nums) {  //Use a "for each" loop to print all elements of nums
            System.out.println(num);
        }
         */

        //2D ARRAYS
        /*
        //A 2D array is an "array of arrays", built of rows and columns
        //Use a nested for loop or for each loop to initialize and print

        int[][] nums = new int[3][3];
        int count = 1;

        for (int i = 0; i < nums.length; i++) { //Initialize 2D array
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = count;
                count++;
            }
        }

        for (int[] row : nums) {    //Print 2D array
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
         */

        //STRING METHODS
        /*
        //A String is a reference data type and has access to useful methods

        String name = "Diego     ";

        boolean nameMatch = name.equals("Diego");   //Returns true if name is equal to what's in parentheses
        int nameLength = name.length(); //Returns length of the string
        char firstChar = name.charAt(0);    //Like an array, index 0 is the first char, 1 is 2nd, and so on
        int indexD = name.indexOf('e');    //Returns index of the first 'e' in name
        boolean isEmpty = name.isEmpty();   //Returns true if the String is empty
        String uppercase = name.toUpperCase();  //Makes a string uppercase
        String lowercase = name.toLowerCase();  //Makes a string lowercase
        String trimmed = name.trim();   //Returns name without whitespaces
        String replaced = name.replace('o', 'a');   //Replace original 'o' with 'a'
         */

        //WRAPPER CLASSES
        /*
        //Lets you use primitive data types (int, char, boolean, double) as reference datatypes
        //Helpful because reference types contain useful methods and can be used in things like ArrayLists

        //Autoboxing- The conversion of primitive to wrapper class
        //Unboxing- The conversion of wrapper class to primitive

        //Left is primitive, right is wrapper
        //boolean   Boolean
        //char      Character
        //int       Integer
        //double    Double

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Diego";

        if (a == true) {
            System.out.println("This is true");
        }
        if (b == '@') {
            System.out.println("This is true");
        }
         */

        //ARRAYLISTS
        /*
        //Essentially, a resizeable array
        //Elements can be added or removed
        //BUT, they only store reference types

        //EX: Declaration
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //Adding values
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));    //get(index) returns the num
        }
        System.out.println();

        nums.set(1, 7); //Set index 1 (number 2) to the value 7
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        nums.remove(0); //Remove element at index 0 (number 1)
        for (int num : nums) {
            System.out.println(num);
        }

        nums.clear();   //Clears all elements from nums
         */

        //2D ARRAYLISTS
        /*
        //A dynamic (changeable size) list of lists
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Eggs");
        bakeryList.add("Donuts");
        bakeryList.add("Bread");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Broccoli");
        vegetables.add("Carrots");


        System.out.println(bakeryList); //You can print the whole list by doing this

        //Now create an arraylist of arraylists
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(vegetables);

        //Print the 2D Grocery list
        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1));  //Should be the 2nd element of list 1 (Donuts)
         */

        //FOR EACH LOOP
        /*
        //Also known as an 'enhanced for loop'
        //Iterates through the elements in an array/collection

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //How to use the loop to print all elements
        for (int num : nums) {  //The 1st parameter can be named anything, but must be the same type as the array elements
            //The collection's name is the 2nd parameter
            //Both parameters are separated by a colon
            System.out.println(num);
        }

        //This also works with ArrayLists
         */

        //PRINTF STATEMENTS
        /*
        //A method to format, control, and display text to the console
        //                  2 Arguments: format string + (object/variable/value)
        //                  % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = 'D';
        String myString = "Diego";
        int myInt = 7;
        double myDouble = 3.148592;

        System.out.printf("This is a boolean: %b\n", myBoolean); // b for boolean
        System.out.printf("This is a char: %c\n", myChar);    //c for char
        System.out.printf("This is a string: %s\n", myString);    //s for string
        System.out.printf("This is an int: %d\n", myInt);    //d for decimal (int)
        System.out.printf("This is a double: %f\n", myDouble);  //f for float (double)

        System.out.printf("Hello %10s\n", myString);  //Width is 10, meaning that myString will be right-justified 10 chars
                                                    //Use a '-' before width to make it left-justified

        System.out.printf("Here is your balance: %.2f\n", myDouble);  //Here, '.2' is the precision of the float
                                                                    //It will ensure exactly 2 decimal places are output
                                                                    //It will round correctly
        //List of flags
        // '-' means left-justify
        // '+' will output a plus (+) or a minus (-) sign for a numeric value
        // '0' : numeric values are zero-padded
        // ',' : comma grouping separator for numbers >= 1000
         */

        //THE 'FINAL' KEYWORD
        /*
        //Anything that is declared as 'final' cannot be altered later in the program

        double pi = 3.141592;

        pi = 4;
        System.out.println(pi);

        final double PI = 3.141592;
        PI = 5; //THIS WILL GENERATE AN ERROR BECAUSE PI IS FINAL AND CANNOT BE ALTERED
        System.out.println(PI);
         */

        //VARIABLE SCOPE
        /*
        //local = declared inside a method (includes if and while statements, anything within braces).
        //        visible only to the method

        //global = declared outside a method, but within a class.
        //         visible to all parts of the class
        
         */



    }
}