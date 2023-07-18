//Student Name: Trina Dang
//LSU ID: 899459534

package recursionproject;

public class Fibonacci {
    
    /**
    * 
    * @param n - Position of the Fibonacci number
    * @return Value of the number at n position calculated recursively
    */
    public static long recursiveFib(int n){
        //The first two numbers are 1
        if (n <= 2){
            return 1;
        } else {
            //The next number is made by adding the other two previous numbers
            return recursiveFib(n-2) + recursiveFib(n-1);
        }
    }
   
    /**
    * 
    * @param n - Position of the Fibonacci number
    * @return - Value of the number at n position calculated iteratively
    */
    public static long iterativeFib(int n){
        //The first two positions are 1
        if(n <= 2){
            return 1;
        } else {
        //The rest of the fib nums are calculateed using the first two nums
            long numOne = 1;
            long numTwo = 1;
            long numThree = 2;            
            for(int i = 4; i <= n; i++){
                numOne = numTwo;
                numTwo = numThree;
                numThree = numOne + numTwo;                
            }                        
            return numThree;
        }
    }
}
