import scala.io.StdIn
object june3 {

  def main(args: Array[String]): Unit = {
    println("enter price of products")
    val n = StdIn.readLine()
    val a = n.toInt
    println("price of product is " + a)

if ( a > 100){
  if( a > 150){
    println("person is eligible for discount")
  }
  else{
    println("person is eligible for free shipping")
  }

  }
else{
println("price is below INR 100 so no offer is applicable")}
  }
}