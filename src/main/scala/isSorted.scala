object isSorted {
  def apply[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    sortedSeq.sliding(2).forall {
      case Seq(x, y) => ordered(x, y)
      case Seq(x) => true
    }
  }
}