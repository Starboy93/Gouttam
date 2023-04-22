package Bubbleshot;

public class Bubbleshot1 {
	public static void main(String[] args)
	{
	 int[] arr={1,12,4,56,87,5};
	 for(int i=1;i<arr.length;i++)
	 {
		 for(int j=1;j<arr.length;j++)
		 {
			 if(arr[j-1]>arr[j])
			 {
				 int temp=arr[j-1];
				 arr[j-1]=arr[j];
				 arr[j]=temp;
			 }
		 }
		 
	 }
	 for(int i=0;i<arr.length;i++)
		 System.out.println(arr[i]);
	}

}
