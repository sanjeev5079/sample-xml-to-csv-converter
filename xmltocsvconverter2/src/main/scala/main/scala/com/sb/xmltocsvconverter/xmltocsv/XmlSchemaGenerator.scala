package main.scala.com.sb.xmltocsvconverter.xmltocsv

import org.apache.spark.sql.types.{ DateType, LongType, DataTypes, DoubleType, DecimalType, StringType, IntegerType, TimestampType, BooleanType, StructType, StructField }

class XmlSchemaGenerator {
    def customSchema: StructType = {

    val customSchema = new StructType()
      .add(
        "C0",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C1",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C2",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C3",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C4",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C5",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C6",
        new StructType()
          .add("_VALUE", IntegerType, true) 
          .add("_nil", BooleanType, true))
      .add(
        "C7",
        new StructType()
          .add("_VALUE", IntegerType, true) 
          .add("_nil", BooleanType, true))
      .add(
        "C8",
        new StructType()
          .add("_VALUE", IntegerType, true) 
          .add("_nil", BooleanType, true))
      .add(
        "C9",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C10",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C11",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C12",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C13",
        new StructType()
          .add("_VALUE", StringType, true)
          .add("_nil", BooleanType, true))
      .add(
        "C14",
        new StructType()
          .add("_VALUE", StringType, true) 
          .add("_nil", BooleanType, true))
      
    customSchema
  }

}