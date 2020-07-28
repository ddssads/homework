package com.train;

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
        PostBox3 box3 = new PostBox3(length,width,height);
        PostBox5 box5 = new PostBox5(length,width,height);
        if(length <= 23 && width <= 14 && height <= 13){
            box3.vaildate(length,width,height);
        }else if(length <=39.5 && width <=27.5 && height <= 23){
            box5.vaildate(length,width,height);
        }else {
            System.out.println("Your size is too big");
        }
    }
}
