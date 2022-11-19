package ba.unsa.etf.rpr;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExpressionEvaluatorTest {

    @Test
    public void evaluate1(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        assertEquals(9.0, evaluator.evaluate("( 6 + 3 )"), 0.001);
    }

    @Test
    public void evaluate2(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        assertEquals(3.0, evaluator.evaluate("( sqrt ( ( ( ( 6 + 3 ) * 3 ) - 0 ) / 3 ) )"), 0.001);
    }

    @Test
    public void evaluate4(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        assertThrows(Exception.class, () ->{evaluator.evaluate("( sqrt ( ( ( ( 6 + 3 ) * 3 ) - 1 ) / 0 ))");});
    }
    @Test
    public void evaluate3(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        assertThrows(Exception.class, () ->{evaluator.evaluate("(sqrt ( ( ( ( 6 +3) * 3 ) - 0 ) / 3 ) )");});
    }

    @Test
    public void evaluate5(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        assertEquals(-3.0, evaluator.evaluate("( 6 - 9 )"), 0.001);
    }
}
