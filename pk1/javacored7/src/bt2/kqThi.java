package bt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class kqThi {
	public static void  disPlay(ArrayList<ThiSinh> arThiSinh){
		// sort list
        Collections.sort(arThiSinh, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh ts1, ThiSinh ts2) {
            	if (ts1.getTongDiem() < ts2.getTongDiem()) {
                    return 1;
                } else {
                    if (ts1.getTongDiem() == ts2.getTongDiem()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
		System.out.println("Danh sách thí sinh trúng tuyển (Tổng điểm 3 môn >17)");
		for (ThiSinh thiSinh : arThiSinh) {
			if (thiSinh.getTongDiem()>17) {
				System.out.println(thiSinh.getName()+" , "+thiSinh.getDiemToan()+" , "+thiSinh.getDiemLy()+" , "+thiSinh.getDiemHoa()+" , "+thiSinh.getTongDiem());
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<ThiSinh> arThiSinh=new ArrayList<ThiSinh>();
		boolean cont=true;
		do {
			System.out.println("====Nhập danh sách thi kết quả thí sinh====");
			System.out.println("Nhập vào tên thí sinh: ");
			String name=sc.nextLine();
			System.out.println("Nhập vào điểm Toán: ");
			float diemToan=Float.parseFloat(sc.nextLine());
			System.out.println("Nhập vào điểm Lý: ");
			float diemLy=Float.parseFloat(sc.nextLine());
			System.out.println("Nhập vào điểm Hóa: ");
			float diemHoa=Float.parseFloat(sc.nextLine());
			ThiSinh thisinh=new ThiSinh();
			thisinh.setName(name);
			thisinh.setDiemToan(diemToan);
			thisinh.setDiemLy(diemLy);
			thisinh.setDiemHoa(diemHoa);
			arThiSinh.add(thisinh);
			disPlay(arThiSinh);
		} while (cont);

		
	}

}
