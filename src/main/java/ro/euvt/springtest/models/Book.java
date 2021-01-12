package ro.euvt.springtest.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Access(AccessType.PROPERTY)
@NoArgsConstructor(force = true)
public class Book {

    private int id;
    private String title;
    private Author author;

    private List<Element> elements = new ArrayList<Element>();

    public Book(String name) {
        this.title = name;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    @ManyToOne(targetEntity = Author.class)
    public Author getAuthor() {
        return author;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public String toString() {
        return title + " " + author;
    }

    public void print() {
        System.out.print(this);
        System.out.print(elements);
    }

    public ArrayList<Element> getElements() {return (ArrayList<Element>) this.elements;}

    public void addContent(Element content) {
        this.elements.add(content);
    }

}
