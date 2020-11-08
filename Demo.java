public class Demo {
  public static void main(String[] args) {

  }
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i >= 0; i--) {
      if (s.indexOf(s.get(i)) != i) s.remove(i);
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray intersection = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) intersection.add(a.get(i));
    }
    return intersection;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray zipped = new SuperArray();
    if (a.size() < b.size()) {
      for (int i = 0; i < a.size(); i++) {
        zipped.add(a.get(i));
        zipped.add(b.get(i));
      }
      for (int i = a.size(); i < b.size(); i++) {
        zipped.add(b.get(i));
      }
    }
    else zip(b, a);
    return zipped;
  }

}
