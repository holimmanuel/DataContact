package com.juaracoding.perpustakaan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.perpustakaan.entity.DataOrang;
import com.juaracoding.perpustakaan.repository.DataOrangRepository;

@RestController
@RequestMapping("/buku")
public class DataOrangController {
	@Autowired
	DataOrangRepository dataorangRepo;

	@GetMapping("/")
	public List<DataOrang> getAll() {
		return dataorangRepo.findAll();
	}

	@GetMapping("/{Nama}")
	public List<DataOrang> getAllByNama(@PathVariable String nama) {
		return dataorangRepo.findByNama(nama);
	}

	@PostMapping("/addBuku")
	public String addBuku(@RequestBody DataOrang dataOrang) {
		dataorangRepo.save(dataOrang);
		return "Insert Berhasil";
	}
	
	@DeleteMapping("/deleteBuku/{id}")
	public String deleteBuku(@PathVariable String id) {
		dataorangRepo.deleteById(Long.parseLong(id));
		return "Delete Berhasil";
	}
	

}
