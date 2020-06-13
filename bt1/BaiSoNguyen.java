package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiSoNguyen {
	public static ArrayList<Integer> input(int n) throws NumberException {
		ArrayList<Integer> arList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		if (n < 0) {
			throw new NumberException("vui lòng nhập số phần tử lớn hơn 0");
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập số thứ " + (i + 1) + ":");
			int number = Integer.parseInt(sc.nextLine());
			arList.add(number);
			return arList;
		}

		return arList;
	}

	public static void disPlay(ArrayList<Integer> arList) {
		System.out.println("====mảng vừa nhập là====");
		for (Integer integer : arList) {
			System.out.println(integer);
		}
	}

	public static int tinhTong(ArrayList<Integer> arList) {
		int sum = 0;
		for (Integer integer : arList) {
			sum += integer;
		}
		return sum;
	}

	public static int tinhTongDauCuoi(ArrayList<Integer> arList) {
		int sum = 0;
		sum = arList.get(0) + arList.get(arList.size() - 1);
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		boolean cont = true;
		do {

			try {
				System.out.println("Nhập số phần tử trong mảng: ");
				int n = Integer.parseInt(sc.nextLine());

				arList = input(n);
				cont = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("vui lòng nhập định dạng số!");
			}

		} while (cont);

		disPlay(arList);
		System.out.println("Tổng mảng là:" + tinhTong(arList));
		System.out.println("Tổng số phần tử đầu và cuối là: " + tinhTongDauCuoi(arList));
	}
}
