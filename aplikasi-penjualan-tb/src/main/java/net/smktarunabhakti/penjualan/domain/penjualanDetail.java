package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="jual_detail")
public class penjualanDetail implements Serializable{
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;
	
	@ManyToOne
	private penjualan header;
	
	@ManyToOne
	private barang barang;
	
	@Column(name="jumlah_barang")
	private int jumlah;
	
	@Column(name="total_harga")
	private BigDecimal totalHarga;
	
	@OneToMany(mappedBy="header")
	@Cascade(value = CascadeType.ALL)
	private List<penjualanDetail>listpenjualanDetail;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public penjualan getHeader() {
		return header;
	}

	public void setHeader(penjualan header) {
		this.header = header;
	}

	public barang getBarang() {
		return barang;
	}

	public void setBarang(barang barang) {
		this.barang = barang;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public BigDecimal getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(BigDecimal totalHarga) {
		this.totalHarga = totalHarga;
	}

	public List<penjualanDetail> getListpenjualanDetail() {
		return listpenjualanDetail;
	}

	public void setListpenjualanDetail(List<penjualanDetail> listpenjualanDetail) {
		this.listpenjualanDetail = listpenjualanDetail;
	}

	

}
