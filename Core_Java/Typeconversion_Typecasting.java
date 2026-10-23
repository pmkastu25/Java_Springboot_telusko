public class Typeconversion_Typecasting {
    public static void main(String[] args) {
        // Assign value with type
        //Assign int to byte --> loose some data --> error ...vice versa is true

        byte b = 127;
        int a = 256;
        // b = a;  --> error --> cannot convert from int to byte
        a = b; //Assign byte to int --> Implicit conversion
        System.out.println(a);

        byte b1 = 127;
        int a1 = 12;
        // b = a;  --> error --> cannot convert from int to byte but-->
        b1 = (byte)a1; // as a1 is 12 can be type casted to byte as it lies in range -128 to 127; --> explicit conversion
        // a1 = b1; //Assign byte to int --> will also work --> implicit conversion
        System.out.println(b1);


        float f = 5.6f;
        int x = (int) f; //loose point values --> typecast --> lost point values
        System.out.println(x); //5 is output

        byte b2 = 127;
        int a2 = 257; //bigger num --> Modulus concept is used
        b2 = (byte)a2; //Convert into modulo...uses modulus concept...257%256; ---> (number % range) ---> range of byte is 256 (-128 to 127) --> remainder is 1 is the answer;
        System.out.println(b2);

        byte b3 = 125;
        int a3 = b3;
        System.out.println(a3);

        int n2 = 12;
        // byte b5 = n2; error
        byte b5 = (byte)n2;
        System.out.println(b5);

        n2 = 257; //out of range --> Modulus operation (number % range) --> (257 % 256(byte range) --> remainder 1)
        b5 = (byte)n2;
        System.out.println(b5);

        //TypeConversion --> automatic/implicit conversion; --> TypeCasting is explicit conversion

        //TypePromotion
        byte b6 = 10;
        byte b7 = 30;

        //b6 * b7 (10 * 30 = 300) --> going out of byte range(256);
        int res = b6 * b7; //store or promote value to int value;
        System.out.println(res);
    }
}
