package sorting

object Sort{

  def isSorted(xs: List[Int]): Boolean = {
    !xs.sliding(2).toList.exists(x => x.head > x(1))
  }

  private def insert[A](elem: A, xs: List[A])(implicit op: Ordering[A]): List[A] = xs match {
    case Nil => List[A](elem)
    case x::xs1 => if(op.lt(x,elem)) x::insert(elem, xs1) else elem::x::xs1
  }
  def InsertionSort[A](xs: List[A])(implicit op: Ordering[A]): List[A] = {
    @scala.annotation.tailrec
    def foo(ys: List[A], result: List[A]): List[A] = ys match {
      case y::ys1 => foo(ys1, insert(y, result))
      case Nil => result
    }
    foo(xs, List[A]())
  }

  def SelectionSort[A](xs: List[A])(implicit op: Ordering[A]): List[A] = xs match {
    case Nil => List[A]()
    case x::Nil => List[A](x)
    case x::xs1 =>
      val mini = xs1.min
      val idx = xs1.indexOf(mini)
      if(op.lteq(x, mini)) x :: SelectionSort(xs1)
      else{
        val (first, second) = xs1.splitAt(idx)
        second.head :: SelectionSort(x :: first ::: second.tail)
      }
  }

  def MergeSort[A](xs: List[A])(implicit op: Ordering[A]): List[A] = {
    val n = xs.length/2
    if(n == 0) xs
    else{
      def merge(xs: List[A], ys: List[A]): List[A] ={
        (xs, ys) match {
          case (_, Nil) => xs
          case (Nil, _) => ys
          case (h1::t1 , h2::t2) =>
            if(op.lt(h1, h2)) h1 :: merge(t1,ys)
            else h2 :: merge(xs,t2)
        }
      }
      val (first, second) = xs.splitAt(n)
      merge(MergeSort(first), MergeSort(second))
    }
  }

  def BubbleSort[A](xs: List[A])(implicit op: Ordering[A]): List[A] = {
    def bar(lst1:List[A], lst2:List[A]): List[A] =
      if (lst1.isEmpty) lst2
      else foo(lst1, Nil, lst2)
    @scala.annotation.tailrec
    def foo(ys: List[A], aux1: List[A], aux2: List[A]): List[A] = ys match {
      case y1::y2::tl =>
        if(op.gt(y1,y2)) foo(y1::tl, y2::aux1, aux2)
        else foo(y2::tl, y1::aux1, aux2)
      case y::Nil => bar(aux1, y::aux2)
    }
    foo(xs, Nil, Nil)
  }


}