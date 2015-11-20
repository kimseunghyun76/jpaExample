package jpabook.jpashop.domain;

import jpabook.jpashop.domain.item.Item;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-20
 * Time : 오후 5:40
 * To change this template use File | Settings | File and Code Templates.
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM", joinColumns = @JoinColumn(name="CATEGORY_ID"),
    inverseJoinColumns = @JoinColumn(name="ITEM_ID"))
    private List<Item> items = new ArrayList<Item>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<Category>();

    //연관 메소드
    public void addChildCategory(Category child){
        this.child.add(child);
        child.setParent(this);
    }
}
