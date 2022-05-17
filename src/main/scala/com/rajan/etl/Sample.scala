package com.rajan.etl

class Sample extends SampleBase {

  val id = 100
  val data = 200
  val str = "hadoop"
  val result = if(id > 10) {"pass"} else {"fail"}

  def method1():Unit = {

    println("This is method 1")

  }



  def method2():Int = {
    println("This is method 2")
  20
  }


  def method3(data:Int):Int = {
    println("This is method 3")
   30
  }

  def strMethod1():String = {
    println("This is strMethod1")
    "surender"

  }


  def strMethod2(str:String):String = {
    println("This is strMethod2")
    "surender"
  }

  def strMethod3(input:Int):String = {
    println("This is strMethod3")
    "surender"
  }

  //val list = List("100,surender", "101,raja")
  def process(list:List[String]):Array[String] = {
   list.map(elem => elem.split(","))
     .map(arr => arr(1))
     .toArray

  }


}
