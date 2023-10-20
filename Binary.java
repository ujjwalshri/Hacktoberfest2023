public class BinarySearch {

  public static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    int target = 5;

    int index = binarySearch(arr, target);

    if (index == -1) {
      System.out.println("The target value was not found.");
    } else {
      System.out.println("The target value was found at index " + index + ".");
    }
  }
}
