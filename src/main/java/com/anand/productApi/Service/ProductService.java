package com.anand.productApi.Service;

import com.anand.productApi.Entity.Product;
import com.anand.productApi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Long id, Product updatedProduct) {

        Product existingProduct = productRepository.findById(id).get();
        if (Objects.nonNull(updatedProduct.getName()) && !updatedProduct.getName().isEmpty()) {
            existingProduct.setName(updatedProduct.getName());
        }

        if (Objects.nonNull(updatedProduct.getPrice())) {
            existingProduct.setPrice(updatedProduct.getPrice());
        }
        return productRepository.save(existingProduct);
    }
}
