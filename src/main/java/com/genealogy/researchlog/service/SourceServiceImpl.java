package com.genealogy.researchlog.service;

import com.genealogy.researchlog.model.Product;
//import ccom.genealogy.researchlog.ProductRepository;
import com.com.genealogy.researchlog.ProductRepositoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SourceServiceImpl implements SourceService {

    private static final Logger logger = LogManager.getLogger(SourceServiceImpl.class);

    private final ProductRepository productRepository;

    public SourceServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Source> findById(Integer id) {
        logger.info("Find product with id: {}", id);
        return productRepository.findById(id);
    }

    @Override
    public List<Source> findAll() {
        logger.info("Find all products");
        return productRepository.findAll();
    }

    @Override
    public boolean update(Source product) {
        logger.info("Update product: {}", product);
        return productRepository.update(product);
    }

    @Override
    public Source save(Source product) {
        // Set the product version to 1 as we're adding a new product to the database
        product.setVersion(1);

        logger.info("Save product to the database: {}", product);
        return productRepository.save(product);
    }

    @Override
    public boolean delete(Integer id) {
        logger.info("Delete product with id: {}", id);
        return productRepository.delete(id);
    }
}
