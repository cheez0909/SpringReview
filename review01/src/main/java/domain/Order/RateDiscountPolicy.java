package domain.Order;

import domain.Member.Grade;
import domain.Member.Member;
import domain.Member.MemberSerivice;
import domain.Member.MemberServiceimpl;

public class RateDiscountPolicy implements DiscountPolicy {

    private OrderService orderService = new OrderServiceImpl();
    private MemberSerivice memberSerivice = new MemberServiceimpl();

    @Override
    public int discountPolicy(Order order) {
        Member member = order.getMember();

        if (member.getGrade() == Grade.VIP) {
            if (order.getPrice() > 1000) {
                order.setDiscount(order.getPrice() - 1000);
                return order.getDiscount();
            } else {
                return 0;
            }
        } return order.getPrice();
    }
}
