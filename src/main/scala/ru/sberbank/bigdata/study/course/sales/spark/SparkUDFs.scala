package ru.sberbank.bigdata.study.course.sales.spark

import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.types.BooleanType

object SparkUDFs extends Serializable {
  // TODO add descriptions to method `coordinateNeighbours`
  /*
   *
   * */
  val coordinateNeighbours: (java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal) => Boolean =
    (latX, lonX, latY, lonY) => {
      latX.add(latY.negate).abs.compareTo(new java.math.BigDecimal(0.01)) <= 0.0 &&
        lonX.add(lonY.negate).abs.compareTo(new java.math.BigDecimal(0.01)) <= 0.0 &&
        latX.add(latY.negate).abs.add(lonX.add(lonY.negate).abs).compareTo(new java.math.BigDecimal(0.0)) > 0.0
    }

  val neighboursUDF: UserDefinedFunction = udf(coordinateNeighbours, BooleanType)
}
