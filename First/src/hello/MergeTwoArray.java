package hello;

public class MergeTwoArray {

	public static void main(String[] args) {
		// 배열생성
		int[] evens = {0,2,4,6,8};
		int[] odds = {1,3,5,7,9};
		
		//배열 병합
		int[] result = merge(evens, odds);
		
		//결과 출력
		System.out.printf("결과:");
		for (int i =0; i< result.length; i++) {//값 자리마다 수를 넣어주는것.
			System.out.printf("%d", result[i]);
		}
		

	}
	//두 배열을 입력받아, 하나로 된 새 배열을 반환
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length + arr2.length];  //length는 갯수, 빈값임 아직은
		
		for(int i = 0; i < arr1.length; i++) {
			/*규칙성을 파악하여 해당 반복문을 완성하세요.*/
			mergedArr[2*i] = arr1[i];
			mergedArr[2*i+1] = arr2[i];
			
			
		}
		return mergedArr;
	}

}
