import java.util.Arrays;
public class Driver{

  public static void main(String[]artie){

    /*int[] randish = new int[Integer.parseInt(artie[0])];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }

    if(artie[1].equals("selection")){
      Sorts.selectionSort(randish);
    }*/
    int[] nums = new int[1000000];
    for(int i = 0 ; i < nums.length; i++){
      nums[i] = 0;
    }


    if(artie[1].equals("bubble")){
      Sorts.bubbleSort(nums);
    }
    /*if(artie[1].equals("test")){
      int[] randish2 = Arrays.copyOf(nums,nums.length);
      int[] randish3 = Arrays.copyOf(nums,nums.length);
      Sorts.selectionSort(nums);
      Sorts.bubbleSort(randish2);
      Arrays.sort(randish3);
      if( Arrays.equals(nums,randish3)){
        System.out.println("Selection Correct!");
      }else{
       System.out.println("Selection BROKEN!!!!");
      }
      if( Arrays.equals(randish2,randish3)){
        System.out.println("Bubble Correct!");
      }else{
       System.out.println("Bubble BROKEN!!!!");
     }*/
    }


}
