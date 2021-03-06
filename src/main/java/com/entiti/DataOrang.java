package com.entiti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "dataorang")
public class DataOrang {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String Nama;
	private String Email;
	private String Nomer;
	private String Alamat;
}