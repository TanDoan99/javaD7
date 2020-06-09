package javacored7;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		//tạo ra 1 AL lưu giá trị của 3 SV
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(1,"Bao","DHSP");
		Student s2=new Student(2,"Bao A","DHDT");
		Student s3=new Student(3,"Bao B","DHBK");
		//1. thêm vào 3 SV
		al.add(s1);al.add(s2);al.add(s3);
		// có ? phần tử al
		//al.get(al.size()-1:in ra phần tử cuối cùng
		//al.get(0):in ra phần tử đầu tiên
		
		System.out.println("Size= "+al.size());
		//2. in dnah sách các phần tử trong al
		for (Student obj : al) {
			System.out.println(obj);
			System.out.println("========");
		}
		
		}
}
