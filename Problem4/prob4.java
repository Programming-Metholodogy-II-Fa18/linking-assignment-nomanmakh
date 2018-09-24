package Assignment1package;

import java.util.ArrayList;

public class prob4{
	
	public String reverse(String string){
		int i =0;
		char [] arr = string.toCharArray();
		String stringr = "";
		for(i=string.length();i>=0;i--) {
			stringr = stringr + arr[i];
			
		}
		return stringr;
	}
	public String find(int[][] mat,int target){
		String answer = "";
		for(int i=0;i<mat.length;i++) {
			
			for(int j=0;j<+mat[0].length;j++) {
				int val = target-mat[i][j];
				for(int k=0;k<mat.length;k++) {
					
					for(int m=0;m<+mat[0].length;m++) {
						if (i==k && j==m) {
							
						}
						else {
							int val2 = mat[k][m];
							if(val2 ==val) {
								answer = answer  + "("+val+","+val2+") and";
							}
						}
						
					}
				}
			}
		}
		int num = answer.length()-4;
		String answer1 = answer.substring(0, num);
		return answer1;
	}
	public int ProblemFourC(int n) {
		ArrayList<Integer> vars = new ArrayList<Integer>();
		if(n==0) {
			return 1;
		}
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				for(int k=0;k<=4;k++) {
					System.out.println(i+" "+j+" "+k+" ");
					int minimum = (int)Math.pow(9,i)*(int)Math.pow(15,j)*(int)Math.pow(7,k);
					if(!vars.contains(minimum)) {
						vars.add(minimum);
					}
				}
			}
		}
		int[] arr = new int[vars.size()];
		for(int i =0;i<vars.size();i++) {
			arr[i]= vars.get(i);
		}
		int len = arr.length;
		for(int i=1;i<len;++i) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		return arr[n];
			
			
	}
}