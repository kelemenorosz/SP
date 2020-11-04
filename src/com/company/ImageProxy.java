package com.company;

public class ImageProxy implements Element{

    private String url;
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
}
