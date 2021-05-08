package com.juaracoding.perpustakaan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.perpustakaan.entity.DataOrang;


public interface DataOrangRepository extends JpaRepository<DataOrang, Long>{
	@Query(value = "select * from buku where judul_buku LIKE %?1%",nativeQuery=true)
	List<DataOrang> findByNama(String Nama);

}
