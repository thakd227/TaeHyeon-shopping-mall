package com.majustory.k1.shop;

import java.util.Date;

public class MoneyVo {
	  private int custno;
	  private String custname;
	  private String grade;
	  private int price;
	  private int salenol;   
	  private int pcost;    
	  private int amount;       
	  private Date sdate ;
	  private String pcode;    
	  private String pname; 
	  
	  private String yymm; 
	  
	  private String yymm1; 
	  private String yymm2; 
	  
	  private String aa; 
	  private String bb; 	  
	  
	  private String kc;
	  
	public String getKc() {
		return kc;
	}
	public void setKc(String kc) {
		this.kc = kc;
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
	public String getYymm1() {
		return yymm1;
	}
	public void setYymm1(String yymm1) {
		this.yymm1 = yymm1;
	}
	public String getYymm2() {
		return yymm2;
	}
	public void setYymm2(String yymm2) {
		this.yymm2 = yymm2;
	}
	public String getYymm() {
		return yymm;
	}
	public void setYymm(String yymm) {
		this.yymm = yymm;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public int getSalenol() {
		return salenol;
	}
	public void setSalenol(int salenol) {
		this.salenol = salenol;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MoneyVo [custno=" + custno + ", custname=" + custname + ", grade=" + grade + ", price=" + price
				+ ", salenol=" + salenol + ", pcost=" + pcost + ", amount=" + amount + ", sdate=" + sdate + ", pcode="
				+ pcode + ", pname=" + pname + ", yymm=" + yymm + ", yymm1=" + yymm1 + ", yymm2=" + yymm2 + ", aa=" + aa
				+ ", bb=" + bb + ", kc=" + kc + "]";
	}
	  
}
