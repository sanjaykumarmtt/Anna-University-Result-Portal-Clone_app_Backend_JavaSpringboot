package com.student.demo.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.student.demo.entity.loEntit;

@Repository
public interface logrRepositry extends JpaRepository<loEntit,String>{

	@Query(value="SELECT *FROM usepass WHERE username= :username AND password= :passw",nativeQuery=true)
	public  Optional<loEntit> login(@Param("username") String username,@Param("passw") String passw);
	
}
