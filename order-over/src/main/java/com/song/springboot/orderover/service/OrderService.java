package com.song.springboot.orderover.service;

import com.song.springboot.orderover.constant.CommonConstant;
import com.song.springboot.orderover.mapper.OrderItemMapper;
import com.song.springboot.orderover.mapper.OrderMapper;
import com.song.springboot.orderover.mapper.ProductMapper;
import com.song.springboot.orderover.model.Order;
import com.song.springboot.orderover.model.OrderItem;
import com.song.springboot.orderover.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 订单服务类
 * @Date 2020/8/24 22:38
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

    @Transactional
    public Integer createOrder(Integer buyCount) throws Exception {
        Product product = productMapper.selectByPrimaryKey(Integer.parseInt(CommonConstant.PURCHASE_PRODUCT_ID));
        if (product == null) {
            throw new Exception("购买的商品:" +CommonConstant.PURCHASE_PRODUCT_ID+ "不存在");
        }
        // 商品当前库存
        Integer currentCount = product.getCount();

        // 校验库存
        if (buyCount > currentCount) {
            throw new Exception("商品仅剩" + currentCount + "件.无法购买");
        }
//        // 计算剩余库存
//        Integer leftCount = currentCount - buyCount;
//        // 更新商品信息
//        product.setCount(leftCount);
//        product.setUpdateTime(new Date());
//        product.setCreateUser("Jeremy");
//        productMapper.updateByPrimaryKeySelective(product);
         int updateCount = productMapper.updateProductCount(product.getId(),buyCount,"Jeremy", new Date());
        if (updateCount > 0) {
            System.out.println("updateCount = " + updateCount);
            // 更新Order信息
            Order order = new Order();
            order.setOrderAmount(product.getPrice().multiply(new BigDecimal(buyCount)));
            order.setOrderStatus(1);// 待处理
            order.setReceiverName("Jeremy");
            order.setReceiverMobile("18513355742");
            order.setCreateTime(new Date());
            order.setCreateUser("Jeremy");
            order.setUpdateTime(new Date());
            order.setUpdateUser("Jeremy");
            orderMapper.insert(order);

            // 更新订单明细
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderId(order.getId());
            orderItem.setProductId(product.getId());
            orderItem.setPurchasePrice(product.getPrice());
            orderItem.setPurchaseNum(buyCount);
            orderItem.setCreateTime(new Date());
            orderItem.setCreateUser("Jeremy");
            orderItem.setUdpateUser("Jeremy");
            orderItem.setUpdateTime(new Date());
            orderItemMapper.insert(orderItem);

        } else {
            System.out.println("updateCount = " + updateCount);
        }
        return updateCount;
    }

}
