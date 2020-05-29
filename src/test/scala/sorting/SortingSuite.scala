package sorting

import org.scalatest.FunSuite

class SortingSuite extends FunSuite {

  test("T1"){
    val a = Sort.BubbleSort[Int](List())
    assert(a == List[Int]())
  }
  test("T2"){
    val a = Sort.BubbleSort(List(1))
    assert(a == List[Int](1))
  }
  test("T3"){
    val a = Sort.BubbleSort(List(-2,5,9,4,2,1,0,5,20))
    assert(a == List[Int](-2,0,1,2,4,5,5,9,20))
  }
  test("T4"){
    val a = Sort.BubbleSort(List(2f,1f,0f))
    assert(a == List[Float](0f,1f,2f))
  }
  test("T5") {
    val a = Sort.BubbleSort(List(1L))
    assert(a == List[Long](1L))
  }
  test("T6"){
    val a = Sort.BubbleSort(List(-2f,5f,9f,4f,2f,1f,0f,5f,20f))
    assert(a == List[Float](-2f,0f,1f,2f,4f,5f,5f,9f,20f))
  }
  test("T7"){
    val a = Sort.BubbleSort(List("apple"))
    assert(a == List[String]("apple"))
  }
  test("T8"){
    val a = Sort.BubbleSort(List("prosecution"))
    assert(a == List[String]("prosecution"))
  }
  test("T9"){
    val a = Sort.BubbleSort(List("spray", "conception", "waterfall", "designer", "deck", "arena", "hang", "theorist", "looting"))
    assert(a == List[String]("arena", "conception", "deck", "designer", "hang", "looting", "spray", "theorist", "waterfall"))
  }
  test("T10"){
    val a = Sort.InsertionSort[Int](List())
    assert(a == List[Int]())
  }
  test("T11"){
    val a = Sort.InsertionSort(List(1))
    assert(a == List[Int](1))
  }
  test("T12"){
    val a = Sort.InsertionSort(List(-2,5,9,4,2,1,0,5,20))
    assert(a == List[Int](-2,0,1,2,4,5,5,9,20))
  }
  test("T13"){
    val a = Sort.InsertionSort(List(2f,1f,0f))
    assert(a == List[Float](0f,1f,2f))
  }
  test("T14") {
    val a = Sort.InsertionSort(List(1L))
    assert(a == List[Long](1L))
  }
  test("T15"){
    val a = Sort.InsertionSort(List(-2f,5f,9f,4f,2f,1f,0f,5f,20f))
    assert(a == List[Float](-2f,0f,1f,2f,4f,5f,5f,9f,20f))
  }
  test("T16"){
    val a = Sort.InsertionSort(List("apple"))
    assert(a == List[String]("apple"))
  }
  test("T17"){
    val a = Sort.InsertionSort(List("prosecution"))
    assert(a == List[String]("prosecution"))
  }
  test("T18"){
    val a = Sort.InsertionSort(List("spray", "conception", "waterfall", "designer", "deck", "arena", "hang", "theorist", "looting"))
    assert(a == List[String]("arena", "conception", "deck", "designer", "hang", "looting", "spray", "theorist", "waterfall"))
  }
  test("T19"){
    val a = Sort.SelectionSort[Int](List())
    assert(a == List[Int]())
  }
  test("T20"){
    val a = Sort.SelectionSort(List(1))
    assert(a == List[Int](1))
  }
  test("T21"){
    val a = Sort.SelectionSort(List(-2,5,9,4,2,1,0,5,20))
    assert(a == List[Int](-2,0,1,2,4,5,5,9,20))
  }
  test("T22"){
    val a = Sort.SelectionSort(List(2f,1f,0f))
    assert(a == List[Float](0f,1f,2f))
  }
  test("T23") {
    val a = Sort.SelectionSort(List(1L))
    assert(a == List[Long](1L))
  }
  test("T24"){
    val a = Sort.SelectionSort(List(-2f,5f,9f,4f,2f,1f,0f,5f,20f))
    assert(a == List[Float](-2f,0f,1f,2f,4f,5f,5f,9f,20f))
  }
  test("T25"){
    val a = Sort.SelectionSort(List("apple"))
    assert(a == List[String]("apple"))
  }
  test("T26"){
    val a = Sort.SelectionSort(List("prosecution"))
    assert(a == List[String]("prosecution"))
  }
  test("T27"){
    val a = Sort.SelectionSort(List("spray", "conception", "waterfall", "designer", "deck", "arena", "hang", "theorist", "looting"))
    assert(a == List[String]("arena", "conception", "deck", "designer", "hang", "looting", "spray", "theorist", "waterfall"))
  }
  test("T28"){
    val a = Sort.MergeSort[Int](List())
    assert(a == List[Int]())
  }
  test("T29"){
    val a = Sort.MergeSort(List(1))
    assert(a == List[Int](1))
  }
  test("T30"){
    val a = Sort.MergeSort(List(-2,5,9,4,2,1,0,5,20))
    assert(a == List[Int](-2,0,1,2,4,5,5,9,20))
  }
  test("T31"){
    val a = Sort.MergeSort(List(2f,1f,0f))
    assert(a == List[Float](0f,1f,2f))
  }
  test("T32") {
    val a = Sort.MergeSort(List(1L))
    assert(a == List[Long](1L))
  }
  test("T33"){
    val a = Sort.MergeSort(List(-2f,5f,9f,4f,2f,1f,0f,5f,20f))
    assert(a == List[Float](-2f,0f,1f,2f,4f,5f,5f,9f,20f))
  }
  test("T34"){
    val a = Sort.MergeSort(List("apple"))
    assert(a == List[String]("apple"))
  }
  test("T35"){
    val a = Sort.MergeSort(List("prosecution"))
    assert(a == List[String]("prosecution"))
  }
  test("T36"){
    val a = Sort.MergeSort(List("spray", "conception", "waterfall", "designer", "deck", "arena", "hang", "theorist", "looting"))
    assert(a == List[String]("arena", "conception", "deck", "designer", "hang", "looting", "spray", "theorist", "waterfall"))
  }
  test("T37"){
    val a = Sort.QuickSort[Int](List())
    assert(a == List[Int]())
  }
  test("T38"){
    val a = Sort.QuickSort(List(1))
    assert(a == List[Int](1))
  }
  test("T39"){
    val a = Sort.QuickSort(List(-2,5,9,4,2,1,0,5,20))
    assert(a == List[Int](-2,0,1,2,4,5,5,9,20))
  }
  test("T40"){
    val a = Sort.QuickSort(List(2f,1f,0f))
    assert(a == List[Float](0f,1f,2f))
  }
  test("T41") {
    val a = Sort.QuickSort(List(1L))
    assert(a == List[Long](1L))
  }
  test("T42"){
    val a = Sort.QuickSort(List(-2f,5f,9f,4f,2f,1f,0f,5f,20f))
    assert(a == List[Float](-2f,0f,1f,2f,4f,5f,5f,9f,20f))
  }
  test("T43"){
    val a = Sort.QuickSort(List("apple"))
    assert(a == List[String]("apple"))
  }
  test("T44"){
    val a = Sort.QuickSort(List("prosecution"))
    assert(a == List[String]("prosecution"))
  }
  test("T45"){
    val a = Sort.QuickSort(List("spray", "conception", "waterfall", "designer", "deck", "arena", "hang", "theorist", "looting"))
    assert(a == List[String]("arena", "conception", "deck", "designer", "hang", "looting", "spray", "theorist", "waterfall"))
  }
}
