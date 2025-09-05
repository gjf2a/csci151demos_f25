public class Example2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 3;
        }

        printArray(nums);

        addToEach(nums, 2);
        printArray(nums);
    }

    public static void addToEach(int[] nums, int addTo) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] += addTo;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
