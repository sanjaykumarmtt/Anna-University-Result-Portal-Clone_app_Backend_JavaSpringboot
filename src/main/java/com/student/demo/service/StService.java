package com.student.demo.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.student.demo.entity.RESULT;
import com.student.demo.entity.loEntit;
import com.student.demo.repository.StRepository;
import com.student.demo.repository.logrRepositry;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StService {
	
	@Autowired
	StRepository sr;
	
	@Autowired
	logrRepositry lr;
	
	public void usepass(loEntit len) {
		lr.save(len);
	}
	public Optional<loEntit> getusepass(String usetname,String passs){
		return lr.login(usetname, passs);
	}
		
	public void Create(RESULT se) {
		sr.save(se);
	}
	
	 public List<RESULT> getAll(){
		return sr.findAll();
	}
	 
	 public Optional<RESULT> getById(int id){
		 return sr.findById(id);
	 }
	 public void deleteById(int id) {
		 sr.deleteById(id);
	 }
	 public void Update(RESULT se) {
			sr.save(se);
		}
	 
	 public Optional<RESULT>  getonedata(long regus,LocalDate date)throws EntityNotFoundException {
		 Optional ope=sr.getdataone(regus,date);
		 return ope;	 
	 }
	 public byte[] pdfdow(int id) throws DocumentException,IOException {
		 RESULT ope=sr.findById(id).orElseThrow(() -> new EntityNotFoundException("Doctor not found"));
		
		 Document document=new Document();
		 ByteArrayOutputStream out=new ByteArrayOutputStream();
		 PdfWriter.getInstance(document, out);
		 document.open();
		 
		  Font font=new Font(Font.FontFamily.TIMES_ROMAN,18,Font.BOLD);
		    Paragraph para=new Paragraph(ope.getName()+" Result Report",font);
		    para.setAlignment(Element.ALIGN_CENTER);
		    document.add(para);
		    document.add(new Paragraph(" "));
		    
		    Font fontname=new Font(Font.FontFamily.TIMES_ROMAN,10,Font.BOLD);
		    Paragraph namepara=new Paragraph("NAME : "+ope.getName(),fontname);
		    namepara.setAlignment(Element.ALIGN_LEFT);
		    document.add(namepara);
		    
		   	Paragraph Register=new Paragraph("Register Nameber : "+ope.getReg_no(),fontname);
		   	document.add(Register);
		    
		   	Paragraph Date=new Paragraph("Date of Birth : "+ope.getDob(),fontname);
		   	document.add(Date);
		   	
			Paragraph Institution=new Paragraph("Institution : 5133 - UNIVERSITY COLLEGE OF ENGINEEGING, ARNI",fontname);
		   	document.add(Institution);
		   	
			Paragraph Branch=new Paragraph("Branch : 104-B.E.Computer Science and Engineering",fontname);
		   	document.add(Branch);
		   	document.add(new Paragraph(" "));

		   	
		    PdfPTable retable=new PdfPTable(4);
		    retable.setHorizontalAlignment(Element.ALIGN_CENTER);
			retable.setWidthPercentage(100);
			
			Font tbfont=new Font(Font.FontFamily.HELVETICA,10,Font.BOLD);
			
			retable.addCell(new Paragraph("Semester",tbfont));
			retable.addCell(new Paragraph("Subject Code",tbfont));
			retable.addCell(new Paragraph("Grade",tbfont));
			retable.addCell(new Paragraph("Result",tbfont));
			
			
			 retable.addCell(new Paragraph(""+ope.getSemsu1()));
			 retable.addCell(new Paragraph(""+ope.getSub_code1()));
			 retable.addCell(new Paragraph(""+ope.getGrade1()));
			 retable.addCell(new Paragraph(""+ope.getResult1()));
			 
			 
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu2()));
			 retable.addCell(new Paragraph(""+ope.getSub_code2()));
			 retable.addCell(new Paragraph(""+ope.getGrade2()));
			 retable.addCell(new Paragraph(""+ope.getResult2()));
			 
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu3()));
			 retable.addCell(new Paragraph(""+ope.getSub_code3()));
			 retable.addCell(new Paragraph(""+ope.getGrade3()));
			 retable.addCell(new Paragraph(""+ope.getResult3()));
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu4()));
			 retable.addCell(new Paragraph(""+ope.getSub_code4()));
			 retable.addCell(new Paragraph(""+ope.getGrade4()));
			 retable.addCell(new Paragraph(""+ope.getResult4()));
			 
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu5()));
			 retable.addCell(new Paragraph(""+ope.getSub_code5()));
			 retable.addCell(new Paragraph(""+ope.getGrade5()));
			 retable.addCell(new Paragraph(""+ope.getResult5()));
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu6()));
			 retable.addCell(new Paragraph(""+ope.getSub_code6()));
			 retable.addCell(new Paragraph(""+ope.getGrade6()));
			 retable.addCell(new Paragraph(""+ope.getResult6()));
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu7()));
			 retable.addCell(new Paragraph(""+ope.getSub_code7()));
			 retable.addCell(new Paragraph(""+ope.getGrade7()));
			 retable.addCell(new Paragraph(""+ope.getResult7()));
			 
			 retable.addCell(new Paragraph(""+ope.getSemsu8()));
			 retable.addCell(new Paragraph(""+ope.getSub_code8()));
			 retable.addCell(new Paragraph(""+ope.getGrade8()));
			 retable.addCell(new Paragraph(""+ope.getResult8()));
			
			 document.add(retable);
		 
			 document.close();

		return out.toByteArray();
		 
	 }

}
