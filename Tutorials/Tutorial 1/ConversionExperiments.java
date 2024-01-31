
public class ConversionExperiments {
    // shallow unit testing static method
    static boolean assertEquals(String actualResult, String expectedValue) {
        return actualResult.equals(expectedValue);
    }

    public static void main(String[] args) {

        /*
            int
            1.  widening assignemnt
                int to float
                example: money = dollars; Where money is a float and dollars is an int
                inital value: int dollars = 25; double money;
                operations:
                assignments: money variable
                expect resulting type: double
                expected resulting value: 25.0
                description: money should equal 25.0 after assignment
            2. ....
            3. ....
        */

        // implementation of int conversion experiment #1
        // pre-conditions
        String expectedType = "float";
        String expectedResult = "25.0";
        // initial state
        int dollars = 25;
        float money;
        // conversion expression
        money = dollars;
        // Class type reflection for string comparison
        Class<Float> floatClass = float.class;
        boolean isFloatPrimitive = floatClass.isPrimitive();
        // expect validation
        System.out.println("Expect actual result to equal expected result: " + assertEquals(String.valueOf(money), expectedResult));
        System.out.println("Expect actual type to equal expected type: " + assertEquals(floatClass.getSimpleName(), expectedType) + "\n");
        // actual values
        System.out.println("actual result: " + money);
        System.out.println("actual type: " + floatClass.getSimpleName());
        System.out.println("actual type is a primitive type: " + isFloatPrimitive + "\n");
        // expected values
        System.out.println("expected result: " + expectedResult);
        System.out.println("expected type: " + expectedType);
    }
}