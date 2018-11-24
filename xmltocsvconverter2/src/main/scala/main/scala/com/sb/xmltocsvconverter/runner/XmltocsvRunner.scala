package main.scala.com.sb.xmltocsvconverter.runner

import main.scala.com.sb.xmltocsvconverter.xmltocsv.Converter

object XmltocsvRunner {
    def main(args: Array[String]) = {

    
    
    if (args(0).isEmpty() || args(1).isEmpty())
    println("Either Input or Output Path is missing. Provide both Input and Output Paths.")
    
    if (args(0).nonEmpty && args(1).nonEmpty)
      Converter.main(args)
    
    
  }
}