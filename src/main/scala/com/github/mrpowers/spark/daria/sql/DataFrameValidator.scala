package com.github.mrpowers.spark.daria.sql

import org.apache.spark.sql._

trait DataFrameValidator {

  def validatePresenceOfColumns(df: DataFrame, requiredColNames: Seq[String]): Unit = {
    val c = new DataFrameColumnsChecker(df, requiredColNames)
    c.validatePresenceOfColumns()
  }

}
