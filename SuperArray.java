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
    else if (size() >= data.length){
      resize();
      add(element);
      return true;
    }
    else return false;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String replaced = get(index);
    data[index] = element;
    return replaced;
  }

  private void resize() {
    String[] newArray = new String[data.length + 10];
    data = newArray;
  }
}
