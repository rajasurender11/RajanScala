package com.rajan.main

import com.rajan.etl.Sample

object SampleMain {

  val myList = List("100,surender", "101,raja")
  def main(args: Array[String]): Unit = {

    println("Hi, This is the entry pointy for scala object SampleMain")

    val obj1 = new Sample()

    println(s"${obj1.id}  ${obj1.data} ${obj1.str}  ${obj1.result}")

    obj1.method1()
    val method2Value = obj1.method2()
    println("method2Value " + method2Value)
    obj1.method3(45)
    obj1.strMethod1()
    obj1.strMethod2(obj1.str)
    obj1.strMethod3(obj1.id*2)
    val myArray = obj1.process(myList)

   println(myArray.toList)
    println(obj1.baseConstant)

    obj1.baseMethod()


  }

}
