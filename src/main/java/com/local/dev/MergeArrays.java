package com.local.dev;

public class MergeArrays {

	public static void main(String[] args) {
		
		String[][] arr1 = new String[4][4];
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				arr1[row][col] = col + "";
			}
		}
		String[][] arr2 = new String[4][4];
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				arr2[row][col] = row + "";
			}
		}
		
		String[][] resultArr = mergeStringArrays(arr1, arr2);
		
		for (int i = 0; i < resultArr.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(resultArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static String[][] mergeStringArrays(String[][]... arrays) {
	    // determine length of 1st dimension.
	    int resultArraySize = 0;
	    for (String[][] arr : arrays) {
	        resultArraySize += arr.length;
	    }
	    // Create new 2Dim Array
	    String [][] result = new String[resultArraySize][];
	    // Fill the new array with all 'old' arrays
	    int index = 0;
	    for (String[][] arr : arrays) {
	        for (String[] array : arr) {
	            // changes within your old arrays will reflect to merged one
	            result[index++] = array;
	        }
	    }
	    return result;
	}
}
