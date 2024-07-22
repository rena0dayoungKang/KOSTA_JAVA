import java.time.Year;

public class CloneTest2 {

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
//		int[] cpy = new int[arr.length];
//		System.arraycopy(arr, 0, cpy, 0, arr.length);
		
		int[] cpy = arr.clone();
		arr[0] = 100;
		printArr(arr);
		printArr(cpy);
	}

}
