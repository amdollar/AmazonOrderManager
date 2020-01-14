package com.aom.beans;

import com.aom.interfaces.ITransportManager;

public class OrderManager {
	ITransportManager bluedartTransportManager;
	ITransportManager dtdcTransportManger;
	public void scheduleDelivery(Product product, Address address) {
		int zipCode = address.getZipCode();
		if (zipCode> 500000) {
			System.out.println(bluedartTransportManager.transport(product, zipCode));// logic
		}else {
			System.out.println(dtdcTransportManger.transport(product, zipCode));
		}
	}
	public void setBluedartTransportManager(ITransportManager bluedartTransportManager) {
		this.bluedartTransportManager = bluedartTransportManager;
	}
	public void setDtdcTransportManger(ITransportManager dtdcTransportManger) {
		this.dtdcTransportManger = dtdcTransportManger;
	}
}
