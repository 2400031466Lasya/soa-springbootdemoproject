package com.klef.soa.service;

import java.util.List;

import com.klef.soa.dto.ProductDTO;

public interface APIService {

 List<ProductDTO> displayallproducts();
 ProductDTO displayProductById(int id);
}
