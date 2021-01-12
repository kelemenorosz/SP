package ro.euvt.springtest.models;

import java.util.concurrent.TimeUnit;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Image implements Element{

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "image_name")
    private String imageName;

    public Image(String name) {

        this.imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return this.imageName;
    }

    @Override
    public void print() {
        System.out.print(this.toString());
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

}