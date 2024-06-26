package org.rbr.example.basics;

import java.math.BigDecimal;

import org.rbr.example.MainApp;

//see   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
//      https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//      https://www.baeldung.com/java-printstream-printf
public class Operators {

    public static void increment() {
        int i = 0;
        int j = 5;

        System.out.printf("Before increment i = %d%n", i);
        System.out.printf("Prefix increment i = %d%n", ++i);
        System.out.printf("After increment i = %d%n", i);

        System.out.printf("Before increment j = %d%n", j);
        System.out.printf("Postfix increment j = %d%n", j++);
        System.out.printf("After increment j = %d%n", j);
    }

    public static void decrement() {
        int i = 1;
        int j = 1;

        System.out.printf("Before decrement i = %d%n", i);
        System.out.printf("Prefix decrement i = %d%n", --i);
        System.out.printf("After decrement i = %d%n", i);

        System.out.printf("Before decrement j = %d%n", j);
        System.out.printf("Postfix decrement j = %d%n", j--);
        System.out.printf("After decrement j = %d%n", j);
    }

    public static void arithmetic() {
        double a = 5.0;
        double b = 2.5;
        int c = 3;
        int d = 9;
        System.out.printf("Initial values: a = %f, b = %f%n", a, b);
        System.out.printf("a + b = %f%n", a + b);
        System.out.printf("a - b = %f%n", a - b);
        System.out.printf("a / b = %f%n", a / b);  //division
        System.out.printf("a %% b = %f%n", a % b);  //mod (remainder) - note we have to escape the first '%' character to output it in the string 

        System.out.printf("Integer division: %d/%d = %s (careful, this is usually not desired!)%n", c, d, c/d);
        System.out.printf("Mixed (int and double) division: %d/%f = %s%n" , d, b, d/b);
    }

    public static void numericComparison() {
        int a = 5;
        int b = 10;
        System.out.printf("Initial values: a = %d, b = %d%n", a, b);
        System.out.printf("a < b = %b%n", a < b);
        System.out.printf("a > b = %b%n", a > b);
        System.out.printf("a <= 5 = %b%n", a <= 5);
        System.out.printf("b >= 10 = %b%n", a >= 15);
        System.out.printf("a == b = %b%n", a == b);
        System.out.printf("a != b = %b%n", a != b);
    }

    public static void stringComparison() {
        String a = "Foo";
        String b = "FOO";
        System.out.printf("Initial values: a = %s, b = %s%n", a, b);
        System.out.printf("a == \"Foo\" = %b (Don't do this!)%n", a == "Foo"); //be careful using == for String or other objects - usually NOT what you want
        System.out.printf("a.equals(\"Foo\") = %b%n", a.equals("Foo"));
        System.out.printf("a.equals(b) = %b%n", a.equals(b));
        System.out.printf("!a.equals(b) = %b%n", !a.equals(b));
        System.out.printf("a.equalsIgnoreCase(b) = %b%n", a.equalsIgnoreCase(b));
    }

    public static void conditional() {
        // see https://www.codecademy.com/resources/blog/what-is-boolean-logic/
        boolean a = true;
        boolean b = false;
        System.out.printf("Initial values: a = %b, b = %b%n", a, b);
        System.out.printf("a == true = %b%n", a);

        if (a || getTrueWithOutput()) { //short circuit evaluation
            System.out.println("a OR block executed");
        }
        if (b || getTrueWithOutput()) { //no short circuiting
            System.out.println("b OR block executed");
        }

        if (a && b) { //short circuit evaluation
            System.out.println("a && b == true block executed");
        } else { 
            System.out.println("a && b == true block not executed (else block called)");
        }

        //complex expression
        System.out.printf("!(a && b) || a = %b%n", !(a && b) || a);

        //ternary operator - see https://www.baeldung.com/java-ternary-operator
        String resultA = a == true ? "It's true!" : "It's false :(";
        String resultB = b == true ? "It's true!" : "It's false :(";

        System.out.printf("a == true = %s%n", resultA);
        System.out.printf("b == true = %s%n", resultB);
    }

    public static boolean getTrueWithOutput() {
        System.out.println("getTrueWithOutput() invoked");

        return true;
    }

    public static void compoundAssignment() {
        int a = 2;
        int b = 4;
        System.out.printf("Initial values: a = %d, b = %d%n", a, b);
        a += b; // a = a + b
        System.out.printf("a += b = %d%n", a);
        a -= b; // a = a - b
        System.out.printf("a -= b = %d%n", a);
        a *= b; // a = a * b
        System.out.printf("a *= b = %d%n", a);
        a /= b; // a = a / b
        System.out.printf("a /= b = %d%n", a);
        a %= b; // a = a % b
        System.out.printf("a %%= b = %d%n", a);
    }

    public static void typeComparison() {
        Object someObject = "foo";
        System.out.printf("someObject instanceof String = %b%n", someObject instanceof String);
        System.out.printf("someObject instanceof Object = %b%n", someObject instanceof Object);
        System.out.printf("someObject instanceof Integer = %b%n", someObject instanceof Integer);
        System.out.printf("someObject instanceof MainApp = %b%n", someObject instanceof MainApp);
    }

    public static void typeWidening() {
        byte myByte = 5;
        char byteAsChar = (char) myByte;
        int byteAsInt = 5;
        long byteAsLong = myByte;
        double byteAsDouble = myByte;

        System.out.printf("Original byte = %d, as char = '%c', as int = %d, as long = %d, as double = %f%n", 
            myByte, byteAsChar, byteAsInt, byteAsLong, byteAsDouble);

        float myFloat = 7.5f;
        double floatAsDouble = myFloat;

        System.out.printf("Original float = %f, as double = %f%n", myFloat, floatAsDouble);
    }

    public static void typeNarrowing() {
        double myDouble = 43.012345678987654321;
        float doubleCastedToFloat = (float) myDouble;
        int doubleCastedToInt = (int) myDouble;
        char doubleCastedToChar = (char) myDouble;
        byte doubleCastedToByte = (byte) myDouble;

        System.out.printf("Original double = %.20f, as float = %.20f, as int = %d, as char = '%c', as byte = %d%n", 
        myDouble, doubleCastedToFloat, doubleCastedToInt, doubleCastedToChar, doubleCastedToByte);
    }

    public static void floatingPointPrecisionIssues() {
        double sum = 0;
        double a = 5.6;
        double b = 5.8;
        sum += a;
        sum += b;

        System.out.printf("Floating point imprecision: %.3f + %.3f = %s%n", a, b, sum);

        BigDecimal preciseA = BigDecimal.valueOf(a);
        BigDecimal preciseB = BigDecimal.valueOf(b);
        BigDecimal preciseSum = preciseA.add(preciseB);

        System.out.printf("BigDecimal precision: %.3f + %.3f = %s%n", preciseA, preciseB, preciseSum);
    }
}
