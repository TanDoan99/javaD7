package gamebai;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanBai {
	private String name;
	private int point,exp;
	public QuanBai(String name, int point, int exp) {
		super();
		this.name = name;
		this.point = point;
		this.exp = exp;
	}
	public QuanBai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public ArrayList<QuanBai> inputInfo(int n){
		Scanner sc = new Scanner(System.in);
		ArrayList<QuanBai> arr = new ArrayList<QuanBai>();
			for(int i=0;i<n;i++){
				System.out.println("Nhập tên quân bài : ");
				name = sc.nextLine();
				boolean cont=false;
				do {
					try {
						System.out.println("Nhập điểm quân bài : ");
						point = Integer.parseInt(sc.nextLine());
						if (point<1||point>4) {
							throw new Exception("Nhập điểm quân bài từ 1->4!");
						}
						cont=false;
					} catch (NumberFormatException e) {
						System.out.println("vui lòng nhập số!");
						cont=true;
						
					}catch (Exception e) {
						System.out.println(e.getMessage());
						cont=true;
						
					}
				} while (cont);
				
				do {
					try {
						System.out.println("Nhập hệ số quân bài : ");
						exp = Integer.parseInt(sc.nextLine());
						if (exp<1||exp>13) {
							throw new Exception("Nhập từ 1->13");
						}
						cont=false;
					} catch (NumberFormatException e) {
						System.out.println("Nhập số");
						cont=true;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
						cont=true;
					}
				} while (cont);
				
				arr.add(new QuanBai(name,point,exp));
		}
		return arr;
	}
	public String toString(){
		return "Tên quân bài : "+this.name+" Điểm quân bài : "+this.point+" Hệ số quân bài : "+this.exp;
	}
	public void displayInfo(ArrayList<QuanBai> arr){
		if (arr.size()>0) {
			for(QuanBai quanbai : arr){
				System.out.println(quanbai);
				System.out.println();
			}
		}else{
			System.out.println("Lỗi nhập!");
		}
		
	}
}