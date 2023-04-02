

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JunitTest {
    @BeforeClass
    public static void beforeTestClass() {
        System.out.println("Hello BeforeClass");
    }

    @Before
    public void beforeTest() {
        System.out.println("Hello Before");
    }

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void test2() {
        System.out.println("Hello Test 2");
    }

    @After
    public void afterTest() {
        System.out.println("Hello After");
    }

    @AfterClass
    public static void afterTestClass() {
        System.out.println("Hello AfterClass");
    }

}

