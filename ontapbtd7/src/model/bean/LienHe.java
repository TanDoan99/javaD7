package model.bean;

public class LienHe {
	private String name;
	private String email;
	private int phone;
	private String mess;
	public LienHe(String name, String email, int phone, String mess) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mess = mess;
	}
	public LienHe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getMess() {
		return mess;
	}
	public void setMess(String mess) {
		this.mess = mess;
	}
	
}
