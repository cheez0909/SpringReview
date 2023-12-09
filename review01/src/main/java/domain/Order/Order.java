package domain.Order;

import domain.Member.Member;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
public class Order {

    private Long id;
    private String name;
    private int price;
    private int discount;
    private Member member;

    public Order(Long id, String name, int price, Member member) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.member = member;
    }

}
