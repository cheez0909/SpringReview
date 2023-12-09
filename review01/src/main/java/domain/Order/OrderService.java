package domain.Order;

import java.util.List;

public interface OrderService {
    // 주문 저장
    void order(Order order);

    // 주문 조회
    Order fideOne(Long id);

    // 주문 전체 조회
    List<Order> findAll();
}
