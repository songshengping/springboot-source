package com.song.springboot.service;

import com.song.springboot.mapper.OrderItemMapper;
import com.song.springboot.mapper.OrderMapper;
import com.song.springboot.mapper.ProductMapper;
import com.song.springboot.model.Order;
import com.song.springboot.model.OrderItem;
import com.song.springboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 订单服务
 * @Date 2020/7/20 23:04
 * @Created by Jeremy
 */
@Service
public class OrderService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ProductMapper productMapper;

    // 商品ID
    private int purchaseProductId = 100100;

    // 购买数量
    private int purchaseProductNum = 1;
    public Integer createOrder() throws Exception {
        Product product = productMapper.selectByPrimaryKey(purchaseProductId);
        if (product == null) {
            throw new Exception("购买商品:" +purchaseProductId+"不存在");
        }

        // 商品当前库存
        Integer currentCount = product.getCount();
        // 校验库存
        if (purchaseProductNum > currentCount) {
            throw new Exception("商品"+purchaseProductId+"仅剩"+currentCount+"件,无法购买");
        }
        // 计算剩余库存
        Integer leftCount = currentCount - purchaseProductNum;
        // 更新库存
        product.setCount(leftCount);
        product.setUpdateTime(new Date());
        product.setUpdateUser("ssp");
        productMapper.updateByPrimaryKey(product);

        Order order = new Order();
        order.setOrderAmount(product.getPrice().multiply(new BigDecimal(purchaseProductNum)));
        order.setOrderStatus(1);
        order.setReceiverName("ssp");
        order.setReceiverMobile("18513355742");
        order.setUpdateTime(new Date());
        order.setUpdateUser("ssp");
        orderMapper.insertSelective(order);

        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(order.getId());
        orderItem.setProductId(product.getId());
        orderItem.setPurchasePrice(product.getPrice());
        orderItem.setPurchaseNum(purchaseProductNum);
        orderItem.setCreateUser("ssp");
        orderItem.setCreateTime(new Date());
        orderItemMapper.insertSelective(orderItem);
        return order.getId();
    }
}
