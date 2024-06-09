import org.junit.*;

public class AppTest{

    @Test()
    public void test(){
        App app = new App();
        Assert.assertEquals(0 , app.add("")) ;
    }
}