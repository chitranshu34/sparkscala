import scala.io.StdIn
object june5 {

  def main(args: Array[String]): Unit = {
println("enter the age")
    val n = StdIn.readLine()
    val age = n.toInt


    if ( age >= 65){
      println("Whether the new customer or old? (new or old): ")
      val a = StdIn.readLine()
      val status =  a.toLowerCase()
      if( status == "old"){
        println("congratulations! you are eligible for discount")
      }
      else{
        println("Sorry! you are not eligible for discount")
      }

    }
    else{
      println("sorry ! you are not eligible for discount")
    }
  }

}
