package org.bean;

public class Vodafone {
    private String imeiNumber;

    public Vodafone(String imeiNumber){
        this.imeiNumber=imeiNumber;
    }
    public  void call(){
        System.out.println("called using Vodafone"+imeiNumber);
    }
    public void data(){
        System.out.println("surfed using Vodafone"+imeiNumber);
    }
}
