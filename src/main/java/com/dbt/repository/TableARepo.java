package com.dbt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbt.model.TableA;

@Repository
public interface TableARepo extends JpaRepository<TableA, Long>{
	
}
