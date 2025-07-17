package test4.sub1;

/* 날짜 : 2025/07/17
 * 이름 : 김대현
 * 내용 : Java 테스트 실습하기
 */

public class StudentScore {
	
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생이름 : " +studentName);
		System.out.println("학생 ID : " +studentId);
		System.out.println("과목 : " +subject);
		System.out.println("점수 : " +score);
	}
	
	public void updateScore(double score) {
		
		if(score<=100) {
		this.score = score;
		System.out.println("정보 수정 완료");}
		else {
			System.out.println("잘못된 점수 입력");
		}
	}

	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	
}

