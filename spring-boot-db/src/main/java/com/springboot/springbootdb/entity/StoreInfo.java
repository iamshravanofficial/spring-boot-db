package com.springboot.springbootdb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer storeId;
	private String storename;
	private String storeDetail;
	private String storePhoneNumber;
	
	public StoreInfo() {
		
	}
	
	public StoreInfo(String storename, String storeDetail, String storePhoneNumber) {
		this.storename = storename;
		this.storeDetail = storeDetail;
		this.storePhoneNumber = storePhoneNumber;
	}
	
	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStoreDetail() {
		return storeDetail;
	}

	public void setStoreDetail(String storeDetail) {
		this.storeDetail = storeDetail;
	}

	public String getStorePhoneNumber() {
		return storePhoneNumber;
	}

	public void setStorePhoneNumber(String storePhoneNumber) {
		this.storePhoneNumber = storePhoneNumber;
	}

	
	@Override
	public String toString() {
		return "StoreInfo [storeId=" + storeId + ", storename=" + storename + ", storeDetail=" + storeDetail
				+ ", storePhoneNumber=" + storePhoneNumber + "]";
	}

}
