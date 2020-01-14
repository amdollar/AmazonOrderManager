package com.aom.beans;

import com.aom.interfaces.ITransportManager;

public class DTDCTransportManagerImpl implements ITransportManager {

	@Override
	public String transport(Product product, int zipCode) {
		return product.toString() + ", will be delivered at" + zipCode + " by " + this.getClass().getName();
	}
}
