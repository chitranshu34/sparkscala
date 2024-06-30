import scala.io.StdIn
object june4 {

  def main(args: Array[String]): Unit = {
    println("enter three integral numbers")
    val a = StdIn.readLine()
    val b = StdIn.readLine()
    val c = StdIn.readLine()

    val d = a.toInt
    val e = b.toInt
    val f = c.toInt
    if ( d > e){
      if( d > f){
        println(" largest number is " + d)
      }
      else{
        println("largest number  " + f)
      }
    }
    else{
      if( e > f){
        if ( e > d){
          println("largest number  " + e)
        }
        else{
          println("largest number   " + d)
        }
      }

    }
  }
}

