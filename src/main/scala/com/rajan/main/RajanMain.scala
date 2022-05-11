package com.rajan.main

object RajanMain {

  def main(args: Array[String]): Unit = {
    println("Hi")



    val  myArray = Array("surender","raja")
    println(myArray.size)
    println(myArray(0))
    println(myArray(1))

    myArray(0) = "hadoop"

    println(myArray(0))
    println(myArray(1))

    myArray.+("spark")
    println(myArray.size)
    myArray.foreach(println)

    myArray.drop(1)

    println(myArray.size)
  }

}
