package jpabook.jpashop.domain.item;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:35
 * To change this template use File | Settings | File and Code Templates.
 */
@Data
@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;

    private String etc;
}
