# Pentaho PI custom step in Java

## Requirements

* [JDK 8+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.6.0+](https://maven.apache.org/download.cgi)
* [Pentaho Data Integration 9.0+](https://www.hitachivantara.com/en-us/products/data-management-analytics/pentaho-platform.html)

## Running

### Check the correctness of the algorithm (optional)

1. Change directory:

   `cd <project directory>`
   
1. From the command line with Maven:

   `mvn clean package`

1. From the command line:

   `java -cp target/pentaho-custom-step.jar acme.CryptoUtils`

### Use transformation with custom step

1. Run *Pentaho Data Integration* (*Spoon*)

1. Open `tr_calculate_md5.ktr` transformation file

1. Run transformation

1. See output (*MD5* hash)
