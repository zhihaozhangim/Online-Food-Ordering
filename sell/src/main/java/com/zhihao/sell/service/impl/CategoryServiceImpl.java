package com.zhihao.sell.service.impl;

import com.zhihao.sell.dataobject.ProductCategory;
import com.zhihao.sell.repository.ProductCategoryRepository;
import com.zhihao.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation for the service layer CategoryService.
 */
@Service
@CacheConfig(cacheNames = "category")
public class CategoryServiceImpl implements CategoryService {

  // DAO
  @Autowired
  private ProductCategoryRepository repository;

  /**
   * Return one ProductCategory.
   *
   * @param categoryId - the ID of the ProductCategory
   * @return one ProductCategory
   */
  @Override
  @Cacheable(key = "#categoryId")
  public ProductCategory findOne(Integer categoryId) {
    return repository.findOne(categoryId);
  }

  /**
   * Return all ProductCategory.
   *
   * @return all ProductCategories
   */
  @Override
  @Cacheable(key = "123")
  public List<ProductCategory> findAll() {
    return repository.findAll();
  }

  /**
   * Return a list of ProductCategory.
   *
   * @param categoryTypeList - a list of ProductCategory ID
   * @return a list of ProductCategory
   */
  @Override
  public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
    return repository.findByCategoryTypeIn(categoryTypeList);
  }

  /**
   * Save the productCategory.
   *
   * @param productCategory - the productCategory to save
   * @return the saved productCategory
   */
  @Override
  @CachePut(key = "#productCategory.categoryId")
  public ProductCategory save(ProductCategory productCategory) {
    return repository.save(productCategory);
  }
}
