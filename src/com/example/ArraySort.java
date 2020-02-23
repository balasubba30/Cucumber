package com.example;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] num= {2,5,4,1,3,6};
		/*Arrays.sort(num);
		System.out.println(Arrays.toString(num));*/
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i] > num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}

		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

}
