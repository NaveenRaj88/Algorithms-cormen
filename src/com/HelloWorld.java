package com;

/**
 * Created by Naveen Kumar .A on 8/21/16.
 */
public class HelloWorld {

    public static void dummy(){

    }
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class hel extends  HelloWorld{
    public static void hel(){
        new hel().dummy();
    }
}
