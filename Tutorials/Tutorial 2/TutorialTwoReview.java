public class TutorialTwoReview {
    public static final boolean a = true;
    public static final boolean b = false;
    public static void main(String[] args) {


        // if if (a) {
        //            System.out.println("if");
//
//        }
//        if (a) System.out.println("if");
//
//        // if else
//        if (a) {
//            System.out.println("if - else : if");
//        } else {
//            System.out.println("if - else : else");
//        }
//
//        if (a) System.out.println("if - else : if");
//        else System.out.println("if - else : else");
//
//        System.out.println((a) ? "ternary if - else: if" : "ternary if - else: else");
//
//        // if else if
//        if (a) {
//            System.out.println("if - else if : if");
//        } else if (b) {
//            System.out.println("if - else if : else");
//        }
//
//        if (a) System.out.println("if - else if : if");
//        else if (b) System.out.println("if - else if : else");
//
//        // if else if else
//        if (a) {
//            System.out.println("if - else if - else : if");
//        } else if (b) {
//            System.out.println("if - else if - else : else if");
//        } else {
//            System.out.println("if - else if - else : else");
//        }
//
//        if (a) System.out.println("if - else if - else : if");
//        else if (b) System.out.println("if - else if - else : else if");
//        else System.out.println("if - else if - else : else");
//
//        System.out.println(
//                (a) ? "ternary if - else if - else : if"
//                : (b) ? "ternary if - else if - else : else if"
//                : "ternary if - else if - else : else"
//        );
//
//        // nested ifs
//        double rate;
//        int income = (int) ((Math.random() * (100000 - 20000)) + 20000);
//        if (income < 0) rate = 0;
//        else if (income < 25000) rate = 0.10;
//        else if (income < 45000) rate = 0.15;
//        else if (income < 65000) rate = 0.23;
//        else if (income < 85000) rate = 0.33;
//        else rate = 0.42;
//        System.out.println("" + rate);
//
//
//        // switch
//        int day = 4;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//        // Outputs "Thursday" (day 4)
//
//
//        // while loop
//        while (a) {
//            System.out.println("while loop");
//            break; // or infinite loop
//        }
//
//
//        // do while loop
//        do {
//            System.out.println("do while loop");
//            break; // or infinite loop
//        } while (a);
//
//        // for loop
//        int increment;
//        for (increment = 0; increment < 100; increment++) {
//            System.out.println("for loop");
//        }
//
//        for (increment = 0; increment < 100; increment++) {
//            if (increment == 50)
//            System.out.println("for loop: " + increment);
//        }
//
//        // for each loop
//        int[] numbers = {3, 9, 5, -5};
//        for (int number: numbers) {
//            System.out.println(number);
//        }
//
//        // break statement for loop
//        for (int i = 1; i <= 10; ++i) {
//            // if the value of i is 5 the loop terminates
//            if (i == 5) break;
//            System.out.println(i);
//        }
//
//        // continue statements
//        for (int i = 1; i <= 10; ++i) {
//            // if value of i is between 4 and 9 continue is executed to the next iteration
//            if (i > 4 && i < 9) continue;
//            System.out.println(i);
//        }


        /*

        Boolean expressions evaluate to true or false

        ==	Equal to	                (x == y)
        !=	Not equal	                (x != y)
        >	Greater than	            (x > y)
        <	Less than	                (x < y)
        >=	Greater than or equal to	(x >= y)
        <=	Less than or equal to	    (x <= y)

        Logical operators can be used to combine boolean expressions to return a single truthy value

        && 	Logical and	Returns true if both statements are true	(x < 5 &&  x < 10)
        || 	Logical or	Returns true if one of the statements is true	(x < 5 || x < 4)
        !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

        */

        // Arrays
        // !!!! COMPUTER SCIENTISTS ALWAYS START COUNTING FROM ZER0 !!!!

        // Array length is immutable when it is initalized
//        String[] listOfNames;
//        String[] typeOfCarBrands = {"Volvo", "BMW", "Ford", "Mazda"};
//        int[] billDenominations = {5, 10, 20, 50, 100};
//        int[] a = new int[4]; // = {0, 0, 0, 0};
//
//        // iterate through the list
//        for (int i = 0; i < typeOfCarBrands.length; i++) {
//            System.out.println(typeOfCarBrands[i]);
//        }
//        // for each alternative
//        for (String typeOfCarBrand : typeOfCarBrands) {
//            System.out.println(typeOfCarBrand);
//        }

//        // multi dimensinal arrays (2D arrays)
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        System.out.println(myNumbers[1][2]); // Outputs 7
//
//        // array[row][column]
//        int[][] myNumbers2 = {
//                {1, 2, 3, 4}, // row 0
//                {5, 6, 7} // row 1
//        };
//
//        int[][] myNumbers3 = {
//                {1, 2, 3, 4},
//                {5, 6, 7}
//              // 0  1  2  3   columns
//        };
//
//        // multi dimensinal arrays (2D arrays)
//
//        int[][] a = new int[4][3]; // = { {0, 0, 0}, {0, 0, 0, 0} };
//        int length = a.length;
//        a[0].length
//
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        System.out.println(myNumbers[1][2]); // Outputs 7
//
//        // array[row][column]
//        int[][] myNumbers2 = {
//                {1, 2, 3, 4}, // row 0
//                {5, 6, 7} // row 1
//        };
//
//        int[][] myNumbers3 = {
//                {1, 2, 3, 4},
//                {5, 6, 7}
//              // 0  1  2  3   columns
//        };
//
//        // iteration
//        // create a 2d array
//        int[][] arr = {
//                {1, -2, 3},
//                {-4, -5, 6, 9},
//                {7},
//        };
//        // first for...each loop access the individual array
//        // inside the 2d array
//        for (int[] innerArray: arr) {
//            // second for...each loop access each element inside the row
//            for(int data: innerArray) {
//                System.out.println(data);
//            }
//        }




//        // 3d array - a 3d array is an array of 2d arrays
//        int[][][] test = {{{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}};
//        // for-each loop to iterate through elements of 3d array
//        for (int[][] array2D: test) {
//            for (int[] array1D: array2D) {
//                for(int item: array1D) {
//                    System.out.println(item);
//                }
//            }
//        }
    }
}
