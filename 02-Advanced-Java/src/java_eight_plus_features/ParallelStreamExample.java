package java_eight_plus_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		int size = 10_000;
		List<Integer> nums = new ArrayList<>(size);
		
		Random random = new Random();
		
		for (int i = 1; i <= size; i++) {
			nums.add(random.nextInt(100));
		}
		
		// System.out.println(nums);
		
//		int sum1 = nums.stream()
//					.map(i -> i * 2)
//					.reduce(0,  (c, e) -> c + e);
		
		long startSeq = System.currentTimeMillis();
//		int sum2 = nums.stream()
//					.map(i -> i * 2)
//					.mapToInt(i -> i)
//					.sum();
		int sum2 = nums.stream()
				.map(i -> {
					try {
						Thread.sleep(1);
					} catch(Exception e) {
						
					}
					return i * 2;
				})
				.mapToInt(i -> i)
				.sum();
		long endSeq = System.currentTimeMillis();
		
		
		long startPara = System.currentTimeMillis();
//		int sum3 = nums.parallelStream()
//				.map(i -> i * 2)
//				.mapToInt(i -> i)
//				.sum();
		int sum3 = nums.parallelStream()
				.map(i -> {
					try {
						Thread.sleep(1);
					} catch(Exception e) {
						
					}
					return i * 2;
				})
				.mapToInt(i -> i)
				.sum();
		long endPara = System.currentTimeMillis();
		
		// System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println("Seq : " + (endSeq - startSeq));
		System.out.println("Seq : " + (endPara - startPara));
		
	}

}
