package ro.euvt.springtest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "bTable")
public class Table implements Element {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.print(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

}
