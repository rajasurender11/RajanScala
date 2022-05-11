package com.rajan.main

object DemoMain {

  def main(args: Array[String]): Unit = {



    val myArray = Array("surender","raja")
    val myArrayInt = Array(1,2,45,67,0)

    val listStr = List("surender|CHN","hadoop|BNG", "100|BNG")
    val listInt = List(2,9)

    val seqStr = Seq("spark","scala")
    val seqInt = Seq(9,9,9,7,0)

    val tupleStr = ("100","surender","ajay")

    seqStr.foreach(elem => {
      println(elem)
       println(elem.length)
    })

    myArray.foreach(println)

    println(tupleStr._3)


    for (itr <- myArray) {
      println("#1 for loop iteration " + itr)
    }

    for(i <- 3 until 5){
      println(i)
    }

    val MyArrayLength = myArray.size //2




    val id = 100
    val str = "surender"

    if(id ==  100) {
     println("if condition is pass")
      println("if condition is pass")
      println("if condition is pass")
      println("if condition is pass")

      for(i <- 0 to MyArrayLength-1){
        if(i == 0){
          println(myArray(i))
        }

      }

    }
    else {
      println("if condition is fail")
        println("if condition is fail")
        println("if condition is fail")

    }


    var cnt = 1

    while(cnt <=5){
      println("value of cnt "+cnt)
      println(s"value of cnt $cnt") // string interpolation
      cnt = cnt+1//2
    }

  }

}
