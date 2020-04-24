package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestDifference {

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
   	//Use Scanner to get input from console
	Scanner sc=new Scanner(System.in);
	int n=0;
		n=sc.nextInt();

		int[] numbers=new int[n];
	for(int i=0;i<n;i++)
	{
		numbers[i]=sc.nextInt();
	}
int value=LargestDifference.findLargestDifference(numbers);
		System.out.println(value);



	}

	public static int findLargestDifference(int[] numbers)
	{
		int sub=0;
		int len=numbers.length;
		List<Integer> poslist = new ArrayList<Integer>();

		int[] outarray=new int[len-1];
		if(numbers==null || numbers.length==0){

			return -1;
		}

		for(int j=0;j<len-1;j++) {

			sub = Math.abs(numbers[j] - numbers[j + 1]);
			outarray[j] = sub;
		}
		int temp;
		int max=outarray[0];
		poslist.add(0);
		for (int i = 1; i < outarray.length; i++) {

				if(outarray[i]==max) {
					poslist.add(i);

				}
				else if(outarray[i]>max){
						max=outarray[i];
						poslist.clear();
						poslist.add(i);

				}
			}
	/*	for(int i=0;i<poslist.size();i++)
		{

			System.out.println(poslist.get(i));
		}*/
		int x=poslist.size();
		if(x==1)
		{
			//no multiple number exist
			int val=poslist.get(0);
			 //System.out.println(val);
			int y=val;
			if (numbers[y] > numbers[y+1]) {
				//System.out.println(y);
				return y;
			}
			else if(numbers[y]<numbers[y+1]){
				//System.out.println(y+1);
				return y+1;

			}
		}
		else if(x>1){
			//multiple exist
			int maxnum=0;
			int maxindex=0;

			for(int i=0;i<poslist.size();i++){
				int VAL=poslist.get(i);
				if(numbers[VAL]>numbers[VAL+1]){

					if(numbers[VAL]>maxnum){
						maxnum=numbers[VAL];
						maxindex=VAL;


					}
				}
				else if(numbers[VAL]<numbers[VAL+1])
					{
						if(numbers[VAL+1]>maxnum){
							maxnum=numbers[VAL+1];
							maxindex=VAL+1;

						}
					}
				else if(numbers[VAL]==numbers[VAL+1]){
					maxnum=numbers[VAL];
					maxindex=VAL;

				}


			}
			//System.out.println("max index"+maxindex);
			return maxindex;

			 }
		//return maxindex;
		return 0;
	}


}
