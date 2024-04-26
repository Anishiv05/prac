object GenerateParentheses {
    def generateParenthesis(n: Int): List[String] = {
        val result = scala.collection.mutable.ListBuffer.empty[String]

        def backtrack(str: String, open: Int, close: Int): Unit = {
            if( (open == n) && (close == n)) // ans
                result += str
            if(open < n)
                backtrack(str + "(", open+1, close)
            if(close < open)
                backtrack(str + ")", open, close+1)
        }
        backtrack("",0,0)
        result.toList
    } 

  
  def main(args: Array[String]):Unit = {
    val n = 3
    val res = generateParenthesis(n)
    println(res);
  }
}
