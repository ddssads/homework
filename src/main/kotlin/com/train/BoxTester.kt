package com.train.post

import java.util.*


fun main() {
    var scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    var length = scanner.nextFloat()
    print("Please enter object's width: ")
    var width = scanner.nextFloat()
    print("Please enter object's height: ")
    var height = scanner.nextInt()
    var box3 = PostBox3(length,width, height)
    var box5 = PostBox5(length,width, height)
    if(length <= 23 && width<= 14 && height <=13 ){
        box3.validate(length, width, height)
    } else if(length <= 39.5 && width <= 27.5 && height <= 23){
        box5.validate(length, width, height)
    } else {
        println("Your size is too big")
    }


}


class PostBox3(var length: Float, var width:Float, var height: Int){
    fun validate(length: Float,width: Float,height: Int) : Boolean {
        if (length <= 23 && width <= 14 && height <= 13) {
            println("You must use Box3")
            return true
        } else {
            return false
        }
     }
}

class PostBox5(var length: Float,var width:Float,var height: Int){
    fun validate(length: Float,width: Float,height: Int) : Boolean {
        if(length <= 39.5 && width <= 27.5 && height <= 23){
            println("You must use Box5")
            return true
        } else {
            return false
        }
    }
}

