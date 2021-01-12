package ro.euvt.springtest.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Transient;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ImageProxy implements Element{

    @Id
    @GeneratedValue
    private int id;
    private String url;

    @Transient
    private Image realImage = null;

    public ImageProxy(String url) {
        this.url = url;
    }

    /*public Image loadImage() {

        if (this.realImage == null) {
            System.out.println("Nuts");
            this.realImage = new Image(this.url);
        }
        return this.realImage;

    }*/

    public void print() {

        if(realImage==null){
            realImage = new Image(this.url);
        }
        realImage.print();
    }

    @Override
    public void accept(Visitor visitor) {

    }

}
