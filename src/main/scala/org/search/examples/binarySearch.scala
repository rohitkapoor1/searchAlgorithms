package org.search.examples
import scala.math.floorDiv
object binarySearch extends App {

  if (args.length !=2) {
    throw new Exception("pass comma separated list and a number to search")
  }
  var input_sorted_list : Array[Int] = Array()
  var item = Integer.MAX_VALUE
  try {
    input_sorted_list = args(0).split(",").map(_.toInt)
    item = args(1).toInt
  }
  catch {
    case _: Throwable => println("invalid inputs")
  }


  // calling function for binary search
  binarySearchFunc(input_sorted_list,item)

  def binarySearchFunc(sorted_list: Array[Int], item: Int) : Boolean = {

    var low = 0
    var high = sorted_list.length -1

    while (low <= high) {
      val median = floorDiv(low+high,2)
      if (sorted_list(median) == item) {
        println("Binary Search: item found in position " + (median+1) + " in the sorted list")
        return true
      }
      else if (item > sorted_list(median)) {
        low = median + 1
      }
      else {
        high = median - 1
      }
    }
    println("Binary Search: item not found in array")

    false
  }

}
