package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		//System.out.println(person + "명");
		
		System.out.print("사탕개수 : ");
		int candy = sc.nextInt();
		//System.out.println(candy + "개");
		
		System.out.println("1인당 사탕 개수: " + (candy / person));
		System.out.println("남는 사탕 개수: " + (candy % person));
		
	}
	
	public void practice2() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만입력) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만입력) : ");
		int scoolClass = sc.nextInt();
		System.out.print("번호(숫자만입력) : ");
		int number = sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		float scores = sc.nextFloat();
		/*System.out.println(grade + "학년 " + scoolClass + "반 " + 
						   number + "번 " + name + " " + gender + 
						   "의 " + "성적은 " + scores + "이다.");
		*/
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.\n",
				           grade, scoolClass, number, name, gender, scores);
	}
	
	public void practice3() {
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		//System.out.println("합계 : " + sum);
		//System.out.printf("평균 : %.1f", avg);
		
		
		boolean result = (kor >= 40) && (eng >= 40) && (mat >= 40) && (avg >= 60); 
		
		System.out.println(result ? "합격" : "불합격");
	    //System.out.println(sum >= 40 && avg >= 60 ? "합격" : "불합격");
	}
	
	
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		// 아니라면 불합격을 출력하세요
		
	
}
