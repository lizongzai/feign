package com.example.service;

import com.example.pojo.Product;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 功能描述: 调用服务生产者的微服务名称,例如：service-provider
 *
 * @author lizongzai
 * @date 2023/02/27 11:50
 * @since 1.0.0
 */
@FeignClient("service-provider")
public interface IProductService {

  /**
   * 功能描述: 查询商品列表
   *
   * @return
   */
  //配置需要调用的微服务地址和参数
  @GetMapping("/product/list")
  List<Product> selectProductList();

  /**
   * 功能描述: 根据主键查询商品
   *
   * @param id
   * @return
   */
  @GetMapping("/product/{id}")
  Product selectProductById(@PathVariable("id") Integer id);


}
