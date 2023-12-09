package domain.Order;

import domain.Member.Grade;
import domain.Member.Member;
import domain.Member.MemberSerivice;
import domain.Member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    private DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private OrderService orderService = new OrderServiceImpl();
    public MemberSerivice memberSerivice = new MemberServiceimpl();
    @Test
    void 주문하기(){

        Member member = new Member(1L, "이름", Grade.VIP);
        memberSerivice.join(member);
        Member member1 = new Member(2L, "이름2", Grade.BASIC);
        memberSerivice.join(member1);
        Order order = new Order(1L, "새우깡", 3000, member);
        orderService.order(order);
        Order order2 = new Order(1L, "과자", 600, member);
        orderService.order(order2);
        Order order1 = new Order(2L, "새우깡2", 3000, member1);
        orderService.order(order1);


        int i = discountPolicy.discountPolicy(order);
        int i1 = discountPolicy.discountPolicy(order1);


        Assertions.assertThat(i).isEqualTo(2000);
        Assertions.assertThat(i1).isEqualTo(3000);
        Assertions.assertThat(discountPolicy.discountPolicy(order2)).isEqualTo(0);

    }

}