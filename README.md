# minimum-adjacent-swaps-to-move-maximum-and-minimum-to-corners

  ##  if max element is left of min element, we will need to swap max the same no as its index. The min element will need to be swapped
  ##  last index - index of min element times.
  ##  The case for max element is same as above, but because we already moved min element to the left once when swapping for max element,
  ##  we subtract it by one more just to adjust for that.


```
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
    // if max element is left of min element, we will need to swap max the same no as its index. The min element will need to be swapped
    // last index - index of min element times.
			System.out.println(maxIndex + n-minIndex -1);
		}else {
    //The case for max element is same as above, but because we already moved min element to the left once when swapping for max element,
    // we subtract it by one more to adjust for that.
			System.out.println(maxIndex + n-minIndex -2);
		}
	}
```
