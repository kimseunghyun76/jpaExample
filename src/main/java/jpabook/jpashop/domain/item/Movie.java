package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.item.Item;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:37
 * To change this template use File | Settings | File and Code Templates.
 */
@Data
@Entity
@DiscriminatorValue("M")
public class Movie extends Item {
    private String director;
    private String actor;
}
