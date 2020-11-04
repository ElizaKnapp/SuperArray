public class ArrayTester {
    public static void main(String[] args) {
        SuperArray t1 = new SuperArray();
        System.out.println(t1.size());
        System.out.println(t1.add("hey there"));
        System.out.println(t1.size());
        System.out.println(t1.get(0));
        System.out.println(t1.set(0, "bob"));
        System.out.println(t1.get(0));
        for (int i = 0; i < 13; i++) {
          t1.add("hello");
        }
        System.out.println(t1.size());
        System.out.println(t1.get(0));
        System.out.println(t1.get(13));
  }

}
