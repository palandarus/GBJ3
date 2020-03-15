//@SuppressWarnings("unused")
public class testedClass {

    @Test(priority = 9)
    public void methodInt(int x){
        System.out.println("smth with int "+x);
    }
    @Test(priority = 1)
    public void methodBoolean(boolean x){
        System.out.println("smth with boolean "+x);
    }
    @Test
    public void methodDouble(double x){
        System.out.println("smth with double "+x);
    }
    @Test(priority = 10)
    public void methodFloat(float x){
        System.out.println("smth with float "+x);
    }
    @Test(priority = 4)
    public void methodChar(char x){
        System.out.println("smth with char "+x);
    }
    @Test(priority = 10)
    public void methodString(String x){
        System.out.println("smth with String "+x);
    }
    @BeforeSuite
    public void methodBegin(){
        System.out.println("Begin our class methods");
    }
    @AfterSuite
    public void methodEnd(){
        System.out.println("End our class methods");
    }



}
