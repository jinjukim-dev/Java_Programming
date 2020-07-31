package ch6;

public class Exercise6_4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+s.getAverage());
		System.out.println();
		
		Student s1 = new Student("홍길동", 1, 2, 100, 34, 57);
		System.out.println(s1.info());
		
	}

}

//6-3
class Student{
	 String name;
	 int ban;
	 int no;
	 int kor;
	 int eng;
	 int math;
	 
	 Student() {
		 
	 }
	 
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
			
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		int total = getTotal();
		float average = Math.round((total / 3f) * 10)/10f;
		return average;
	}
	
	//6_5
	
	String info(){
		return name+","+ ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
		
}
