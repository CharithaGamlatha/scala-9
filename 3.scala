object StringFormatter {
  // Method to convert a string to uppercase
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lowercase
  def toLower(str: String): String = str.toLowerCase

  // Method to format the name based on the provided formatting function
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    // Test inputs
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    // Applying the format to each name
    println(formatNames(name1)(toUpper)) // BENNY
    println(formatNames(name2)(name => toUpper(name.substring(0, 2)) + toLower(name.substring(2)))) // NIroshan
    println(formatNames(name3)(toLower)) // saman
    println(formatNames(name4)(name => toUpper(name.substring(0, 1)) + toLower(name.substring(1, 5)) + toUpper(name.substring(5)))) // KumarA
  }
}
