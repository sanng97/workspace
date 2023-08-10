package javaproject;

public class _03_Variables {

	public static void main(String[] args) {

		String name = "상언";

		int hour = 15;

		System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");

		double score = 90.5;

		char grade = 'A';

		name = "강백호";

		System.out.println(name + "님의 평균점수는" + score + grade + "입니다.");

		// ------------------------------------------------------------------------------
		boolean pass = true;

		System.out.println("이번시험에 합격했을까요 ?" + pass);

		// ------------------------------------------------------------------------------

		double d = 3.14123456789;
		float f = 3.14132456789F;

		// float을 쓸때는 뒤에 f 또는 F를 붙인다.

		System.out.println(d);
		System.out.println(f);

		long l = 1000000000000l;

		l = 1_000_000_000_000l;

		// long은 int 보다 큰 범위를 가능하게 하여 뒤에 소문자 l을 넣는다.

		System.out.println(l);

	}

}

// int , long , float, double, char, String, boolean

// 깊은 소수점이 필요없으면 float를 쓴다.


