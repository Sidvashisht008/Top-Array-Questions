package first_project;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class infosys2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[] {11,11,2,3,4,5,6};
		minMaxArray(arr);
		reverseArray(arr);
		kthLargestSmallest(4,arr);
		occurrence(arr,11);
		peak(new int[] {10, 20, 15, 2, 23, 90, 67});
		zeroesAndOnes(new int[] {0, 1, 0, 1, 0, 0, 1, 1, 1, 0});
		zeroesOnesTwoes(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
		moveNegative(new int[] {-12, 11, -13, -5,
                6, -7, 5, -3, 11});
		subArraySum(new int[] {15, 2, 4, 8, 9, 5, 10, 23}, 23);
		intersection(new int[] {1, 3, 4, 5, 7}, new int[] {2, 3, 5, 6});
		union(new int[] {1, 3, 4, 5, 7}, new int[] {2, 3, 5, 6});
		rotateArray(new int[] {1, 2, 3, 4, 5},2);
		missingInteger(new int[] {1, 2, 4, 6, 3, 7, 8}, 8);
		targetSum(new int[] {1, 5, 7, -1},6);
		targetSumSorted(arr, 0);
		findDuplicates(new int[] {1, 2, 3, 6, 3, 6, 1});
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
        int arr2[] = { 6, 7, 20, 80, 100 };
        int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        unionThreeArrays(arr1,arr2,arr3);
		firstRepeating(new int[] {10, 5, 3, 4, 3, 5, 6});
		subArrayWithZeroSum(new int[] {4, 2, -3, 1, 6,0});
		subArrayEqual0sAnd1s(new int[] { 1, 0, 0, 1, 1, 0, 0, 1});
		firstNonRepeatingElement(new int[] { -1, 2, -1, 3, 0});
		firstNonRepeatingElementExtraSpace(new int[] { -1, 2, -1, 3, 0});
		factorial(6);
		factorialBig(100);
		prodSubArray(new int[] {6, -3, -10, 0, 2});
		maxSumSubArray(new int[] {-2, -3, 4, -1, -2, 1, 5, -3});
		tripletSum(new int[] {1,2,3,4,5}, 9);
		majorityElement(new int[] {3, 3, 4, 2, 4, 4, 2, 4});
		 int mat[][] = { {0, 0, 0, 1},
                 {0, 1, 1, 1},
                 {1, 1, 1, 1},
                 {0, 0, 0, 0}};
		maxOneIn2DArrray(mat);
	}
	public static void minMaxArray(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max+" "+min);
	}
	public static void reverseArray(int[] arr) {
		int lo =0;
		int hi = arr.length-1;
		while(lo<hi) {
			int last = arr[hi];
			arr[hi] = arr[lo];
			arr[lo] = last;
			lo++;
			hi--;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void kthLargestSmallest(int k,int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[k-1]+" "+
		arr[arr.length-k]);
	}
	
	public static void occurrence(int[] arr,int k) {
		int cnt = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==k) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void peak(int[] arr) {
		String result ="";
		for(int i =0;i<arr.length;i++) {
			if(i==0 && arr[i+1]<arr[i]) {
				result += arr[i] +" ";
			}else if(i==arr.length-1 && arr[i-1]<arr[i]) {
				result+= arr[i] +" ";
			}else if(i!=0 && i!= arr.length-1 && arr[i]>arr[i+1] && arr[i]>arr[i-1]){
				result+=arr[i]+" ";
			}
		}
		System.out.println(result);
	}
	public static void zeroesAndOnes(int[] arr){
		int lo =0;
		int hi = arr.length-1;
		while(lo<hi) {
			while(arr[lo] == 0) {
				lo++;
			}while(arr[hi] == 1) {
				hi--;
			}
			if(lo<hi) {
				arr[lo] = 0;
				arr[hi] = 1;
				lo++;
				hi--;
			}
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}	
	}
	public static void zeroesOnesTwoes(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		int mid = 0;
		while(hi>=mid) {
			if(arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo]= temp;
				lo++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else if(arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi]= temp;
				hi--;
			}
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	public static void moveNegative(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<hi) {
			while(arr[lo]<0) {
				lo++;
			}
			while(arr[hi]>=0) {
				hi--;
			}
			if(lo<hi) {
				int temp= arr[lo];
				arr[lo] = arr[hi];
				arr[hi] = temp;
				lo++;
				hi--;
			}
			
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}
	public static void subArraySum(int[] arr,int sum) {
		for(int i =0;i<arr.length;i++) {
			int csum = 0;
			for(int j=i;j<arr.length;j++) {
				csum+=arr[j];
				if(csum==sum) {
					for(int a=i;a<=j;a++) {
						System.out.print(arr[a]+" ");
					}
					System.out.println();
				}
			}
			
		}
	}
	public static void intersection(int[] arr1,int[] arr2) {
		int firstIndex = 0;
		int secondIndex = 0;
		List<Integer> result = new ArrayList<>();
		int minLength = Math.min(arr1.length, arr2.length);
		while(firstIndex<minLength && secondIndex<minLength) {
			if(arr1[firstIndex] == arr2[secondIndex]) {
				result.add(arr1[firstIndex]);
				firstIndex++;
				secondIndex++;
			}else if(arr1[firstIndex] > arr2[secondIndex]) {
				secondIndex++;
			}else {
				firstIndex++;
			}
		}
		System.out.println(result);
	}
	public static void union(int[] arr1,int[] arr2) {
		int firstIndex = 0;
		int secondIndex = 0;
		List<Integer> result = new ArrayList<>();
		int minLength = Math.min(arr1.length, arr2.length);
		while(firstIndex<minLength && secondIndex<minLength) {
			if(arr1[firstIndex] == arr2[secondIndex]) {
				result.add(arr1[firstIndex]);
				firstIndex++;
				secondIndex++;
			}else if(arr1[firstIndex] < arr2[secondIndex]) {
				result.add(arr1[firstIndex]);
				firstIndex++;
			}
			else if(arr1[firstIndex] > arr2[secondIndex]) {
				result.add(arr2[secondIndex]);
				secondIndex++;
			}
		}
		while(firstIndex<arr1.length) {
			result.add(arr1[firstIndex++]);
		}while(secondIndex<arr2.length) {
			result.add(arr2[secondIndex++]);
		}
		System.out.println(result);
	}
	public static void rotateArray(int[] arr, int r) {
		r = r%arr.length;
		while(r-->0) {
			int last = arr[arr.length-1];
			for(int i = arr.length-1;i>=1;i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = last;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	public static void missingInteger(int[] arr,int n) {
		int sum = (n*(n+1))/2;
		int arrSum = Arrays.stream(arr).sum();
		System.out.println(sum-arrSum);
	}
	//unsorted Array
	public static void targetSum(int[] arr,int sum) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(sum==arr[i]+arr[j]) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	// sorted Array
	public static void targetSumSorted(int[] arr,int sum) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<hi) {
			if(sum == arr[lo]+arr[hi]) {
				System.out.println(arr[lo]+" "+arr[hi]);
				lo++;
				hi--;
			}
			else if(sum > arr[lo]+arr[hi]) {
				lo++;
			}else {
				hi--;
			}
			
		}
	}
	
	public static void findDuplicates(int[] arr) {
		Map<Integer,Integer> countMap = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			if(countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i])+1);
			}else {
				countMap.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> it: countMap.entrySet()) {
			if(it.getValue()>1) {
				System.out.println(it.getKey());
			}
		}
	}
	
	public static void unionThreeArrays(int[] arr1,int[] arr2,int arr3[]) {
		int first = 0;
		int second =0;
		int third = 0;
		while(first<arr1.length && second<arr2.length && third<arr3.length) {
			if(arr1[first] == arr2[second] && arr1[first] == arr3[third]) {
				System.out.print(arr1[first]+" ");
				first++;
				second++;
				third++;
			}
			else if(arr1[first] < arr2[second]) {
				first++;
			}else if(arr2[second]<arr3[third]) {
				second++;
			}else {
				third++;
			}
		}
	}
	
	public static void firstRepeating(int [] arr) {
		int flag=0;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					flag =1;
					break;
				}
			}
			if(flag ==1) {
				break;
			}
		}
	}
	
	public static void subArrayEqual0sAnd1s(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int cnt0 = 0;
			int cnt1 = 0;
			if(arr[i] == 0) {
				cnt0++;
			}
			if(arr[i] == 1) {
				cnt1++;
			}
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j] == 0) {
					cnt0++;
				}else {
					cnt1++;
				}
				if(cnt0==cnt1) {
					System.out.println(1);
				}
			}
			
		}
	}
	
	public static void subArrayWithZeroSum(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			int csum = 0;
			for(int j =i;j<arr.length;j++) {
				csum+=arr[j];
				if(csum == 0) {
					for(int a = i;a<=j;a++) {
						System.out.print(arr[a]+" ");
					}
					System.out.println();
				}
			}
		}
	}
	
	public static void firstNonRepeatingElement(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int flag = 0;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag = 1;
				}
			}
			if(flag == 0) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
	public static void firstNonRepeatingElementExtraSpace(int[] arr) {
		Map<Integer,Integer> countMap = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			if(countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i])+1);
			}else {
				countMap.put(arr[i], 1);
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(countMap.get(arr[i])==1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
//	public static void alternatePositiveAndNegative(int[] arr) {
//		int plus = 0;
//		int minus = 0;
//		while(plus<arr.length && minus<arr.length) {
//			
//		}
//	}
	public static void factorial(int n) {
		int prod =1;
		for(int i =1;i<=n;i++) {
			prod*=i;
		}
		System.out.println(prod);
	}
	
	public static void factorialBig(int n) {
		BigInteger bg = new BigInteger("1");
		for(int i = 1;i<=n;i++) {
			bg =bg.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bg);
	}
	public static void prodSubArray(int[] arr) {
		int maxProd = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			int prod = 1;
			for(int j = i;j<arr.length;j++) {
				prod*=arr[j];
				if(prod>maxProd) {
					maxProd = prod;
				}
			}
		}
		System.out.println(maxProd);
	}
	
	public static void maxSumSubArray(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			int csum = 0;
			for(int j =i;j<arr.length;j++) {
				csum+=arr[j];
				if(csum>maxSum) {
					maxSum=csum;
				}
			}
		}
		System.out.println(maxSum);
	}
	
	public static void tripletSum(int[] arr, int target) {
		for(int lo = 0;lo<arr.length-2;lo++) {
			int hi = arr.length-1;
			int x = lo+1;
			while(x<hi) {
				if(arr[lo]+arr[x]+arr[hi] == target) {
					System.out.println(arr[lo]+" " +arr[x]+" "+arr[hi]);
					x++;
					hi--;
				}
				else if(arr[lo]+arr[x]+arr[hi] > target) {
					hi--;
				}else {
					x++;
				}
			}
		}
	}
	
	public static void majorityElement(int[] arr) {
		Map<Integer,Integer> countMap = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			if(countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i])+1);
			}else {
				countMap.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> it:countMap.entrySet()) {
			if(it.getValue()>arr.length/2) {
				System.out.println(it.getKey());
			}
		}
	}
	
	public static void maxOneIn2DArrray(int[][] mat) {
		int cnt = Integer.MIN_VALUE;
		int r = -1;
		for(int row = 0;row<mat.length;row++) {
			int tempCnt = 0;
			for(int col= 0;col<mat[row].length;col++) {
				if(mat[row][col]==1) {
					tempCnt++;
				}
			}
			if(tempCnt>cnt) {
				cnt=tempCnt;
				r = row+1;
			}
		}
		System.out.println(cnt +"  row - "+r);
	}
}
