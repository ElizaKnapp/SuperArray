public class ErrorTester {
  public static void main(String[] args) {
    //this is the tester for the errors

    //SuperArray constructor
    try {
      SuperArray t1 = new SuperArray(-4);
    } catch (IllegalArgumentException e){
      e.printStackTrace();
      System.out.println("CONSTRUCTOR illegal argument error");
    }

    //get
    try {
      SuperArray t2 = new SuperArray(5);
      t2.get(7);
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("GET index out of bounds");
    }

    try {
      SuperArray t2 = new SuperArray(5);
      t2.get(-5);
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("GET index negative");
    }

    //set
    try {
      SuperArray t3 = new SuperArray(5);
      t3.set(7, "bobble");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("SET index out of bounds");
    }

    try {
      SuperArray t3 = new SuperArray(5);
      t3.set(-5, "bobble");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("SET index negative");
    }

    //add
    try {
      SuperArray t4 = new SuperArray(5);
      for (int i = 0; i < 5; i++) {
        t4.add("bobble");
      }
      t4.add(5, "bobble");
      System.out.println(t4);
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("ADD index out of bounds");
    }

    try {
      SuperArray t4 = new SuperArray(5);
      t4.add(4, "bobble");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("ADD index out of bounds");
    }

    try {
      SuperArray t4 = new SuperArray(5);
      t4.add(-5, "bobble");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("ADD index negative");
    }

    //remove
    try {
      SuperArray t5 = new SuperArray(5);
      t5.set(7, "bobble");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("REMOVE index out of bounds");
    }

    try {
      SuperArray t5 = new SuperArray(5);
      t5.set(-5, "bobble");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("REMOVE index negative");
    }

  }
}
