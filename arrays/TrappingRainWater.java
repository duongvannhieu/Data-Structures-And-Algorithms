package arrays;

public class TrappingRainWater {
    public static long trappingWater(int[] arr) {
        long water = 0;
        int leftTrapping = arr[0];
        int rightTrapping = arr[arr.length - 1];
        int left = 1;
        int right = arr.length - 2;

        while (left <= right) {
            if (leftTrapping <= rightTrapping) {
                if (arr[left] < leftTrapping) {
                    long heightOfWatter = leftTrapping - arr[left];
                    water += heightOfWatter;
                } else {
                    leftTrapping = arr[left];
                }
                left++;
            } else {
                if (arr[right] < rightTrapping) {
                    long heightOfWatter = rightTrapping - arr[right];
                    water += heightOfWatter;
                } else {
                    rightTrapping = arr[right];
                }
                right--;
            }
        }

        return water;
    }
    public static void main(String[] args) {
        int arr[] =  {7,4,0,9};
        System.out.print(trappingWater(arr));
    }
}
