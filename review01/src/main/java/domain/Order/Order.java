package domain.Order;

import domain.Member.Member;
import lombok.Data;



@Data
public class Order {
    private Long id;
    private Member member;
    private String name;
    private int price;

    public Order(Long id, Member member, String name, int price) {
        this.id = id;
        this.member = member;
        this.name = name;
        this.price = price;
    }
}
