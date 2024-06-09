import org.junit.*;

public class AppTest{

    @Test()
    public void test1(){
        App app = new App();
        Assert.assertEquals(0 , app.add("")) ;
    }

    @Test()
    public void test2(){
        App app = new App();
        Assert.assertEquals(10 , app.add("1,2,3,4")) ;
    }
}