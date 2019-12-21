package recfun

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
    * Exercise 1: Pascal's Triangle
    * https://en.wikipedia.org/wiki/Pascal%27s_triangle
    *
    * Assignment:
    * "Write a function that computes the elements of Pascal’s triangle by means of a recursive process.
    * Do this exercise by implementing the pascal function, which takes a column c and a row r,
    * counting from 0 and returns the number at that spot in the triangle.
    * For example, pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3."
    *
    * @param c  column index
    * @param r  row index
    * @return The number at a position identified by 'c' and 'r'
    */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)


  /**
    * Exercise 2: Parentheses Balancing
    *
    * Assignment:
    * "Write a recursive function which verifies the balancing of parentheses in a string, which we represent
    * as a List[Char] not a String.
    *
    * For example, the function should return true for the following strings:
    * > (if (zero? x) max (/ 1 x))
    * > I told him (that it’s not (yet) done). (But he wasn’t listening)
    *
    * The function should return false for the following strings:
    * > :-)
    * > ())(
    * The last example shows that it’s not enough to verify that a string contains the same number of opening
    * and closing parentheses."
    *
    * @param chars The validated string
    * @return true, if parentheses is balanced, false otherwise
    */
  def balance(chars: List[Char]): Boolean = {
    def score(chars: List[Char], acc: Int = 0): Int =
      if (chars.isEmpty || acc < 0)
        acc
      else {
        val c = chars.head
        score(chars.tail, if (c == '(') acc + 1 else if (c == ')') acc - 1 else acc)
      }
    score(chars) == 0
  }

  /**
    * Exercise 3: Counting Change
    *
    * See Tree Recursion, Counting change example published by MIT:
    * https://mitpress.mit.edu/sicp/full-text/book/book-Z-H-11.html#%_sec_1.2.2
    *
    * Assignment:
    * "Write a recursive function that counts how many different ways you can make change for an amount, given
    * a list of coin denominations.
    *
    * For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:
    * 1+1+1+1, 1+1+2, 2+2.
    *
    * Hint: Think of the degenerate cases.
    * > How many ways can you give change for 0 CHF(swiss money)?
    * > How many ways can you give change for >0 CHF, if you have no coins?"
    *
    * @param money An amount to change
    * @param coins A list of unique denominations for the coins
    * @return The total number of change combinations
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeCombinations(money: Int, coins: List[Int]): Int =
      if (money == 0)
        1
      else if (money < 0 || coins.isEmpty)
        0
      else
        // total combinations = using the first coin only + using all other coins
        countChangeCombinations(money - coins.head, coins) + countChangeCombinations(money, coins.tail)

    countChangeCombinations(money, coins)
  }
}