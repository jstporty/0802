
public class Output {
	static void output(Student student) {
		System.out.println("<<<부산정보산업고등학교 성적관리프로그램>>> ");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점\t");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	
		System.out.printf(" %s\t %d\t %d\t %d\t %d\t %.2f\t %c\t ", student.hakbun, student.kor, student.eng,
				student.mat, student.tot, student.avg, student.grade);

	}
}
