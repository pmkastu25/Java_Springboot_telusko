class ConditionalStmts{
    public static void main(String args[]){
        //if-else
        int x = 8;
        if(x>10 && x<=20){
            System.out.println("hello");
        } else {
            System.out.println("bye");
        }

        //Greater between two numbers
        int a = 9;
        int b = 10;
        if(a > b){
            System.out.println("Greater: "+a);
        } else {
            System.out.println("Greater: "+b);
        }

        //if-elseif-else
        //Greater between three numbers
        int c = 8;
        int d = 7;
        int e = 9;

        if(c>d && c>e){
            System.out.println("Greater: "+c);
        } else if(d>c && d>e){
            System.out.println("Greater: "+d);
        } else {
            System.out.println("Greater: "+e);
        }

        //Ternary operator
        int n = 4;
        String res = (n%2==0) ? n+" is Even": n+" is Odd";
        System.out.println(res);

        //Switch Stmt
        n = 5;
        switch(n){
            case 0: 
            System.out.println("Sunday"); break;

            case 1: 
            System.out.println("Monday"); break;

            case 2: 
            System.out.println("Tuesday"); break;

            case 3: 
            System.out.println("Wednesday"); break;

            case 4: 
            System.out.println("Thursday"); break;

            case 5: 
            System.out.println("Friday"); break;

            case 6: 
            System.out.println("Saturday"); break;

            default: 
            System.out.println("Enter number between 0-6"); break;
        }
    }
}