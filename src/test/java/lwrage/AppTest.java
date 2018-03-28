package lwrage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Another rigorous test...
     */
    public void testAppGetter()
    {
        assertEquals(5, App.get5());
    }
    
    

    /**
     * Add additional test
     */
    public void testOtherAppGetter()
    {
        assertEquals(6, App.get6());
    }
}
