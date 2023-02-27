package com.example.controller;

import com.example.pojo.Product;
import com.example.pojo.RespBean;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private IProductService productService;

  /**
   * 功能描述: 使用POST方法,根据主键查询商品
   *
   * @param id
   * @return
   */
  @PostMapping("/info")
  public Product queryProductById(Integer id) {
    return productService.queryProductById(id);
  }

  /**
   * 功能描述: 使用POST方法,添加商品
   *
   * @param product
   * @return
   */
  @PostMapping("/save")
  public RespBean addProduct(@RequestBody Product product) {

    if (product.getProductName() == null || product.getProductNum() == null || product.getProductPrice() == null) {
      return RespBean.success("添加失败");
    }
    return productService.addProduct(product);
  }
}
