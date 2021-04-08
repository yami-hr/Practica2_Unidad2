///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package container;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//
///**
// *
// * @author Hernández Ramírez
// */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({container.ContainerTest.class, container.PackageTest.class, container.MainTest.class, container.WarehouseTest.class})
//public class ContainerSuite {
//
//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//    
//}

package container;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class ContainerSuite extends TestCase {
public ContainerSuite(String testName) {
super(testName);
}
public static Test suite() {
    TestSuite suite = new TestSuite("ContainerSuite");
    suite.addTest(container.MainTest.suite());
    suite.addTest(container.PackageTest.suite());
    suite.addTest(container.ContainerTest.suite());
    suite.addTest(container.WarehouseTest.suite());
    return suite;
    }
    protected void setUp() throws Exception {
    super.setUp();
    }
    protected void tearDown() throws Exception {
    super.tearDown();
    }
}