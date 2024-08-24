package PracticeLearn;

public class SecondLargest {

	public static void main(String[] args) {
		 int [] arr = {12,34,45,65,56,78};
			int flarget=0;
			int slarget=0;
			int tlarget=0;
			int num= arr.length;
			
			for (int i = 0; i < num; i++) {
				if(arr[i]>flarget)
				{
					tlarget=slarget;
					slarget=flarget;
					flarget=arr[i];
					
				}
				else if (arr[i]>slarget) {
					
					tlarget=slarget;
					slarget=arr[i];
				}
				else {
					tlarget=arr[i];
				}
			}
					
				System.out.println(flarget);
				System.out.println(slarget);
				System.out.println(tlarget);

	}

}
