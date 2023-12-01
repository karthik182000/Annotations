package org.bean;

public class Jio {
    private String imeiNumber;

    public Jio(String imeiNumber){
        this.imeiNumber=imeiNumber;
    }
    public  void call(){
        System.out.println("called using Jio");
    }
    public void data(){
        System.out.println("surfed using Jio");
    }
}
