object InterestCalculator {
  def main(args: Array[String]): Unit = {
    val depositAmount = 50000 // Example deposit amount
    val interest = calculateInterest(depositAmount)
    println(f"The interest on a deposit of Rs. $depositAmount is Rs. $interest%.2f")
  }

  // Function to calculate interest using pattern matching
  val calculateInterest: Double => Double = (deposit: Double) => deposit match {
    case d if d <= 20000    => d * 0.02
    case d if d <= 200000   => d * 0.04
    case d if d <= 2000000  => d * 0.035
    case d                  => d * 0.065
  }
}
