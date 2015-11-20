package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:37
 * To change this template use File | Settings | File and Code Templates.
 */

@Data
@Entity
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;      //ENUM [READY(준비) , COMP(배송)]

}
