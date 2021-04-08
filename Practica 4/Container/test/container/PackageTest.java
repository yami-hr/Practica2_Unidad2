/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package container;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Hernández Ramírez
// */
//public class PackageTest {
//    
//    public PackageTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getVolume method, of class Package.
//     */
//    @Test
//    public void testGetVolume() {
//        System.out.println("getVolume");
//        Package instance = null;
//        double expResult = 0.0;
//        double result = instance.getVolume();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
package container;
    import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


    public class PackageTest extends TestCase {
        
    public PackageTest(String testName) {
        super(testName);
}
    public static TestSuite suite() {
    TestSuite suite = new TestSuite(PackageTest.class);
    return suite;
}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
/**
* Test of getVolume method, of class Package.
*/
public void testGetVolume() {
    System.out.println("getVolume");
    Package instance = new Package(1.0);
    double expResult = 1.0;
    double result = instance.getVolume();
    assertEquals(expResult, result);
}
}