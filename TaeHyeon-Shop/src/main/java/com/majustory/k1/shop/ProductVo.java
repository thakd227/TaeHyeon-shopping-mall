package com.majustory.k1.shop;


import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class ProductVo {
  private	String  pcode ;
  private	String   pname ;
  private	int pcost ;
  private	Date pdate  ;
  private	String pdateS  ;
  private	String    petc  ;
  private	String pfile  ; 
  private	MultipartFile  pfilename ;
  
  private int custno;
  private String custname;
  private String grade;
  private int price;
  private int salenol;   

  private int amount;       
  private Date sdate ;
  
  private int quantity;
  
  private   int page_size  ;       //  1:페이지사이즈
  private   int page_list_size  ;  // 2: 페이지List Size
  private   int tc ;                  // 3: 총레코드 수  
  private   int pagetotal ;

  private   int now_record  ;   // 5.현재레코드
  private   int now_page ;      // 6.현재페이지
  private   int start_page ;     //  7. 하단 가로 시작페이지
  private   int end_page ;     // 8. 하단 가로 마지막 페이지
  
  private        int  rownum;
  private        int  rnum;
   
  private   int startno;
  private   int endno;
  
  private   String t1;
  private   String t2;
  
  
  
  public String getPfile() {
	return pfile;
}
public void setPfile(String pfile) {
	this.pfile = pfile;
}
public MultipartFile getPfilename() {
	return pfilename;
}
public void setPfilename(MultipartFile pfilename) {
	this.pfilename = pfilename;
}
public int getStartno() {
	return startno;
}
public void setStartno(int startno) {
	this.startno = startno;
}
public int getEndno() {
	return endno;
}
public void setEndno(int endno) {
	this.endno = endno;
}
  
public String getT1() {
	return t1;
}
public void setT1(String t1) {
	this.t1 = t1;
}
public String getT2() {
	return t2;
}
public void setT2(String t2) {
	this.t2 = t2;
}
public int getPage_size() {
	return page_size;
}
public void setPage_size(int page_size) {
	this.page_size = page_size;
}
public int getPage_list_size() {
	return page_list_size;
}
public void setPage_list_size(int page_list_size) {
	this.page_list_size = page_list_size;
}
public int getTc() {
	return tc;
}
public void setTc(int tc) {
	this.tc = tc;
}
public int getPagetotal() {
	return pagetotal;
}
public void setPagetotal(int pagetotal) {
	this.pagetotal = pagetotal;
}
public int getNow_record() {
	return now_record;
}
public void setNow_record(int now_record) {
	this.now_record = now_record;
}
public int getNow_page() {
	return now_page;
}
public void setNow_page(int now_page) {
	this.now_page = now_page;
}
public int getStart_page() {
	return start_page;
}
public void setStart_page(int start_page) {
	this.start_page = start_page;
}
public int getEnd_page() {
	return end_page;
}
public void setEnd_page(int end_page) {
	this.end_page = end_page;
}
public int getRownum() {
	return rownum;
}
public void setRownum(int rownum) {
	this.rownum = rownum;
}
public int getRnum() {
	return rnum;
}
public void setRnum(int rnum) {
	this.rnum = rnum;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
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
public int getSalenol() {
	return salenol;
}
public void setSalenol(int salenol) {
	this.salenol = salenol;
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
public String getPdateS() {
	return pdateS;
}
public void setPdateS(String pdateS) {
	this.pdateS = pdateS;
}
public String getPcode() {
	return pcode;
}
public void setPcode(String pcode) {
	this.pcode = pcode;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPcost() {
	return pcost;
}
public void setPcost(int pcost) {
	this.pcost = pcost;
}
public Date getPdate() {
	return pdate;
}
public void setPdate(Date pdate) {
	this.pdate = pdate;
}
public String getPetc() {
	return petc;
}
public void setPetc(String petc) {
	this.petc = petc;
}

@Override
public String toString() {
	return "ProductVo [pcode=" + pcode + ", pname=" + pname + ", pcost=" + pcost + ", pdate=" + pdate + ", pdateS="
			+ pdateS + ", petc=" + petc + ", pfile=" + pfile + ", pfilename=" + pfilename + ", custno=" + custno
			+ ", custname=" + custname + ", grade=" + grade + ", price=" + price + ", salenol=" + salenol + ", amount="
			+ amount + ", sdate=" + sdate + ", quantity=" + quantity + ", page_size=" + page_size + ", page_list_size="
			+ page_list_size + ", tc=" + tc + ", pagetotal=" + pagetotal + ", now_record=" + now_record + ", now_page="
			+ now_page + ", start_page=" + start_page + ", end_page=" + end_page + ", rownum=" + rownum + ", rnum="
			+ rnum + ", startno=" + startno + ", endno=" + endno + ", t1=" + t1 + ", t2=" + t2 + "]";
}
 
  
}