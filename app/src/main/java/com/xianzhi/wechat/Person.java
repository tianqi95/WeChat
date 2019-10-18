package com.xianzhi.wechat;

/**
 * Demo class
 *
 * @author LiBo
 * @date 2019/three/14
 */
public class Person {
    private String name;
    private int imageId;
    private String text;
    public Person(String name, int imageId, String text){
        this.imageId=imageId;
        this.name=name;
        this.text=text;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
    public String getText(){
        return text;
    }
}
