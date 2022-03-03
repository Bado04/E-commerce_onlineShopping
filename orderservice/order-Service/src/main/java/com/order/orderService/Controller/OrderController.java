package com.order.orderService.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.orderService.Common.TransactionRequest;
import com.order.orderService.Common.TransactionResponse;
import com.order.orderService.Entity.Order;
import com.order.orderService.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	
	@PostMapping("/bookorder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request){
		
		return service.saveOrder(request);
		
		
	}
	
}
