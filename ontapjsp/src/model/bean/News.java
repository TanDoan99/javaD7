package model.bean;

public class News {
	private int id;
	private String name;
	private String moTa;
	private String chiTiet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}

	public News(int id, String name, String moTa, String chiTiet) {
		super();
		this.id = id;
		this.name = name;
		this.moTa = moTa;
		this.chiTiet = chiTiet;
	}

	public News() {
		super();
	}

}
