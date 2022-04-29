package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.math.MathCalculator;

/**
 * This public class contains the implementation of
 * runs and compiles the main program
 */
public class MathDriver{
    
    /**
     * Runs the main program
     */
     public static void main(String[] args){
        MathDriver myDriver = new MathDriver();
        myDriver.run(args);
    }

    /**
     * This contains the main programs that run
     * when executed by runner
     */
    public void run(String[] args){
        MathCalculator mathCalculator = new MathCalculator();

        mathCalculator.setName(args[0]);
        
        /**
         * This switch case runs the program
         */
        switch(args[1]){

            /** 
             * Runs maximum value between 2 values
             */
            case "Max":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getMax(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            // TO DO: Fill the rest of the cases
            /**
             * Runs minimum value between 2 values
             */
            case "Min":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getMin(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Runs the absolute value of value
             */
            case "Abs":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getAbs(Integer.parseInt(args[2])));
                break;
            
            /**
             * Runs the sum of the values
             */
            case "Sum":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getSum(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Runs the difference of the values
             */
            case "Diff":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getDiff(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /** 
             * Runs the product of the values
             */
            case "Product":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getProduct(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Runs the quotient function and returns the result
             */
            case "Quotient":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getQuotient(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Returns the remainder after running the calculation
             */
            case "Remainder":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getRemainder(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Runs and gets the power of two
             */
            case "Power":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getPower(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Runs and gets a factorial of the value
             */
            case "Factorial":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getFactorial(Integer.parseInt(args[2])));
                break;
            
            /**
             * Runs the greatest common factor/denominator of the values
             */
            case "Gcd":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getGcd(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;

            /**
             * Runs the lowest common multiple of the values
             */
            case "Lcm":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getLcm(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            
            /**
             * Runs the square of the values
             */
            case "Square":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " + 
                                    mathCalculator.getSquare(Integer.parseInt(args[2])));
                break;
            
            /**
             * Breaks if the input is not following the format
             */
            default:
                System.out.println("Invalid command");
                break;
        }

    }
}