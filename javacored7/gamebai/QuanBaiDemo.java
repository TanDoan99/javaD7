package gamebai;
import java.util.ArrayList;
import java.util.Scanner;
import gamebai.QuanBai;
public class QuanBaiDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<QuanBai> arr = new ArrayList<QuanBai>();
		int n = 0;
		boolean cont=false;
		do {
			try {
				System.out.println("Nhập số quân bài : ");
				n = Integer.parseInt(sc.nextLine());
				if (n<=0||n>52) {
					throw new Exception("lỗi! Vui lòng nhập lại số từ 1->52!");
				}
				QuanBaiDemo quanbaidemo = new QuanBaiDemo();
				QuanBai quanbai = new QuanBai();
				arr = quanbai.inputInfo(n);
				System.out.println("Thông tin các quân bài vừa nhập : ");
				quanbai.displayInfo(arr);
				cont=false;
			} catch(NumberFormatException e){
				System.out.println("Vui lòng nhập số!");
				cont=true;
			}catch (Exception e) {
				System.out.println(e.getMessage());
				cont=true;
			}
			
		} while (cont);
		
	}
}