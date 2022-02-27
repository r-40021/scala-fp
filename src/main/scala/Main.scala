import scala.annotation.tailrec

case class Switch(isOn: Boolean)

object Main {
  @tailrec
  def series(n: Int, acc: Int): Int = {
    if (n == 0) {
      acc
    } else {
      series(n - 1, acc + n)
    }
  }

  @tailrec
  def fact(n: Int, acc: Int = 1): Int = {
    if (n <= 1){
      acc
    } else {
      fact(n - 1, acc * n)
    }
  }

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) {
      Switch(false)
    } else {
      Switch(true)
    }
  }

  def twice(f: Int => Int): Int => Int = {
    (n) => f(f(n))
  }
}
