package domain.Order;

import domain.Member.Member;

public interface DiscountPolicy {
    int discountPolicy(Order order);
}
