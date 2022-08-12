object Search {
  def apply[A](seq: Seq[A])(f: A => Boolean) = {
    def searchRec(i: Int): Boolean = {
      if (seq.length == i) false
      else if (f(seq(i))) true
      else searchRec(i + 1)
    }
    searchRec(0)
  }
}
