package com.aom.interfaces;

import com.aom.beans.Product;

public interface ITransportManager {
	String transport(Product product, int zipCode);
}
