package pk1;


import java.util.Scanner;

public class HoaHau {
	private int id;
	private String name;
	public HoaHau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaHau(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "id=" + this.id + "\nname=" + this.name;
	}
	

}
