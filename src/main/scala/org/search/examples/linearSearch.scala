package org.search.examples

object linearSearch extends App {

  if (args.length !=2) {
    throw new Exception("pass comma separated list and a number to search")
  }
  var input_list : Array[Int] = Array()
  var item = Integer.MAX_VALUE
  try {
    input_list = args(0).split(",").map(_.toInt)
    item = args(1).toInt
  }
  catch {
    case _: Throwable => println("invalid inputs")
  }

  linearSearchFunc(input_list,item)

  def linearSearchFunc(input_list: Array[Int], item :Int) : Boolean = {
    for (i <- 0 to input_list.length -1 ) {
      if(input_list(i) == item) {
        println("Linear Search: item found in position " + (i+1) + " in the input list")
        return true
      }
    }
    println("Linear Search: item not found")
    false
  }

}
