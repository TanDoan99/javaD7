package pk2;

public class USB {
	private int ma;
	private float dungLuong;
	private String nhaSX;
	private boolean trangThai;
	public USB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public USB(int ma, float dungLuong, String nhaSX, boolean trangThai) {
		super();
		this.ma = ma;
		this.dungLuong = dungLuong;
		this.nhaSX = nhaSX;
		this.trangThai = trangThai;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public float getDungLuong() {
		return dungLuong;
	}
	public void setDungLuong(float dungLuong) {
		this.dungLuong = dungLuong;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "Ma=" + this.ma + "\ndungLuong=" + this.dungLuong + "\nnhaSX=" + this.nhaSX + "\ntrangThai=" + this.trangThai ;
	}
	
	
}
