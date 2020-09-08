package ao;
import java.util.ArrayList;

import vo.Student;

public class MethodContainer2 {
	
	// 1. void 리턴타입이 없는 것(메서드 실행결과 데이터를 변수에 저장할 수 없다)
	
	// 1. 기본타입을 리턴(변수에 저장할 값)하는 메서드
	// 리턴값 : true / false
	// 입력값(매개변수)
	// 1. String : 사용자 ID
	// 2. String : 사용자 PW
	public boolean login(String id, String pw) {
		String idFormDb = "admin";
		String pwFormDb = "1234";
		boolean returnValue = false;
		
		if(id.equals(idFormDb) && pw.equals(pwFormDb)) {
			returnValue = true;
		}
		
		return returnValue;
	}
	
	public char getGender() {
		return 'M';
	}
	
	// 3. 참조타입을 리턴하는  메서드
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.name = "한혜진";
		s1.gender = "여";
		s1.age = 23;
		list.add(s1);
		
		Student s2 = new Student();
		s2.name = "강하기";
		s2.gender = "남";
		s2.age = 23;
		list.add(s2);
		
		Student s3 = new Student();
		s3.name = "김덕인";
		s3.gender = "남";
		s3.age = 25;
		list.add(s3);
		
		Student s4 = new Student();
		s4.name = "김성훈";
		s4.gender = "남";
		s4.age = 24;
		list.add(s4);
		
		Student s5 = new Student();
		s5.name = "김주성";
		s5.gender = "남";
		s5.age = 23;
		list.add(s5);
		
		Student s6 = new Student();
		s6.name = "김철규";
		s6.gender = "남";
		s6.age = 26;
		list.add(s6);
		
		Student s7 = new Student();
		s7.name = "김현욱";
		s7.gender = "남";
		s7.age = 23;
		list.add(s7);
		
		Student s8 = new Student();
		s8.name = "문지웅";
		s8.gender = "남";
		s8.age = 24;
		list.add(s8);
		
		Student s9 = new Student();
		s9.name = "박무림";
		s9.gender = "남";
		s9.age = 23;
		list.add(s9);
		
		Student s10 = new Student();
		s10.name = "박용호";
		s10.gender = "남";
		s10.age = 24;
		list.add(s10);
		
		Student s11 = new Student();
		s11.name = "박창현";
		s11.gender = "남";
		s11.age = 26;
		list.add(s11);
		
		Student s12 = new Student();
		s12.name = "박준호";
		s12.gender = "남";
		s12.age = 24;
		list.add(s12);
		
		Student s13 = new Student();
		s13.name = "배형준";
		s13.gender = "남";
		s13.age = 23;
		list.add(s13);
		
		Student s14 = new Student();
		s14.name = "백상훈";
		s14.gender = "남";
		s14.age = 28;
		list.add(s14);
		
		Student s15 = new Student();
		s15.name = "신동한";
		s15.gender = "남";
		s15.age = 24;
		list.add(s15);
		
		Student s16 = new Student();
		s16.name = "신민준";
		s16.gender = "남";
		s16.age = 24;
		list.add(s16);
		
		Student s17 = new Student();
		s17.name = "이병윤";
		s17.gender = "남";
		s17.age = 24;
		list.add(s17);
		
		Student s18 = new Student();
		s18.name = "장규진";
		s18.gender = "남";
		s18.age = 23;
		list.add(s18);
		
		Student s19 = new Student();
		s19.name = "장지운";
		s19.gender = "남";
		s19.age = 25;
		list.add(s19);
		
		Student s20 = new Student();
		s20.name = "조광현";
		s20.gender = "남";
		s20.age = 25;
		list.add(s20);
		
		Student s21 = new Student();
		s21.name = "조성현";
		s21.gender = "남";
		s21.age = 23;
		list.add(s21);
		
		Student s22 = new Student();
		s22.name = "최형철";
		s22.gender = "남";
		s22.age = 23;
		list.add(s22);
		
		Student s23 = new Student();
		s23.name = "최현준";
		s23.gender = "남";
		s23.age = 26;
		list.add(s23);
		
		Student s24 = new Student();
		s24.name = "한재용";
		s24.gender = "남";
		s24.age = 25;
		list.add(s24);
		
		return list;
	}
}
