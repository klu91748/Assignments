package Assignment4;

public class LIS {

	public static void main(String[] args) {
		int[] nums = {2,5,3,7,8,6,1,15};
        int[] arr = new int[nums.length];
        int size = 0;        
        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            int b = size;
            while (a != b) {
                int middle = a + (b - a)/2;
                if (arr[middle] < nums[i]) {
                    a = middle + 1;
                }
                else {
                    b = middle;
                }
            }
            arr[a] = nums[i];
            if (a == size)
                size++;
        }
        System.out.println("List: ");
        for (int i : nums) {
        	System.out.print(i + " ");
        }
        System.out.print("\nLongest Increasing Subsequence: " + size);
	}

}
