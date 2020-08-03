package hello;

public class Local {

	public static void main(String[] args) {
		// 배열 생성
		String[] cities = {/*1.도시를 배열로 입력하시오*/"서울","부산","인천","대천","대구"};
		int[] vistitors = {/*2.방문자 수를 배열에 저장하시오.*/599,51,46,43,27};
		
		for(int i = 0; i < cities.length; i++) {
			//3.결과를 출력 하시오.
			System.out.println(cities[i]+":"+vistitors[i]+"명");
			
		}

	}

}
