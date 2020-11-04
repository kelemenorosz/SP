package com.company;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String name;

    public Image(String name) {

        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.print(this.toString());
    }

}
