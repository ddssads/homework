package com.train;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Create scanner object to input box info
        System.out.print("Please enter object's length: ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        int height = scanner.nextInt();
        PostBox3 box3 = new PostBox3(23f,14f,13);
        PostBox5 box5 = new PostBox5(39.5f,27.5f,23);
        if(box3.vaildate(length,width,height)){
            box3.getName();
        } else if(box5.vaildate(length,width,height)){
            box5.getName();
        } else {
            System.out.println("Your size is too big");
        }
        //List and foreach train
        PostBox box3List = new PostBox3(23f,14f,13);
        PostBox box5List = new PostBox5(39.5f,27.5f,23);
        List<PostBox> boxes = new ArrayList<>();
        boxes.add(box3List);
        boxes.add(box5List);
        for (PostBox box:boxes) {
            if (box.vaildate(length, width, height)) {
                box.getName();
                break;
            }
        }
        if(boxes.get(0).vaildate(length, width, height) != true &&
           boxes.get(1).vaildate(length, width, height) != true){
            System.out.println("Your size is too big");
        }
    }
}
