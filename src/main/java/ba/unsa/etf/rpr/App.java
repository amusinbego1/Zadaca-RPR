package ba.unsa.etf.rpr;

/**
 * @author Amer Musinbegovic
 * Class that uses first element of parameter args in main method to evaluate the expression
 */
public class App
{
    /**
     * Uses ExpressionEvaluator class to evaluate the given expression
     * @param args first element should be expression in from of String
     * @throws RuntimeException if expression is invalid (valid expression has a space between every charachter)
     */
    public static void main( String[] args )
    {
        try{
            ExpressionEvaluator evaluator = new ExpressionEvaluator();
            System.out.println(evaluator.evaluate(args[0]));
        }
        catch(Exception e){
            throw new RuntimeException("Invalid expression");
        }
    }
}
