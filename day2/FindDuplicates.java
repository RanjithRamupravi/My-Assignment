package week1.day2;

public class FindDuplicates {
	public static void main(String[] args) {

		int[] nums = {1, 3, 4, 6, 7, 9, 1, 3, 4, 6, 2, 5, 8};

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {

				if (nums[i]==nums[j]) {

					System.out.println(nums[i]);

				}
			}

		}
	}

}