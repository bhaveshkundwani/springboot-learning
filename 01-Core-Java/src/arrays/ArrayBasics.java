package arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		
//      int nums[] = {3,7,2,4};
//		nums[1] = 6;
//		System.out.println(nums[1]);
		
//		int nums[] = new int[4];
//		nums[0] = 4;
//		nums[1] = 8;
//		nums[2] = 3;
//		nums[3] = 9;
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println(nums[i]);
//		}
		
		
		// Primitive array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
		
	}
}
