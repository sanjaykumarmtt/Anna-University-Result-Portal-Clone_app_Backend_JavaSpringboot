package com.student.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="RESULT")
public class RESULT {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDate dob;
	private long reg_no;
	
	private int semsu1;
	private int semsu2;
	private int semsu3;
	private int semsu4;
	private int semsu5;
	private int semsu6;
	private int semsu7;
	private int semsu8;
	
	private String sub_code1;
	private String sub_code2;
	private String sub_code3;
	private String sub_code4;
	private String sub_code5;
	private String sub_code6;
	private String sub_code7;
	private String sub_code8;
	
	private String Grade1;
	private String Grade2;
	private String Grade3;
	private String Grade4;
	private String Grade5;
	private String Grade6;
	private String Grade7;
	private String Grade8;
	
	
	private String Result1;
	private String Result2;
	private String Result3;
	private String Result4;
	private String Result5;
	private String Result6;
	private String Result7;
	private String Result8;
	
	public RESULT() {
		super();
	}
	
	public RESULT(int id, String name, LocalDate dob, long reg_no, int semsu1, int semsu2, int semsu3, int semsu4,
			int semsu5, int semsu6, int semsu7, int semsu8, String sub_code1, String sub_code2, String sub_code3,
			String sub_code4, String sub_code5, String sub_code6, String sub_code7, String sub_code8, String grade1,
			String grade2, String grade3, String grade4, String grade5, String grade6, String grade7, String grade8,
			String result1, String result2, String result3, String result4, String result5, String result6,
			String result7, String result8) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.reg_no = reg_no;
		this.semsu1 = semsu1;
		this.semsu2 = semsu2;
		this.semsu3 = semsu3;
		this.semsu4 = semsu4;
		this.semsu5 = semsu5;
		this.semsu6 = semsu6;
		this.semsu7 = semsu7;
		this.semsu8 = semsu8;
		this.sub_code1 = sub_code1;
		this.sub_code2 = sub_code2;
		this.sub_code3 = sub_code3;
		this.sub_code4 = sub_code4;
		this.sub_code5 = sub_code5;
		this.sub_code6 = sub_code6;
		this.sub_code7 = sub_code7;
		this.sub_code8 = sub_code8;
		Grade1 = grade1;
		Grade2 = grade2;
		Grade3 = grade3;
		Grade4 = grade4;
		Grade5 = grade5;
		Grade6 = grade6;
		Grade7 = grade7;
		Grade8 = grade8;
		Result1 = result1;
		Result2 = result2;
		Result3 = result3;
		Result4 = result4;
		Result5 = result5;
		Result6 = result6;
		Result7 = result7;
		Result8 = result8;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getReg_no() {
		return reg_no;
	}
	public void setReg_no(long reg_no) {
		this.reg_no = reg_no;
	}
	public int getSemsu1() {
		return semsu1;
	}
	public void setSemsu1(int semsu1) {
		this.semsu1 = semsu1;
	}
	public int getSemsu2() {
		return semsu2;
	}
	public void setSemsu2(int semsu2) {
		this.semsu2 = semsu2;
	}
	public int getSemsu3() {
		return semsu3;
	}
	public void setSemsu3(int semsu3) {
		this.semsu3 = semsu3;
	}
	public int getSemsu4() {
		return semsu4;
	}
	public void setSemsu4(int semsu4) {
		this.semsu4 = semsu4;
	}
	public int getSemsu5() {
		return semsu5;
	}
	public void setSemsu5(int semsu5) {
		this.semsu5 = semsu5;
	}
	public int getSemsu6() {
		return semsu6;
	}
	public void setSemsu6(int semsu6) {
		this.semsu6 = semsu6;
	}
	public int getSemsu7() {
		return semsu7;
	}
	public void setSemsu7(int semsu7) {
		this.semsu7 = semsu7;
	}
	public int getSemsu8() {
		return semsu8;
	}
	public void setSemsu8(int semsu8) {
		this.semsu8 = semsu8;
	}
	public String getSub_code1() {
		return sub_code1;
	}
	public void setSub_code1(String sub_code1) {
		this.sub_code1 = sub_code1;
	}
	public String getSub_code2() {
		return sub_code2;
	}
	public void setSub_code2(String sub_code2) {
		this.sub_code2 = sub_code2;
	}
	public String getSub_code3() {
		return sub_code3;
	}
	public void setSub_code3(String sub_code3) {
		this.sub_code3 = sub_code3;
	}
	public String getSub_code4() {
		return sub_code4;
	}
	public void setSub_code4(String sub_code4) {
		this.sub_code4 = sub_code4;
	}
	public String getSub_code5() {
		return sub_code5;
	}
	public void setSub_code5(String sub_code5) {
		this.sub_code5 = sub_code5;
	}
	public String getSub_code6() {
		return sub_code6;
	}
	public void setSub_code6(String sub_code6) {
		this.sub_code6 = sub_code6;
	}
	public String getSub_code7() {
		return sub_code7;
	}
	public void setSub_code7(String sub_code7) {
		this.sub_code7 = sub_code7;
	}
	public String getSub_code8() {
		return sub_code8;
	}
	public void setSub_code8(String sub_code8) {
		this.sub_code8 = sub_code8;
	}
	public String getGrade1() {
		return Grade1;
	}
	public void setGrade1(String grade1) {
		Grade1 = grade1;
	}
	public String getGrade2() {
		return Grade2;
	}
	public void setGrade2(String grade2) {
		Grade2 = grade2;
	}
	public String getGrade3() {
		return Grade3;
	}
	public void setGrade3(String grade3) {
		Grade3 = grade3;
	}
	public String getGrade4() {
		return Grade4;
	}
	public void setGrade4(String grade4) {
		Grade4 = grade4;
	}
	public String getGrade5() {
		return Grade5;
	}
	public void setGrade5(String grade5) {
		Grade5 = grade5;
	}
	public String getGrade6() {
		return Grade6;
	}
	public void setGrade6(String grade6) {
		Grade6 = grade6;
	}
	public String getGrade7() {
		return Grade7;
	}
	public void setGrade7(String grade7) {
		Grade7 = grade7;
	}
	public String getGrade8() {
		return Grade8;
	}
	public void setGrade8(String grade8) {
		Grade8 = grade8;
	}
	public String getResult1() {
		return Result1;
	}
	public void setResult1(String result1) {
		Result1 = result1;
	}
	public String getResult2() {
		return Result2;
	}
	public void setResult2(String result2) {
		Result2 = result2;
	}
	public String getResult3() {
		return Result3;
	}
	public void setResult3(String result3) {
		Result3 = result3;
	}
	public String getResult4() {
		return Result4;
	}
	public void setResult4(String result4) {
		Result4 = result4;
	}
	public String getResult5() {
		return Result5;
	}
	public void setResult5(String result5) {
		Result5 = result5;
	}
	public String getResult6() {
		return Result6;
	}
	public void setResult6(String result6) {
		Result6 = result6;
	}
	public String getResult7() {
		return Result7;
	}
	public void setResult7(String result7) {
		Result7 = result7;
	}
	public String getResult8() {
		return Result8;
	}
	public void setResult8(String result8) {
		Result8 = result8;
	}
	
}
	