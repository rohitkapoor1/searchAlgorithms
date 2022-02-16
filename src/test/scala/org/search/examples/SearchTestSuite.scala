package org.search.examples

import org.scalatest.FunSuite

class SearchTestSuite extends FunSuite{

  test("Binary Search positive search") {
    assert(binarySearch.binarySearchFunc(Array(1,2,3,4,5),4) === true)
  }
  test("Binary Search  negative search") {
    assert(binarySearch.binarySearchFunc(Array(1,2,3,4,5),40) === false)
  }

  test("Linear Search positive search") {
    assert(linearSearch.linearSearchFunc(Array(1,2,3,4,5),4) === true)
  }
  test("Linear Search  negative search") {
    assert(linearSearch.linearSearchFunc(Array(100, 1,2,3,4,5),40) === false)
  }
}

