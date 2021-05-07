package com.Repositori;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entiti.DataOrang;

public interface DataOrangRepositori extends JpaRepository<DataOrang, String>{

	List<DataOrang> findByNama(String namaOrang);
	

}
