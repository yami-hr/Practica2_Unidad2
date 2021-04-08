/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Hernández Ramírez
 */
public class MainTest extends TestCase{
    
    public MainTest(String testMain) {
        super(testMain);
     
}
    
  public static TestSuite suite() {
 TestSuite suite = new TestSuite(MainTest.class);
  return suite;
  }
  
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        
    }

    
}
