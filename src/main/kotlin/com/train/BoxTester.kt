package com.train.post

import sun.font.TrueTypeFont
import java.util.*
import kotlin.collections.ArrayList


fun main() {
    var i : Int
    var scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    var length = scanner.nextFloat()
    print("Please enter object's width: ")
    var width = scanner.nextFloat()
    print("Please enter object's height: ")
    var height = scanner.nextInt()
    var box3 = PostBox3(length,width, height)
    var box5 = PostBox5(length,width, height)
    when{
        box3.validate(length,width, height) -> println("Box3")
        box5.validate(length,width, height) -> println("Box5")
        else -> println("Your size is too big")
    }






}

open class PostBox(var length: Float,var width: Float,var height: Int){
        open fun validate(length: Float, width: Float, height: Int): Boolean {
            return (length < this.length && width < this.width && height < this.height)
        }
}

class PostBox3(length: Float,width: Float,height: Int) : PostBox(23f , 14f, 13) {



}

class PostBox5(length: Float, width:Float, height: Int) : PostBox(39.5f, 27.5f, 23){



}

