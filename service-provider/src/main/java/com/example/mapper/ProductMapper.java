package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Product;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lizongzai
 * @since 2023-02-23
 */
public interface ProductMapper extends BaseMapper<Product> {

  /**
   * 功能描述: 获取所有商品列表
   *
   * @return
   */
  List<Product> getAllProducts();


  /**
   * 功能描述: 根据主键查询商品
   *
   * @param id
   * @return
   */
  Product selectProductById(@Param("id") Integer id);
}
