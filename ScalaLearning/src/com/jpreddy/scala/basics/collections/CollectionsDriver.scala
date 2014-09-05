package com.jpreddy.scala.basics.collections

object CollectionsDriver {

  def main(args: Array[String]): Unit = {
    listExamples()
    
  }
  
  def listExamples():Unit = {
  
    val myList:List[String] = List("Hi","Hello","What")
    println(myList)
    
    //filter
    println(myList.filter(s => s.length() == 4 ))
    
    //prepend
      val myList1 = "Mr" :: myList
      println(myList1)
    
    //merge two lists
      val myList2 = myList1 ::: myList
      println(myList2)
    
     //foreach
      myList.foreach(s => println(s))
      
      //forall
      println(myList.forall( s => s.length > 0))
      
      //sort
     // val sortList = myList.sort((s,t) =>  s.charAt(0).toLower < t.charAt(0).toLower )
  }

}