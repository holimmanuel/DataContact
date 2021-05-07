package com.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Repositori.DataOrangRepositori;
import com.entiti.DataOrang;

@RestController
@RequestMapping("/dataorang")
public class DataOrangControler {
	@Autowired
	DataOrangRepositori DataOrangRepo;
	
	@GetMapping("/")
	public List<DataOrang> getAll(){
		return DataOrangRepo.findAll();
		
	}
	
	 @GetMapping("/{NamaOrang}")
	 public List<DataOrang> getAllNama(@PathVariable String NamaOrang){
		return DataOrangRepo.findByNama(NamaOrang);
		 
	 }
	 
	 @PostMapping("/addDataOrang")
	 public String addDataOrang(@RequestBody DataOrang dataorang)  {
		DataOrangRepo.save(dataorang);
		return "Insert Berhasil";
		  
	 }
	 
	 

}
