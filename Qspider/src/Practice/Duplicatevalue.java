package Practice;

public class Duplicatevalue {
public static void main(String[] args) {
	int []arr= {3,5,7,3,8,5};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
}
}
