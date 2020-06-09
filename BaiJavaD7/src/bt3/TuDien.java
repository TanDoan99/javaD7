package bt3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.AbstractMap.SimpleImmutableEntry;

public class TuDien {
	public static ArrayList<English> input(ArrayList<English> list){
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời nhập vào từ  tiếng anh: ");
		String tu=sc.nextLine();
		System.out.println("Nhập vào nghĩa của từ: ");
		String nghiaTiengViet=sc.nextLine();
		System.out.println("Nhập vào phiên âm: ");
		String phienAm=sc.nextLine();
		English english=new English(tu,nghiaTiengViet,phienAm);
		list.add(english);
		
		return list;
	}
	public static void display(ArrayList<English> list){
		System.out.println("Thông tin các từ tiếng anh đã nhập");
		for (English english : list) {
			System.out.println(english.getTu()+", có nghĩa: "+english.getNghiaTiengViet()+", được dịch: "+english.getPhienAm());
		}
	}
	public static void search(ArrayList<English> list){
		Scanner sc=new Scanner(System.in);
		String rt="";
		System.out.println("Nhập vào từ tiếng anh cần tìm");
		String tuNhap=sc.nextLine();
		for (English english : list) {
			String getTu=english.getTu();
			if (getTu.equals(tuNhap)) {
				rt="Nghĩa của từ "+ tuNhap+ "là "+ english.getNghiaTiengViet() + " phiêm âm "+ tuNhap+ " là: "+ english.getPhienAm();
			}
		}
		if (rt==" ") {
			System.out.println("Không tìm thấy từ cần tra");
		} else {
			System.out.println(rt);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("== TỪ ĐIỂN ANH VIỆT – VINAENTER EDU ==");
		System.out.println("--1. Nhập dữ liệu--");
		System.out.println("--2. Xuất dữ liệu--");
		System.out.println("--3. Dịch từ--");
		System.out.println("--4. Thoát--");
		System.out.println("bạn vui lòng chọn từ 1->4");
		ArrayList<English> list=new ArrayList<English>();
		Scanner sc=new Scanner(System.in);
		boolean cont=true;
		do {
			int bien=Integer.parseInt(sc.nextLine());
			switch (bien) {
			case 1:
				input(list);
				break;
			case 2:
				display(list);
				break;
			case 3:
				search(list);
				break;
			case 4:
				System.out.println("Cảm ơn đã sử dụng từ điển!");
				System.exit(0); 
				break;
			default:
				System.out.println("bạn vui lòng chọn các phím từ 1->4 để tiếp tục");
				break;
			}
		} while (cont);
		
		
		
	}
}
