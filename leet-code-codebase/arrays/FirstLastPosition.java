public class FirstLastPosition {

    // Method to find first and last position of target
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // Find first occurrence
        int first = search(nums, target, true);

        // Find last occurrence
        int last = search(nums, target, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        FirstLastPosition obj = new FirstLastPosition();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }
}
