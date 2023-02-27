package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.ProductMapper;
import com.example.pojo.Product;
import com.example.pojo.RespBean;
import com.example.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lizongzai
 * @since 2023-02-23
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements
    IProductService {

  @Autowired
  private ProductMapper productMapper;

  /**
   * 功能描述: 获取所有商品列表
   *
   * @return
   */
  @Override
  public List<Product> getAllProducts() {
    return productMapper.getAllProducts();
  }

  /**
   * 功能描述: 根据主键查询商品
   *
   * @param id
   * @return
   */
  @Override
  public Product selectProductById(Integer id) {
    return productMapper.selectProductById(id);
  }

  /**
   * 功能描述: 使用POST方法,根据主键查询商品
   *
   * @param id
   * @return
   */
  @Override
  public Product queryProductById(Integer id) {
    return productMapper.queryProductById(id);
  }

  /**
   * 功能描述: 使用POST方法,添加商品
   *
   * @param product
   * @return
   */
  @Override
  public RespBean addProduct(Product product) {

    int result = productMapper.addProduct(product);
    System.out.println("添加商品 = " + product);
    if (result > 0 ) {
      return RespBean.success("添加成功!");
    } else {
      return RespBean.success("添加失败!");
    }
  }
}
