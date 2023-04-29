//2. How do you search for an element in a sorted and rotated array in Java?

import java.util.*;
import java.io.*;


public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(target == nums[mid]) {
                return mid;
            }

            if(nums[start] <= nums[mid]) { 
                if(target >= nums[start] && target < nums[mid]) { 
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else { 
                if(target > nums[mid] && target <= nums[end]) { 
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
        int n = sc.nextInt();
        int[] nums = new int[n];
		System.out.println("Enter array element :");
        for(int i = 0; i < n; i++) {
          nums[i] = sc.nextInt(); 
        }
		System.out.println("Enter element to be search :");
        int target = sc.nextInt();
        

        System.out.printf("Search(%d) = %d%n", target, search(nums, target));
    }
}