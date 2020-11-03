public class SuperArray {
  private String[] data;
  private int size; //the current array size

  public SuperArray() {
    data = new String[10];
  }

  public int size() {
    int ans = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] == null) i = data.length;
      else ans++;
    }
    return ans;
  }

  public boolean add(String element) {
    if (size() < data.length) {
        data[size()] = element;
        return true;
    }
    else return false;

  }
}
