public class ErrorTester {
  public static void main(String[] args) {
    //this is the tester for the errors

    //SuperArray constructor
    try {
      SuperArray t1 = new SuperArray(-4);
    } catch (IllegalArgumentException e){
      e.printStackTrace();
      System.out.println("above should be an illegal argument error");
    }

    //get
    try {
      SuperArray t2 = new SuperArray(5);
      t2.get(7);
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("above should be an index error");
    }

    try {
      SuperArray t2 = new SuperArray(5);
      t2.get(-5);
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("above should be an index error");
    }

  }
}
