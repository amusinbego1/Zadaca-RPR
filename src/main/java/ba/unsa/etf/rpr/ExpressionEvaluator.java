package ba.unsa.etf.rpr;

import java.util.*;


/**
 * Class with one public method "evaluate".
 */
public class ExpressionEvaluator {

    private Stack<String> operators;
    private Stack<Double> values;

    /**
     * Default constructor making attributes empty
     */
    public ExpressionEvaluator(){
        operators = new Stack<String>();
        values = new Stack<Double>();
    }
    /**
     * private method that uses corresponding operator
     */
    private void compute(){
        String op = operators.pop();
        double v = values.pop();
        switch (op) {
            case "+":
                v = values.pop() + v;
                break;
            case "-":
                v = values.pop() - v;
                break;
            case "*":
                v = values.pop() * v;
                break;
            case "/":
                v = values.pop() / v;
                break;
            case "sqrt":
                v = Math.sqrt(v);
                break;
        }
        values.push(v);
    }

    /**
     * private method that deals with one sign using Dijkstra algorithm
     * @param character one character from a given string expression
     */
    private void pushOneCharacter(String character){
        switch (character) {
            case "(":
                ;
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "sqrt":
                operators.push(character);
                break;
            case ")":
                compute();
                break;
            default:
                values.push(Double.parseDouble(character));
                break;
        }

    }
    /**
     * Evaluates the expression using Dijkstra algorithm
     * @param expression given as a string
     * @return returns the value of a given expression
     */
    public double evaluate(String expression){
        for(String character: expression.split("\\s+"))
            pushOneCharacter(character);
        return values.pop();
    }
}
