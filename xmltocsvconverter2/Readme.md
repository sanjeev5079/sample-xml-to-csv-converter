Description: 
				Spark code to convert Simple XML to CSV format.

Inputs: 
				1. Input path - with XML file
        		2. Output path
        
Sample command:        
				spark-submit --class main.scala.com.sb.xmltocsvconverter.runner.XmltocsvRunner xmltocsvconverter-0.0.1-SNAPSHOT.jar D:\\testfolder\\xmltest.xml D:\\testfolder\\xmltocsvout\\xmltest.csv
				spark-submit --class main.scala.com.sb.xmltocsvconverter.runner.XmltocsvRunner xmltocsvconverter-0.0.1-SNAPSHOT-jar-with-dependencies.jar D:\\testfolder\\xmltest.xml D:\\testfolder\\xmltocsvout\\xmltest.csv