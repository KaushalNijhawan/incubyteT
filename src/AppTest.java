import org.junit.*;

public class AppTest{

    @Test()
    public void emptyStringCheck(){
        App app = new App();
        Assert.assertEquals(0 , app.add("")) ;
    }

    @Test()
    public void largeNumbersOfInputCheck(){
        App app = new App();
        Assert.assertEquals(10 , app.add("1,2,3,4")) ;
    }

    @Test()
    public void newLineCharacterCheck(){
        App app = new App();
        Assert.assertEquals(12 , app.add("1\n2,2,3,4")) ;
    }
}