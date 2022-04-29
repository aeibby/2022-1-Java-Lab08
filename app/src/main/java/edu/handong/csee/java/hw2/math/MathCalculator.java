package edu.handong.csee.java.hw2.math;

/**
 * This public class acts as a Math Calculator
 * and calculates different formulas.
 * It also contains the person's name and gives out
 * the name, function and numbers input by the person.
 * @author 21900842
 */
public class MathCalculator {
    
    /**
     * This private class is responsible for the name.
     */
    private String name;


    /**
     * This method is used to determine the name
     * and starts running the name.
     */
    public void setName(String startName) {
        name = startName;
    }

    /**
     * This method is used to return the name inputted.
     * bLABLALA
     * hhah
     */
    public String getName(){
        return name;   
    } 

    /**
     * This method calculates the Maximum of the values
     */
    public int getMax(int a, int b){
        return Math.max(a, b);
    }

    /**
     * This method calculates the Minimum of the values
     */
    public int getMin(int a, int b){
        return Math.min(a, b);
    }

    /**
     * This method calculates the absolute value
     */
    public int getAbs(int a){
        return Math.abs(a);
    }

    /**
     * This method calculates the sum of the values
     */
    public int getSum(int a, int b){
        return (a + b);
    }

    /**
     * This method calculates the different of the values
     */
    public int getDiff(int a, int b){
        return (a - b);
    }

    /**
     * This method calculates the multiplication of values
     */
    public int getProduct(int a, int b){
        return (a * b);
    }

    /**
     * This method calculates the division of values
     */
    public int getQuotient(int a, int b){
        return (a / b);
    }

    /**
     * This method calculates the remainder of the division of the values
     */
    public int getRemainder(int a, int b){
        return (a%b);
    }

    /**
     * This method calculates the power of the values
     */
    public int getPower(int a, int b){
        return (int) Math.pow(a, b);
    }

    /**
     * This method calculates the factorial of the value
     */
    public int getFactorial(int num){
        int i,fact=1;
        for(i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }

    /**
     * This value calculates the GCD value between two values
     */
    public int getGcd(int x, int y){
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * THis value calculates the LCM value between two values
     */
    public int getLcm(int a, int b){
         if (a == 0 || b == 0){
             return 0;
         }
         else{
             int gcd = getGcd(a,b);

             return (Math.abs(a*b) / gcd);
         }
     }

    /**
     * This value calculates the square of the value
     */
    public int getSquare(int a){
        return (a*a);
        
    }

}
