package ba.unsa.etf.rpr;

import java.util.*;

public class ExpressionEvaluator {

    /**
     * private method that uses corresponding operator
     * @param ops String Stack that holds operands as characters
     * @param vals Double Stack that holds all the operands
     */
    private static void compute(Stack<String> ops, Stack<Double> vals){
        String op = ops.pop();
        double v = vals.pop();
        if(op.equals("+")) v = vals.pop() + v;
        else if(op.equals("-")) v = vals.pop() - v;
        else if(op.equals("*")) v = vals.pop() * v;
        else if(op.equals("/")) v = vals.pop() / v;
        else if(op.equals("sqrt")) v = Math.sqrt(v);
        vals.push(v);
    }

    /**
     * private method that deals with one sign using Dijkstra algorithm
     * @param character one character from a given string expression
     * @param ops String Stack that holds operands as characters
     * @param vals Double Stack that holds all the operadns
     */
    private static void pushOneCharacter(String character, Stack<String> ops, Stack<Double> vals){
            if (character.equals("(")) ;
            else if (character.equals("+")) ops.push(character);
            else if (character.equals("-")) ops.push(character);
            else if (character.equals("*")) ops.push(character);
            else if (character.equals("/")) ops.push(character);
            else if (character.equals("sqrt")) ops.push(character);
            else if (character.equals(")")) compute(ops, vals);
            else vals.push(Double.parseDouble(character));

    }
    /**
     * Evaluates the expression using Dijkstra algorithm
     * @param expression given as a string
     * @return returns the value of a given expression
     */
    public double evaluate(String expression){
        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();
        for(String character: expression.split("\\s+"))
            pushOneCharacter(character, operators, values);
        return values.pop();
    }
}
