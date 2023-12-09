package domain.Order;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository = new MemoryOrderRepository();
    @Override
    public void order(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order fideOne(Long id) {
        return orderRepository.fideOne(id);
    }

    @Override
    public List<Order> findAll() {

        return orderRepository.findAll();
    }
}
