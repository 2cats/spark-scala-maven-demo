package com.examples

import org.apache.spark.sql.SparkSession

object Main {

  case class Person(name: String, age: Int)

  def main(arg: Array[String]) {
    var spark_home = "/hd/app/spark"
    if (arg.length > 0) {
      spark_home = arg(0)
    }
    val spark = SparkSession.builder
      .master("local")
      .appName("Demo App")
      .getOrCreate()
    val df = spark.read.json(spark_home + "/examples/src/main/resources/people.json")
    df.show()
    spark.stop()
  }
}
