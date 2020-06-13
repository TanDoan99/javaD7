package bt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Scanner;

public class kqThi {
	public static ArrayList<ThiSinh> input(ArrayList<ThiSinh> arThiSinh){
		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		System.out.println("====Nhập danh sách thi kết quả thí sinh====");
//		while (cont=true) {
//			System.out.println("Nhập vào tên thí sinh: ");
//			String name = sc.nextLine();
//			ThiSinh thisinh = new ThiSinh();
//			do {
//				try {
//
//					System.out.println("Nhập vào điểm Toán: ");
//					float diemToan = Float.parseFloat(sc.nextLine());
//					thisinh.setDiemToan(diemToan);
//					if (diemToan < 0 || diemToan > 10) {
//						throw new Exception("Vui lòng nhập điểm toán từ 0->10!");
//					}
//					cont = false;
//				} catch (NumberFormatException e) {
//					System.out.println("lỗi! vui lòng nhập số!");
//					cont = true;
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//					cont = true;
//				}
//			} while (cont);
//			do {
//				try {
//
//					System.out.println("Nhập vào điểm Lý: ");
//					float diemLy = Float.parseFloat(sc.nextLine());
//					thisinh.setDiemLy(diemLy);
//					if (diemLy < 0 || diemLy > 10) {
//						throw new Exception("Vui lòng nhập điểm lý từ 0->10!");
//					}
//					cont = false;
//				} catch (NumberFormatException e) {
//					System.out.println("lỗi! vui lòng nhập số!");
//					cont = true;
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//					cont = true;
//				}
//			} while (cont);
//			do {
//				try {
//
//					System.out.println("Nhập vào điểm Hóa: ");
//					float diemHoa = Float.parseFloat(sc.nextLine());
//					thisinh.setDiemHoa(diemHoa);
//					if (diemHoa < 0 || diemHoa > 10) {
//						throw new Exception("Vui lòng nhập điểm Hóa từ 0->10!");
//					}
//					cont = false;
//				} catch (NumberFormatException e) {
//					System.out.println("lỗi! vui lòng nhập số!");
//					cont = true;
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//					cont = true;
//				}
//			} while (cont);
//			thisinh.setName(name);
//			arThiSinh.add(thisinh);
//			disPlay(arThiSinh);
//			
//		}
		do {
			System.out.println("Nhập vào tên thí sinh: ");
			String name = sc.nextLine();
			ThiSinh thisinh = new ThiSinh();
			do {
				try {

					System.out.println("Nhập vào điểm Toán: ");
					float diemToan = Float.parseFloat(sc.nextLine());
					thisinh.setDiemToan(diemToan);
					if (diemToan < 0 || diemToan > 10) {
						throw new Exception("Vui lòng nhập điểm toán từ 0->10!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("lỗi! vui lòng nhập số!");
					cont = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					cont = true;
				}
			} while (cont);
			do {
				try {

					System.out.println("Nhập vào điểm Lý: ");
					float diemLy = Float.parseFloat(sc.nextLine());
					thisinh.setDiemLy(diemLy);
					if (diemLy < 0 || diemLy > 10) {
						throw new Exception("Vui lòng nhập điểm lý từ 0->10!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("lỗi! vui lòng nhập số!");
					cont = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					cont = true;
				}
			} while (cont);
			do {
				try {

					System.out.println("Nhập vào điểm Hóa: ");
					float diemHoa = Float.parseFloat(sc.nextLine());
					thisinh.setDiemHoa(diemHoa);
					if (diemHoa < 0 || diemHoa > 10) {
						throw new Exception("Vui lòng nhập điểm Hóa từ 0->10!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("lỗi! vui lòng nhập số!");
					cont = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					cont = true;
				}
			} while (cont);
			thisinh.setName(name);
			arThiSinh.add(thisinh);
			disPlay(arThiSinh);
		} while (cont=true);
		return arThiSinh;
	}
	public static void disPlay(ArrayList<ThiSinh> arThiSinh) {
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
			if (thiSinh.getTongDiem() > 17) {
				System.out.println(thiSinh.getName() + " , " + thiSinh.getDiemToan() + " , " + thiSinh.getDiemLy()
						+ " , " + thiSinh.getDiemHoa() + " , " + thiSinh.getTongDiem());
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<ThiSinh> arThiSinh=new ArrayList<ThiSinh>();
		input(arThiSinh);

	}

}
