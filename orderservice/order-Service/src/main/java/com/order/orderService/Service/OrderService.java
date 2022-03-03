package com.order.orderService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.orderService.Common.Payment;
import com.order.orderService.Common.TransactionRequest;
import com.order.orderService.Common.TransactionResponse;
import com.order.orderService.Entity.Order;
import com.order.orderService.Repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	public   TransactionResponse saveOrder (TransactionRequest request) {
		String response = "";
		Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        
        Payment paymentResponse = template.postForObject("http://localhost:9006/payment/doPayment", payment, Payment.class);

        response = paymentResponse.getPaymentStatus().equals("success") ? "payment processing successful and order placed" : "there is a failure in payment api , order added to cart";
		repository.save(order);
		return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
		
		
	}
		
}
