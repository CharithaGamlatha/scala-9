object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    // Check if an argument is provided
    if (args.isEmpty) {
      println("Please provide an integer input.")
    } else {
      // Convert the command line argument to an integer
      val input = args(0).toInt

      // Lambda function for pattern matching
      val checkNumber: Int => String = (n: Int) => n match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }

      // Print the result of the pattern matching
      println(checkNumber(input))
    }
  }
}
