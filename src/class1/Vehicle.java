package class1;

public class Vehicle {
    // main class

    public static void main(String[] args){



//        System.out.println("Hi Alok!");
//        System.out.println("Hi Alok!");
        long a = 21474836L; // 10l
        int b = 61; // 2l
        int c = (int)(a + b); // 12l => 5 and loose 7l

        double d = 6.934534553234232342353455342;
        float f = 6.934534553234232342353455342F;

        char ch1 = '1';
        char ch2 = '2';

        char ch = '=';

        boolean b1 = false;


        char ans = (char)((ch1 - '0') + (ch2 - '0') + '0');

//        char ch3 = (char)('0' + (char)ans);


//        System.out.println(d);
//        System.out.println((char)b);
        System.out.println(b1);
    }
}

/*
1 -> 6.9345345
2 -> 6.934534553234232342353455342
3 -> None of the above

Data types in Java

Primitive vs non-primitive

Primitive data types
link: https://cs.fit.edu/~ryan/java/language/java-data.html
Numeric ->
Integer
1. byte - 1 byte
2. short - 2 bytes
3. int - 4 bytes - 32 bits [-2147483648 to 2147483647]
4. long -

Decimal
1. float - 4 bytes - 3.40282347 x 10^38, 1.40239846 x 10^-45
2. double - 8 bytes

Character - 2 bytes
a - z, A - Z, &, ^, #, !, *,

Boolean - 1 bit
True and False
1         0
 */
