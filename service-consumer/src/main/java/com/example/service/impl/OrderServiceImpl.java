package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.OrderMapper;
import com.example.pojo.Order;
import com.example.pojo.Product;
import com.example.service.IOrderService;
import com.example.service.IProductService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lizongzai
 * @date 2023/02/27 11:50
 * @since 1.0.0
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

  @Autowired
  private OrderMapper orderMapper;
  @Autowired
  private IProductService productService;

  /**
   * 功能描述: 获取订单
   *
   * @param id
   * @return
   */
  @Override
  public Order selectOrderById(Integer id) {

    //查询商品列表
//    List<Product> productList = productService.selectProductList();

    Product productById = productService.selectProductById(id);
    System.out.println("商品信息 = " + productById);

    //获取订单信息
    Order mapperOrderById = orderMapper.getOrderById(id);
    Order order = new Order();
    order.setId(mapperOrderById.getId());
    order.setOrderNo(mapperOrderById.getOrderNo());
    order.setOrderAddress(mapperOrderById.getOrderAddress());
    order.setTotalPrice(mapperOrderById.getTotalPrice());
    order.setProductList(Collections.singletonList(productById));
    return order;
  }
}
