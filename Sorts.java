public class Sorts{
  public static void selectionSort(int [] ary) {
    //this loop keeps track of the index of the array where you will add the next smallest element
    for (int x = 0; x < ary.length; x++){
      int smallest = ary[x];
      int smallidx = x;
      //this loop loops through the unsorted elements to find the next smallest
      for (int y = x; y < ary.length; y++){
        //if what is at the current index is smaller than the current title holder, replace it
        if (ary[y] < smallest){
          smallest = ary[y];
          smallidx = y;
        }
      }
      //once you have looped through all to find the smallest, put it in order
      // switch the places of what is at the current idx and the small idx so you dont lose what is at the current idx
      ary[smallidx] = ary[x];
      ary[x] = smallest;
    }
  }

  public static void bubbleSort(int[] data){
    boolean sorted = false;
    //each time it loops, sorted checks if the function is done
    while (! sorted){
        int swaps = 0;
        //keeps track of current index of looping array
        for (int y = 0; y < data.length - 1; y++){
          if (data[y] > data[y+1]){
            // variable temporarily stores value so it won't be lost while swapping
            int yval = data[y];
            //swap data
            data[y] = data[y+1];
            data[y+1] = yval;
            swaps ++;
          }
        }
        //if the previous loop did no actual work, then the array has been sorted
        if (swaps == 0){
          sorted = true;
        }
      }
    //}
  }

  public static void insertionSort(int[] data){
    for (int x = 0; x < data.length; x++){
      int xval = data[x];
      for (int y = x - 1; y >= 0; y--){
        if (xval < data[y]){
          data[y+1] = data[y]
        }
        else{
          y = -1;
        }
      }
    }
  }





  //THIS IS TIMOTHY SO's DRIVER
  public static String printArray(int[] ary) {
      String output = "[";
      for(int i=0; i<ary.length-1; i++) {
        output += ary[i] + ", ";
      }
      return output += ary[ary.length-1] + "]";
  }

  public static void main(String[] args) {

      // Google random int generator

      String sorted = "";

      // 8 nums, [0:10]
      int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
      System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

      bubbleSort(test_a);

      sorted = printArray(test_a);
      System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

      if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      // 12 nums, [0:20]
      int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
      System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

      bubbleSort(test_b);

      sorted = printArray(test_b);
      System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

      if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      // 20 nums, [0:100]
      int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
      System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

      bubbleSort(test_c);

      sorted = printArray(test_c);
      System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

      if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      //TEST D
      int[] test_d = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
      System.out.println(printArray(test_d));

      bubbleSort(test_d);

      sorted = printArray(test_d);
      System.out.println(sorted);

      if(sorted.equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      //TEST E
      int[] test_e = {0,0,0,0,0};
      System.out.println(printArray(test_e));

      bubbleSort(test_e);

      sorted = printArray(test_e);
      System.out.println(sorted);

      if(sorted.equals("[0, 0, 0, 0, 0]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      //TEST F
      int[] test_f = {5,4,3,2,1};
      System.out.println(printArray(test_f));

      bubbleSort(test_f);

      sorted = printArray(test_f);
      System.out.println(sorted);

      if(sorted.equals("[1, 2, 3, 4, 5]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

    }

}
