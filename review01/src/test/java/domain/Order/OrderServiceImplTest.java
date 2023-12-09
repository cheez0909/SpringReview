package domain.Order;

import domain.Member.Grade;
import domain.Member.Member;
import domain.Member.MemberSerivice;
import domain.Member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    public OrderService orderService = new OrderServiceImpl();
    public MemberSerivice memberSerivice = new MemberServiceimpl();
    @Test
    void 주문하기(){
        Member member = new Member(1L, "이름", Grade.VIP);
        memberSerivice.join(member);
        Order order = new Order(1L, "새우깡", 3000, member);
        orderService.order(order);

        Assertions.assertThat(orderService.fideOne(1L)).isEqualTo(order);
        Assertions.assertThat(orderService.findAll().size()).isEqualTo(1);
    }

}