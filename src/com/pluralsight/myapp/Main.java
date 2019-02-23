package com.pluralsight.myapp;

import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.CalculateBase;
import com.pluralsight.calcengine.CalculateHelper;
import com.pluralsight.calcengine.Divider;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.Multiplier;
import com.pluralsight.calcengine.Subtracter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //Using BufferedReader Class
        /*BufferedReader reader = null;
        int count = 0;
        try {

            reader = new BufferedReader(new FileReader("C:\\Users\\Alaka.Alaka-PC\\Documents\\numbers.docx"));

            String line = null;
            count = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println("line " + count + " = " + line);
                count++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
*/

        String[] statements = {
                "Add 1.0",
                "Add xx 2.0",
                "Addx 1.0 2.2",
                "Add 2.0 3.0",
                "Subtract 4.0 1.3",
                "Multiply 2.4 6.2",
                "Divide 3.8 2.1"
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println(" Original Exception: " + e.getCause().getMessage());
            }
        }


        /*MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation('a', 12.0, 13.0);
        equations[1] = new MathEquation('s', 10.0, 13.0);
        equations[2] = new MathEquation('d', 12.0, 3.0);
        equations[3] = new MathEquation('m', 10.0, 13.0);*/

//        equations[4] = create(12.0, 13.0, 'a');

        /*double[] leftVals = {12.0, 13.0, 14.0, 15.0};
        double[] rightVals = {11.0, 10.0, 9.0, 8.0};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];*/

        /*for (MathEquation equation :
                equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }*/

        /*System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        int leftVal = 9;
        int rightVal = 4;
        MathEquation equationOverloads = new MathEquation('d');
        equationOverloads.execute(leftVal, rightVal);

        System.out.print("result = ");
        System.out.println(equationOverloads.getResult());*/


        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Adder(2.0d, 3.0d),
                new Subtracter(4.0d, 2.1d),
                new Divider(5.0d, 2.0d),
                new Multiplier(3.0d, 2.0d)
        };

        for (CalculateBase calculator: calculators){
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }
}
