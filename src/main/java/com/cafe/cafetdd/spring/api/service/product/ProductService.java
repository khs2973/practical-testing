package com.cafe.cafetdd.spring.api.service.product;

import com.cafe.cafetdd.spring.api.service.product.response.ProductResponse;
import com.cafe.cafetdd.spring.domain.product.Product;
import com.cafe.cafetdd.spring.domain.product.ProductSellingStatus;
import com.cafe.cafetdd.spring.domain.product.productRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final productRepository productRepository;

    public List<ProductResponse> getSellingProducts() {
        List<Product> products = productRepository.findAllBySellingStatusIn(ProductSellingStatus.forDisplay());

        return products.stream()
                .map(ProductResponse::of)
                .collect(Collectors.toList());
    }
}
