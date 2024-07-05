package methods;
//Print number 5 to 1
public class Recursion {
//    public static void printNum(int n){
//        if (n==0){          //Base Case
//            return ;
//        }
//        System.out.println(n);
//        printNum(n-1);         //Recursion applied
//    }
//
//    public static void main(String[] args) {
//        int n=5;
//        printNum(n);
//
//    }


    // print number 1 to 5
//    public static  void printNum(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//    }
//
//    public static void main(String[] args) {
//        int n=1;
//        printNum(n);
//    }

    //PRINT SUM OF N NATURAL NOS

//    public static void printSum(int i,int n,int sum){
//        if(i==n){
//            sum +=i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1, n, sum);
//        System.out.println(i);
//
//    }
//
//    public static void main(String[] args) {
//        printSum(1,10,0);
//    }


    //PRINT THE FACTORIAL OF N

//    public static int calcfactorial(int n){
//        if (n == 1 || n ==0) {
//            return 1;
//        }
//        int fac_no=calcfactorial(n-1);
//        int fact_n= n*fac_no;
//        return fact_n;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(calcfactorial(5));
//    }


    //Fibonacci Series

//    public static void printFib(int a, int b,int n){
//        if(n==0){
//            return;
//        }
//        int c= a+b;
//        System.out.println(c);
//        printFib(b,c,n-1);
//
//    }
//
//    public static void main(String[] args) {
//        int a=0, b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n=7;
//        printFib(a,b,n-2);


//    //Print X^n (Stack height =n)
//
//    public static int calcPower(int x, int n) {
//        if(n==0){
//            return 1;     //BaseCase 1
//        }
//        if(x==0){
//            return 0;   //BaseCase 2
//        }
//       int xPower1 = calcPower(x,n-1);
//       int xpower = x * xPower1;
//       return xpower;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(calcPower(2,5));
//    }

    //Print X^n (Stack height =Logn)

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;     //BaseCase 1
        }
        if (x == 0) {
            return 0;   //BaseCase 2
        }
        //if n is even
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcPower(2, 5));
    }
}




