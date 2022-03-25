package com.pokemon.msg.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "messages")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "message")
    private String text;


    public Person(long id, String name, String txt) {
        this.id = id;
        this.name = name;
        this.text = txt;
    }
    public Person(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "You {" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
