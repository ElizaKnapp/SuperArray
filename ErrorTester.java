public class ErrorTester {
  public static void main(String[] args) {
    //this is the tester for the errors

    //SuperArray constructor
    try {
      SuperArray t1 = new SuperArray(-4);
    } catch (IllegalArgumentException e){
      e.printStackTrace();
      System.out.println("above should be an error");
    }
  }
}
