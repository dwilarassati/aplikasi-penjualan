package net.smktarunabhakti.penjualan.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.smktarunabhakti.penjualan.domain.barang;

public interface AppService {
	
	void simpanBarang(barang b);
	
	void hapusBarang(barang b);
	
	//page?
	Page<barang> cariSemuaBarang();
	
	barang cariBarangById(String id);
	
	Long countSemuaBarang();

}
