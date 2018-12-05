public class Sorts{
  public static void selectionsort(int [] ary) {
    for (int x = 0; x < ary.length; x++){
      int smallest = ary[x];
      int smallidx = x;
      for (int y = 0; y < ary.length; y++){
        if (ary[y] < smallest){
          smallest = ary[y];
          smallidx = y;
        }
      }
      ary[smallidx] = ary[x];
      ary[x] = smallest;
    }
  }
}
