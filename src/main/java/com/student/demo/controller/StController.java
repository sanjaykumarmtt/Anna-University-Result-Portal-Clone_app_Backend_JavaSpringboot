package com.student.demo.controller;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.DocumentException;
import com.student.demo.entity.RESULT;
import com.student.demo.entity.loEntit;
import com.student.demo.exception.StudentIdNotFound;
import com.student.demo.service.StService;
	
@RestController
@CrossOrigin
//("http://localhost:3000")
@RequestMapping("/api")
public class StController {
	@Autowired
	StService sr;
	
	@GetMapping("/helo")
	public String helo() {
		return "hello frendes";
	}
	
	@PostMapping("/lpost")
	public String post(@RequestBody loEntit lo) {
		sr.usepass(lo);
		return "successful stor";
	}
	@GetMapping("/lget")
	public Optional<loEntit> getpassus(@RequestParam String usetname,@RequestParam String passs){
		System.out.println(passs+" " +usetname);
		return sr.getusepass(usetname,passs);
		
	}
	@PostMapping("/post")
	public String post(@RequestBody RESULT se) {
		sr.Create(se);
		return "Insert Successful";
		
    }
	@GetMapping("/get")
	public List<RESULT> getAll() {
		return sr.getAll();
	}
	
	@GetMapping("/getby/{id}")
	public Optional<RESULT> getById(@PathVariable int id){
		return sr.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		sr.deleteById(id);
		return "Delete Successful";	
	}
	@PutMapping("/update")
	public String update(@RequestBody RESULT se) {
		sr.Update(se);		
		System.out.println("This name " +se.getName());
		return "Update Successful";
	}
	@GetMapping("/getonedata")
	public Optional<RESULT>  getonedata(@RequestParam long regi,@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)LocalDate date) throws StudentIdNotFound{
      
		System.out.println(regi+" "+date);
		if(sr.getonedata(regi,date).isPresent()) {
			return sr.getonedata(regi,date);
		}else {
			return Optional.empty();
		}		
	}
	
	@GetMapping("/dowpdf/{id}")
	public ResponseEntity<byte[]> getdata(@PathVariable int id) throws DocumentException,IOException{
		byte[] pdfbyt=sr.pdfdow(id);
		  HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_PDF);
	        headers.setContentDispositionFormData("attachment", "data.pdf");
		
		return  ResponseEntity.ok()
                .headers(headers)
                .body(pdfbyt);
    }
}

//System.out.println("This name " +se.getName());
//System.out.println("This name " +se.getReg_no());
//System.out.println("This name " +se.getDob());
//System.out.println("This name " +se.getGrade1());
//System.out.println("This name " +se.getResult1());
//System.out.println("This name " +se.getSemsu1());
//System.out.println("This name " +se.getSub_code1());
//System.out.println("This name " +se.getSemsu7());
//System.out.println("This name " +se.getId());
