package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:13
 * To change this template use File | Settings | File and Code Templates.
 */
@Data
@Embeddable
public class Address {

    private String city;

    private String street;

    private String zipcode;
}
