public class SuperArray {
  private String[] data;
  private int size; //how many things- the current array size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size < data.length) {
        data[size] = element;
        size++;
        return true;
    }
    else if (size >= data.length){
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
    String[] newArray = new String[data.length * 2 + 1];
    for (int i = 0; i < data.length; i++) {
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public void clear() {
    data = new String[data.length];
    size = 0;
  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < size() - 1; i++) {
      ans += get(i) + ", ";
    }
    ans = ans + get(size() - 1) + "]";
    return ans;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size(); i++) {
      if (data[i] == s) {
        return true;
      }
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapcity];
    size = 0;
  }
}
