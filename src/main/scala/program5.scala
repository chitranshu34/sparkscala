import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{avg, col, count, max}

object program5 {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("spark-program")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    val scoreData = Seq(
      ("Alice", "Math", 80),
      ("Bob", "Math", 90),
      ("Alice", "Science", 70),
      ("Bob", "Science", 85),
      ("Alice", "English", 75),
      ("Bob", "English", 95)
    ).toDF("Student", "Subject", "Score")

    scoreData.show()

    val df2 = scoreData.groupBy("Subject").agg(avg("Score")).alias("average")
    df2.show()

    val df3 = scoreData.groupBy("Student").agg(max("Score")).alias("max score")
    df3.show()

   // scoreData.groupBy(col("Student")).agg(avg(col("Score")), max(col("Score"))).show()


  }
}
