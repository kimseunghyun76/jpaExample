package jpabook.jpashop.domain.item;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:34
 * To change this template use File | Settings | File and Code Templates.
 */
@Data
@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String author;

    private String isbn;
}
