public class Loops {
    public static void main(String[] args) {
        //Loops - while, do while, for
        //While - not sure when to terminate the loop;
        int i=0;
        while(i++ <= 5){
            System.out.println(i+" Hi");
            int j=0;
            while(j++ <= 3){
                System.out.println(" "+ j +" Hello");
            }
        }
        System.out.println(i+" Bye");

        /*
1 Hi
 1 Hello
 2 Hello
 3 Hello
 4 Hello
2 Hi
 1 Hello
 2 Hello
 3 Hello
 4 Hello
3 Hi
 1 Hello
 2 Hello
 3 Hello
 4 Hello
4 Hi
 1 Hello
 2 Hello
 3 Hello
 4 Hello
5 Hi
 1 Hello
 2 Hello
 3 Hello
 4 Hello
6 Hi
 1 Hello
 2 Hello
 3 Hello
 4 Hello
7 Bye
        */

        //do-while --> execute block even if the condition is false
        System.out.println();

        int n = 5;
        do{
            System.out.println(n+" Hi");
        } while(n++ <= 4);

        //for loop - Can determine when the loop terminates

        for(int j=0; j<=4; j++){
            System.out.println(j +" For loop");
        }
        System.out.println();

        //Without initialization inside
        int a=1;
        for(;a<=9;){
            System.out.println(a+" For loop(initialization outside)");
            a++;
        }
    }
}

