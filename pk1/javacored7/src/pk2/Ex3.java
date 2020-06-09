package pk2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public ArrayList<USB> input(int n){
		ArrayList<USB> arUSB=new ArrayList<USB>();
		Scanner sc=new Scanner(System.in);
		int id;
		float dungLuong;
		String nhaSX;
		boolean trangThai;
		for (int i = 0; i <n; i++) {
			System.out.println("Nhâp mã:");
			id=Integer.parseInt(sc.nextLine());
			System.out.println("Nhập dung lương: ");
			dungLuong=Float.parseFloat(sc.nextLine());
			System.out.println("Nhà Sản xuất: ");
			nhaSX=sc.nextLine();
			System.out.println("Trang thái hoạt động");
			trangThai=Boolean.parseBoolean(sc.nextLine());
			arUSB.add(new USB(id,dungLuong,nhaSX,trangThai));
		}
		return arUSB;
	}
	public void  disPlay(ArrayList<USB> arUSB){
		System.out.println("Thông ting Usb");
		for (USB usb : arUSB) {
			System.out.println(usb);
		}
	}
	public float tongDungLuong(ArrayList<USB> arUSB){
		float sum=0;
		for (USB usb : arUSB) {
			sum+=usb.getDungLuong();
		}
		return sum;
	}
	public  void tThaiUSB(ArrayList<USB> arUSB){
			for (USB usb : arUSB) {
				if (usb.isTrangThai()==true) {
					System.out.println(usb.toString());
				}
			}
			}
	public static void main(String[] args) {
		Ex3 usb=new Ex3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số USB: ");
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<USB> arUSB=usb.input(n);
		usb.disPlay(arUSB);
		System.out.println(usb.tongDungLuong(arUSB));
		
		
	}
}
