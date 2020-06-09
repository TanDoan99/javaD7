package bt2;

public class ThiSinh {
	private String name;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float tongDiem;
	public ThiSinh() {
		super();
	}
	public ThiSinh(String name, float diemToan, float diemLy, float diemHoa, float tongDiem) {
		super();
		this.name = name;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.tongDiem = tongDiem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getTongDiem() {
		float tongDiem= this.diemToan+this.diemLy+this.diemHoa;
		return tongDiem;
	}
	public void setTongDiem(float tongDiem) {
		this.tongDiem = tongDiem;
	}
	
}
