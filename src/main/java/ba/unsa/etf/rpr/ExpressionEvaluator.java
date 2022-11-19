package ba.unsa.etf.rpr;

import java.util.*;

public class ExpressionEvaluator {

    private void isOperator(){

    }
    /**
     * Evaluates the expression
     * @param expression given as a string
     * @return returns the value of a given expression
     */
    public double evaluate(String expression){
        Stack<String> operators = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        List<String> list = new ArrayList<String>(Arrays.asList(expression.split(" ")));
        while(!list.isEmpty()){

        }
        return 0;
    }
}
