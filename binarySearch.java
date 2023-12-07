public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int key = 3;
        int ans = search(arr, key);
        System.out.println(ans);
    }

    static int search(int[]arr, int target){  
        int start = 0;
        int end = arr.length -1;

        if (arr[0] < arr[arr.length -1]) {
         
        while (start <= end) {
            int mid = (start + end) /2;
            if (target == arr[mid]) {
                return mid;
            }if (target > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }   
        }else{

        while (start <= end) {
            int mid = (start + end) /2;
            if (target == arr[mid]) {
                return mid;
            }if (target > arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        }

        return -1;
    }
}
