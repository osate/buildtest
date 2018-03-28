package lwrage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int get5() {
        return 5;
    }

    /**
     * Untested functionality!
     */
    public static String getA() {
        return "A";
    }
    
    /**
     * Compile error
     */
    public static int get6() {
        return "A"
    }
}
