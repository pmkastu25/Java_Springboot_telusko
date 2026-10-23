public class Datatypes {
    public static void main(String[] args) {
        //Primitive
        /*
        1. Integer --> (-2,-1,0,1,2) ---> (byte, short, int, long)
        2. Float ---> (1.3,1.5) ---> (double, float)
        3. Character ---> (a, b, c)
        4. Boolean --> (true, false)
        */

        // 1. Integer --> 4 bytes 
        int num1 = 9;
        byte b = 2;
        // byte b = 129; ---> error
        short sh = 558;
        long l = 5843l;
        // long l = 5843; error --> mention l in the end to explicitly convert to long;
        System.out.println(num1+" "+b+" "+sh+" "+l);

        // 2. FLoat --> 4 bytes, Double --> 8 bytes
        float num = 3.5f;
        // float num = 3.5; ---> error ---> by default 3.5 is taken as double...then explicitly convert it by mentioning f in the end;
        double marks = 6.5; //default val in java
        System.out.println(num+" "+marks);

        // 3. Character --> 2 bytes
        char c = 'k';
        System.out.println(c);

        // 4. Boolean
        boolean bool = true;
        // boolean bool = 1; --> error --> int cant be converted to bool
        System.out.println(bool);

        // literals
        int n1 = 0b101; //binary format --> 5;
        int n2 = 0x7E; //Hexadecimal _--> 126
        System.out.println(n1+" "+n2);

        int n3 = 10_00_00_000; //easier to identify the number of zeroes
        System.out.println(n3);

        double n4 = 12e10;// 12 * 10^10 //--> integer gets converted to double automatically
        System.out.println(n4);

        //Char cn e incremented
        char chr = 'a';
        System.out.println(chr);
        chr++;
        System.out.println(chr);

        //String Literal 
        System.out.println("Hello Bro");
    }
}
