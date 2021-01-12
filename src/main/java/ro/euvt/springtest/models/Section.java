package ro.euvt.springtest.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Section implements Element {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "section_name")
    private String sectionName;

    @OneToMany(targetEntity = Section.class)
    private List<Element> elements = new ArrayList<Element>();

    public Section(String name) {
        this.sectionName = name;
    }

    @Override
    public void print() {
        System.out.println("Section: "+this.sectionName);
        for(Element i : elements){
            i.print();
        }
    }

    public String toString() {
        return sectionName + "" + elements;
    }

    public int add(Element element) {
        this.elements.add(element);
        return this.elements.size() - 1;
    }

    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public ArrayList<Element> getElements() {
        return (ArrayList<Element>) elements;
    }
}
