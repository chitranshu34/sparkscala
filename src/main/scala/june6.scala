import scala.io.StdIn
object june6 {

  def main(args: Array[String]): Unit = {
  println("please enter any integer number")
    val a = StdIn.readLine()
    val n = a.toInt

    if( n > 0 && !(n % 3 ==0)){
      println("Given number is positive and not divisible by 3 ")
    }
    else{
      println("Either given number is negative or divisible by 3")
    }
  }
}