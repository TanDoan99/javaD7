package model.bean;

import java.sql.Date;

public class Friends {
	private int fid;
	private String fname;
	private String preview;
	private String detail;
	private Date date_create;
	private int fl_id;
	private int count_number;
	private String picture;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getDate_create() {
		return date_create;
	}

	public void setDate_create(Date date_create) {
		this.date_create = date_create;
	}

	public int getFl_id() {
		return fl_id;
	}

	public void setFl_id(int fl_id) {
		this.fl_id = fl_id;
	}

	public int getCount_number() {
		return count_number;
	}

	public void setCount_number(int count_number) {
		this.count_number = count_number;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Friends(int fid, String fname, String preview, String detail, Date date_create, int fl_id, int count_number,
			String picture) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.preview = preview;
		this.detail = detail;
		this.date_create = date_create;
		this.fl_id = fl_id;
		this.count_number = count_number;
		this.picture = picture;
	}

	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

}
