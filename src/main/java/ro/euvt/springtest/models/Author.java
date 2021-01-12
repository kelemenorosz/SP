package ro.euvt.springtest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "author_name")
    private String authorName;

    public Author(String name) {
        this.authorName = name;
    }

    public String toString() {
        return this.authorName;
    }
}
