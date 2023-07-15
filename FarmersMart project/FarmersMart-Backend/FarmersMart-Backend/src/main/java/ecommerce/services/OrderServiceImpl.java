package ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.entities.Customer;
import ecommerce.entities.Order;
import ecommerce.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired OrderRepository dao;
	
	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Order> getCustomerOrders(Customer customer) {
		// TODO Auto-generated method stub
		return dao.findByCustomer(customer);
	}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	
}
