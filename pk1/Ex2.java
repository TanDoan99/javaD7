package pk1;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	public ArrayList<HoaHau> nhap(int n){
		ArrayList<HoaHau> alHH=new ArrayList<HoaHau>();
		int id=0;String name="";
		Scanner sc= new Scanner(System.in);
		for (int i = 0; i <n; i++) {
			System.out.println("Nhập hao hậu thứ "+i);
			System.out.println("===========");
			System.out.println("Nhap Id: ");
			id=Integer.parseInt(sc.nextLine());
			System.out.println("Nhap Name: ");
			name=sc.nextLine();
			alHH.add(new HoaHau(id,name));
			
		}
		return alHH;
	}
	public void disPlay(ArrayList<HoaHau> alHH){
		System.out.println("Thông tin Hoa Hậu");
		for (HoaHau hoaHau : alHH) {
			System.out.println(hoaHau);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Ex2 hh=new Ex2();
		System.out.println("Nhập số Hoa Hậu: ");
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<HoaHau> alHH= hh.nhap(n);//hh.disPlay(hh.nhap(n));
		hh.disPlay(alHH);
	}
}
