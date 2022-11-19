package ba.unsa.etf.rpr;

import java.util.ArrayList;

/**
 * @author Amer Musinbegovic
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String s = "amer plaho     jede govana";
        String[] s2 = s.split("\\s+");
        for(String t: s2)
            System.out.println(t);
    }
}
