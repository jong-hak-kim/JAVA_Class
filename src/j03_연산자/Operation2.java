package j03_연산자;

public class Operation2 {

	public static void main(String[] args) {
		// 관계 연산자
		System.out.println(10 > 5);
		boolean result = 10 > 5;
		System.out.println(result);

		boolean result2 = 10 == 5;
		System.out.println(result2);

		boolean result3 = 10 < 5;
		System.out.println(result3);

		boolean result4 = 10 != 5;
		System.out.println(result4);

//		System.out.println("" + result2 + result3);
		
		/*
		 * 논리 연산 : boolean끼리 연산하는 것
		 * AND 연산(&&) - 곱
		 * true && true => true
		 * true && false => false
		 * false && false => false
		 * 
		 * OR 연산(||) - 합
		 * true || true => true
		 * true || false => true
		 * false || false => false
		 * 
		 * NOT 연산(!) - 부정
		 * !true => false
		 * !false => true
		 * 
		 * !(true && false) => true
		 * 
		 */
		
		System.out.println(2000 % 4 ==0 && 2000 % 100 != 0 && 2000 % 5 == 0);
	}

}
