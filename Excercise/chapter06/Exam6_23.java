package chapter06;

public class Exam6_23 {
	
	static int max(int[] arr) {
		if (arr == null || arr.length == 0) { 
			//순서 바뀌면 안된다!! 레퍼런스가 null인 애들의 length같은것을 판단하면 오류가남
			//앞에꺼가 false라면 뒤에거를 판단하지 않는다. 
			return -999999;
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]> max) {
				max = arr[i];
			} 
		}		
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}

}

//[3, 2, 9, 4, 7]
//최대값:9
//최대값:-999999
//최대값:-999999