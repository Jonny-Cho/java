package star;

public class Array3 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int cnt = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				cnt++;
			}
		}
		
		// 같은 값의 갯수가 배열의 길이와 같을 때.
		if (cnt==arr1.length) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다.");
		}
	}

}
