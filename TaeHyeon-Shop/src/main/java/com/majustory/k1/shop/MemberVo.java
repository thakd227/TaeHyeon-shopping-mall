package com.majustory.k1.shop;

import org.springframework.web.multipart.MultipartFile;

public class MemberVo {
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private String joindate;
	private String grade;
	private String city;
	private String password;
	private MultipartFile uploadfile;
	private String pfile;
	private long filesize;

	private String ch1;
	private String ch2;

	private String aa;
	private String bb;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	public String getPfile() {
		return pfile;
	}

	public void setPfile(String pfile) {
		this.pfile = pfile;
	}

	public String getCh1() {
		return ch1;
	}

	public void setCh1(String ch1) {
		this.ch1 = ch1;
	}

	public String getCh2() {
		return ch2;
	}

	public void setCh2(String ch2) {
		this.ch2 = ch2;
	}

	public MultipartFile getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "MemberVo [custno=" + custno + ", custname=" + custname + ", phone=" + phone + ", address=" + address
				+ ", joindate=" + joindate + ", grade=" + grade + ", city=" + city + ", password=" + password
				+ ", uploadfile=" + uploadfile + ", pfile=" + pfile + ", filesize=" + filesize + ", ch1=" + ch1
				+ ", ch2=" + ch2 + ", aa=" + aa + ", bb=" + bb + "]";
	}

}
