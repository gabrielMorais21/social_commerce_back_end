package com.morais.socialcommerce.entrypoint.controller;
import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.core.usecase.FindAllProductUseCase;
import com.morais.socialcommerce.core.usecase.FindProductByIdUseCase;
import com.morais.socialcommerce.core.usecase.InsertProductUseCase;
import com.morais.socialcommerce.entrypoint.mapper.ProductMapper;
import com.morais.socialcommerce.entrypoint.request.ProductRequest;
import com.morais.socialcommerce.entrypoint.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private InsertProductUseCase insertProductUseCase;

    @Autowired
    private FindAllProductUseCase findAllProductUseCase;

    @Autowired
    private FindProductByIdUseCase findProductByIdUseCase;

    @Autowired
    private ProductMapper productMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody ProductRequest productRequest) {
        System.out.println(productRequest);
        Product product = productMapper.toProduct(productRequest);
        insertProductUseCase.insert(product);
        return ResponseEntity.ok().build();
    }



    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable final String id) {
        var product = findProductByIdUseCase.find(id);
        var productResponse = productMapper.toProductResponse(product);
        return ResponseEntity.ok().body(productResponse);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll() {
        var listProduct = findAllProductUseCase.findAll();

        var list = listProduct.stream().map(entity -> productMapper.toProductResponse(entity)).collect(Collectors.toList());
        return ResponseEntity.ok().body(list);
    }
}
