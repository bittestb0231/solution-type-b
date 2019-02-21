package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int maxValue = arr[0]*arr[0];
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				int x = arr[i] * arr[j];
				int a = arr[i], b=arr[j];
				if(x > maxValue) {
					maxValue= x;
					System.out.println("["+a+", "+b+"]");
				}
			}
		}
		
	}
}
