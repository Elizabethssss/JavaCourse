package org.lesson1.tester;

public class MyTest {

    @Before
    public void before1(){
        System.out.println("before 1");
    }

    @After
    public void after1() {
        System.out.println("after 1");
    }

    @BeforeAll
    public void beforeAll1(){
        System.out.println("before All 1");
    }

    @AfterAll
    public void afterAll1() {
        System.out.println("after All 1");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test(exceptionClass = NullPointerException.class ,msg = "exception")
    public void testExe1()
    {
        throw  new NullPointerException();
    }

    @Test(exceptionClass = NullPointerException.class ,msg = "exception")
    public void testExe2()
    {
        throw  new RuntimeException();
    }


    @Test
    public void test2(){
        System.out.println("test2");
    }


    private void noTest(){
        System.out.println("no a test");
    }
}
