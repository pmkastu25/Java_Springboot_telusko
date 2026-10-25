public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        // +, -, /, %, *, ++, --, +=, -=, *=, /=;
        System.out.println("----------------------------Arithmetic Operators------------------------------");
        int num1 = 7;
        int num2 = 5;

        int res = num1 + num2;
        System.out.println(res);

        int res1 = num1 - num2;
        System.out.println(res1);

        int res2 = num1 / num2;
        System.out.println(res2);

        //Modulus Operator --> find remainder
        int res3 = num1 % num2;
        System.out.println(res3);

        // num1 = num1 + 2;
        num1 += 2;
        System.out.println(num1);

        num1 -= 2;
        System.out.println(num1);

        num1 *= 4;
        System.out.println(num1);

        num1 /= 2;
        System.out.println(num1);

        //num1 += 1;
        //Increment
        num1++; //post-increment
        System.out.println(num1);

        //Decrement
        num1--;
        System.out.println(num1);

        ++num1; // pre-increment
        System.out.println(num1);

        //reassign val;
        num1 = 4;
        int result = ++num1; //5 ...first increment value then fetch val
        System.out.println(result);

        int result1 = num1++; //5 ...first fetch value then increment
        System.out.println(result1);

        System.out.println(num1); //6

        //Relational operators --> True or false;
        // < (gt), > (lt), =(Assignment operator), ==(Compare values) , != (not equal), <=, >=
        System.out.println("----------------------------Relational Operators------------------------------");
        double x = 9.9;
        double y = 6.7;

        boolean ress1 = x > y;
        System.out.println(ress1); //true
        System.out.println(4 < 6); //true
        System.out.println(4 > 6); //false
        System.out.println(9 == 9); //true
        System.out.println(6 <= 6); //true
        System.out.println(4 >= 6); //false
        System.out.println(4 != 6); //true

        //Logical Operators
        /*
          AND (bitwise & and  logical &&), OR (bitwise | and logical ||), NOT (!), XOR (^)

          1. AND (If Both T then T else F)

          T & T --> T 
          T & F --> F
          F & T --> F
          F & F --> F

          2. OR (Anyone true --> true)

          T | T --> T
          T | F --> T
          F | T --> T
          F | F --> F

          3. NOT

          !T --> F
          !F --> T

          Shortcircuit ((and)&&, (or)||) --> saving time


        */

          System.out.println("----------------------------Logical Operators------------------------------");
          int a = 7;
          int b = 5;

          int c = 5;
          int d = 9;

          boolean r = a > b && c > d; // T and F --> F
          System.out.println(r); //false

          boolean r1 = a > b && c < d; // T and T --> T
          System.out.println(r1); //True

          boolean r2 = a > b || c < d; // T or T --> T
          System.out.println(r2); //True

          boolean r3 = a > b || c < d || a > 1; // T or T or T --> T
          System.out.println(r3); //True

          boolean r4 = a > b ; //True
          System.out.println(!r4); //false
    }
}
