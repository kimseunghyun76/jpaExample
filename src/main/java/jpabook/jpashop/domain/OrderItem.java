package jpabook.jpashop.domain;

import jpabook.jpashop.domain.item.Item;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:25
 * To change this template use File | Settings | File and Code Templates.
 */

@Data
@Entity
@Table(name ="ORDER_ITEM")
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;      //주문상품

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;        //주문

    private int orderPrice;      //주문 가격

    private int count;           //주문 수량


}
