package _8_ArraySearching;

public class floorAndCeilByBinarySearch {
  public static int floorFromArrayByBinarySearch(int arr[], int target){
    int floor = -1, start = 0, end = arr.length-1, mid;
    while(start<=end){
      mid = start + (end-start)/2;
      if(arr[mid] == target){
        return arr[mid];
      }else if(arr[mid] < target){
        start = mid-1;
        floor = arr[mid];
      }
      else{
        end = mid + 1;
      }
    }
    return floor;
  }
  public static void main(String[] args) {

  }
}
