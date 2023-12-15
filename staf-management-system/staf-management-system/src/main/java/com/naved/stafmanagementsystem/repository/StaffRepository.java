package com.naved.stafmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.naved.stafmanagementsystem.entity.Staff;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{
	 @Query(value = "SELECT * FROM empl WHERE joining_year = :year AND staff_salary > :salary", nativeQuery = true)
	    List<Staff> findByJoinDateYearAndSalaryGreaterThan(@Param("year") int year, @Param("salary") double salary);
	

	

}
