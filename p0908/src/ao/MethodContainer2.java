package ao;
import java.util.ArrayList;

import vo.Student;

public class MethodContainer2 {
	
	// 1. void ����Ÿ���� ���� ��(�޼��� ������ �����͸� ������ ������ �� ����)
	
	// 1. �⺻Ÿ���� ����(������ ������ ��)�ϴ� �޼���
	// ���ϰ� : true / false
	// �Է°�(�Ű�����)
	// 1. String : ����� ID
	// 2. String : ����� PW
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
	
	// 3. ����Ÿ���� �����ϴ�  �޼���
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.name = "������";
		s1.gender = "��";
		s1.age = 23;
		list.add(s1);
		
		Student s2 = new Student();
		s2.name = "���ϱ�";
		s2.gender = "��";
		s2.age = 23;
		list.add(s2);
		
		Student s3 = new Student();
		s3.name = "�����";
		s3.gender = "��";
		s3.age = 25;
		list.add(s3);
		
		Student s4 = new Student();
		s4.name = "�輺��";
		s4.gender = "��";
		s4.age = 24;
		list.add(s4);
		
		Student s5 = new Student();
		s5.name = "���ּ�";
		s5.gender = "��";
		s5.age = 23;
		list.add(s5);
		
		Student s6 = new Student();
		s6.name = "��ö��";
		s6.gender = "��";
		s6.age = 26;
		list.add(s6);
		
		Student s7 = new Student();
		s7.name = "������";
		s7.gender = "��";
		s7.age = 23;
		list.add(s7);
		
		Student s8 = new Student();
		s8.name = "������";
		s8.gender = "��";
		s8.age = 24;
		list.add(s8);
		
		Student s9 = new Student();
		s9.name = "�ڹ���";
		s9.gender = "��";
		s9.age = 23;
		list.add(s9);
		
		Student s10 = new Student();
		s10.name = "�ڿ�ȣ";
		s10.gender = "��";
		s10.age = 24;
		list.add(s10);
		
		Student s11 = new Student();
		s11.name = "��â��";
		s11.gender = "��";
		s11.age = 26;
		list.add(s11);
		
		Student s12 = new Student();
		s12.name = "����ȣ";
		s12.gender = "��";
		s12.age = 24;
		list.add(s12);
		
		Student s13 = new Student();
		s13.name = "������";
		s13.gender = "��";
		s13.age = 23;
		list.add(s13);
		
		Student s14 = new Student();
		s14.name = "�����";
		s14.gender = "��";
		s14.age = 28;
		list.add(s14);
		
		Student s15 = new Student();
		s15.name = "�ŵ���";
		s15.gender = "��";
		s15.age = 24;
		list.add(s15);
		
		Student s16 = new Student();
		s16.name = "�Ź���";
		s16.gender = "��";
		s16.age = 24;
		list.add(s16);
		
		Student s17 = new Student();
		s17.name = "�̺���";
		s17.gender = "��";
		s17.age = 24;
		list.add(s17);
		
		Student s18 = new Student();
		s18.name = "�����";
		s18.gender = "��";
		s18.age = 23;
		list.add(s18);
		
		Student s19 = new Student();
		s19.name = "������";
		s19.gender = "��";
		s19.age = 25;
		list.add(s19);
		
		Student s20 = new Student();
		s20.name = "������";
		s20.gender = "��";
		s20.age = 25;
		list.add(s20);
		
		Student s21 = new Student();
		s21.name = "������";
		s21.gender = "��";
		s21.age = 23;
		list.add(s21);
		
		Student s22 = new Student();
		s22.name = "����ö";
		s22.gender = "��";
		s22.age = 23;
		list.add(s22);
		
		Student s23 = new Student();
		s23.name = "������";
		s23.gender = "��";
		s23.age = 26;
		list.add(s23);
		
		Student s24 = new Student();
		s24.name = "�����";
		s24.gender = "��";
		s24.age = 25;
		list.add(s24);
		
		return list;
	}
}
