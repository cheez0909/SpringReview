package domain.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryOrderRepository implements OrderRepository{

    private Map<Long, Order> orderMap  = new HashMap<>();
    @Override
    public void save(Order order) {
        orderMap.put(order.getId(), order);
    }

    @Override
    public Order fideOne(Long id) {
        return orderMap.get(id);
    }

    @Override
    public List<Order> findAll() {
        return orderMap.values().stream().toList();
    }
}
