package ro.euvt.springtest.models;

import ro.euvt.springtest.services.AlignStrategy;

import javax.persistence.*;

@Entity
@Access(AccessType.PROPERTY)
public class Paragraph implements Element {

    private int id;
    private String text;
    AlignStrategy strategy;

    public Paragraph(String name) {
        this.text = name;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }

    public String toString() {
        return this.text;
    }

    public String getText() {
        return text;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Transient
    public AlignStrategy getStrategy() {
        return strategy;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "text")
    public void setText(String name) {
        this.text = name;
    }

    @Override
    public void print() {
        if (strategy != null) {
            strategy.render(this, new Context());
            return;
        }
        System.out.println(this.toString());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}