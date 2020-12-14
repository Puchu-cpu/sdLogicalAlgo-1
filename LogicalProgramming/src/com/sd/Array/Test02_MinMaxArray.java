package com.sd.Array;

public class Test02_MinMaxArray {

	 static int max(int[] ia) {
			int max=0;
			for(int i=0;i<ia.length;i++) {
				if(ia[i]>max) {
					max=ia[i];
				}
			}
			return max;
		}
	 
	 static int min(int[] ia) {
			int min=ia[0];
			for(int i=ia.length-1;i>=0;i--) {
				if(ia[i]<min) {
					min=ia[i];
				}
			}
			return min;
		}
	 
	public static void main(String[] args) {
		int[] ia=new int[] {10,20,30,40,50};

		 System.out.println("Maximum element in Array: "+max(ia));
		 System.out.println("Minimum element in Array: "+min(ia));
		
		 
	}
}
