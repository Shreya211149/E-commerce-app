package com.genie.Ecommerce.controller;

import com.genie.Ecommerce.dto.OrderDTO;
import com.genie.Ecommerce.entities.OrderRequest;
import com.genie.Ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class OrderController {

    @Autowired
     private OrderService orderService;

    @PostMapping("/place/{userId}")
    public OrderDTO PlaceOrder(@PathVariable Long userId, @RequestBody OrderRequest orderRequest){
      return orderService.placeOrder(userId,orderRequest.getProductQuantities(),orderRequest.getTotalAmount());

    }

    @GetMapping("/all-orders")
    public List<OrderDTO> getAllorders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/user/{userId}")
    public List<OrderDTO> getOrderByUser(@PathVariable Long userId){

        return orderService.getOrderByUser(userId);
    }
}
