package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) throw new Exception("c or r is out of range")
    else{
      if (c == 0 || c == r) 1 
      else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceRec(chars: List[Char], count: Int): Boolean ={
      if (chars.isEmpty){
        if (count == 0) true
        else false
      }
      else {
        if (chars.head == '(')  balanceRec(chars.tail, count+1)
        else if (chars.head == ')')  {
          if (count < 1)  false
          else balanceRec(chars.tail, count-1)
        }
        else balanceRec(chars.tail, count)
      }
    }
    balanceRec(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    money
  }
}
