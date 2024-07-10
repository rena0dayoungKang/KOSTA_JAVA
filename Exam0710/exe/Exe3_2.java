package exe;

public class Exe3_2 {

	public static void main(String[] args) {
		int numOfApples = 123; //사과의 갯수 
		int sizeOfBucket = 10; //바구니의 크기 
		int numOfBucket;
		//int numOfBucket = numOfApples / sizeOfBucket; 
		//모든 사과를 담는데 필요한 바구니의 수 
		numOfBucket = (numOfApples % sizeOfBucket == 0)? (numOfApples / sizeOfBucket) : (numOfApples / sizeOfBucket + 1);
		
		
		
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}

}
