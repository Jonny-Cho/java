/*package ch6;

// p.267 예제 6-12
// 배열 출력
// 배열 정렬
// 배열 정렬후 출력
// 배열의 총합을 출력
// 참조형 매개변수 이용하여 해결

public class RefereceParamEx3 {

	public static void main(String[] args) {
		int[] Arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = "+sumArr(arr));
	}

	static void printArr(int[] arr) {
		System.out.println("[");
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static void sumArr(int[] arr) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
	
	static void sortArr(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	} //sortArr(int[] arr)
}
*/