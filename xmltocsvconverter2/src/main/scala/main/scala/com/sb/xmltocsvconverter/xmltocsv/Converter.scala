package main.scala.com.sb.xmltocsvconverter.xmltocsv

import org.apache.spark.sql.{ Column, SparkSession, SQLImplicits }
import org.apache.spark.sql.functions.{ col, column }
import com.databricks.spark.xml._
import org.apache.spark.sql.types.{ DateType, LongType, DataTypes, DoubleType, DecimalType, StringType, IntegerType, TimestampType, BooleanType, StructType, StructField }
//import org.apache.spark.sql.types._

object Converter {
   def main(args: Array[String]) = {

    val inputPath = args(0)
    val outputPath = args(1)
    
    val spark = SparkSession
      .builder()
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._

    val schema = new XmlSchemaGenerator

    val xmlDF = spark.sqlContext.read
      .format("com.databricks.spark.xml")
      .schema(schema.customSchema)
      .option("rowTag", "Complaints")
      //.load("D:\\testfolder\\xmltest.xml")
      .load(inputPath)
      
    xmlDF.show
    //xmlDF.printSchema
    /* def flattenSchema(schema: StructType, prefix: String = null): Array[Column] = {
    schema.fields.flatMap(f => {
      val colName = if (prefix == null) f.name else (prefix + "." + f.name)

      f.dataType match {
        case st: StructType => flattenSchema(st, colName)
        case _              => Array(col(colName))
      }
    })
  }

   xmlDF.select(flattenSchema(xmlDF.schema):_*).printSchema()*/

    val csvDF = xmlDF.select(
      "C1._VALUE",
      "C2._VALUE",
      "C3._VALUE",
      "C4._VALUE",
      "C5._VALUE",
      "C6._VALUE",
      "C7._VALUE",
      "C8._VALUE",
      "C9._VALUE",
      "C10._VALUE",
      "C11._VALUE",
      "C12._VALUE",
      "C13._VALUE",
      "C14._VALUE")

    val colNames = Seq("C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13", "C14")
    val renamedCsvDF = csvDF.toDF(colNames: _*)
    renamedCsvDF.show

    renamedCsvDF.write.format("com.databricks.spark.csv")
    //.save("D:\\testfolder\\xmltocsvout\\xmltest.csv")
    .save(outputPath)
  }
}