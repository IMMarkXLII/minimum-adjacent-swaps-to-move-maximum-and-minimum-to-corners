/**

 * @author ashish.adhikari
 */
package algo;

import java.io.IOException;

/**
 * @author ashish.adhikari
 *
 */
public class MinimumAdjacentSwapsToMoveMaximumAndMinimumToCorners {
	public static void main(String args[]) throws IOException {
		int a[] = { 5, 6, 1, 3 };
		int n = a.length;
		minimumSwaps(a, n);
	}

	/**
	 * @param a
	 * @param n
	 */
	private static void minimumSwaps(int[] a, int n) {
		int smallest = a[0], minIndex=0, largest = -1, maxIndex=-1;
		
		for(int i=0;i<n;i++) {
			if(a[i] <= smallest) {
				smallest = a[i];
				minIndex = i;
			}
			if(a[i] > largest) {
				largest = a[i];
				maxIndex = i;
			}
		}
		
		if(maxIndex < minIndex) {
			System.out.println(maxIndex + n-minIndex -1);
		}else {
			System.out.println(maxIndex + n-minIndex -2);
		}
	}
}
