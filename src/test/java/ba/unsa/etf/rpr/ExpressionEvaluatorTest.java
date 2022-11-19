package ba.unsa.etf.rpr;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExpressionEvaluatorTest {

    @Test
    public void evaluate(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        assertEquals(9, (int)evaluator.evaluate("( 6 + 3 )"));
    }
}
