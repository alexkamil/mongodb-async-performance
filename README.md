[![Build Status](https://travis-ci.org/allanbank/mongodb-async-performance.svg?branch=master)](https://travis-ci.org/allanbank/mongodb-async-performance)
MongoDB Asynchronous Driver Performance Tools
=============================================

This project contains a collection of applications for testing the prformance of the 
MongoDB Asynchronous Java Driver.

Currently there are two test drivers provided:

* com.allanbank.mongodb.performance.BsonPerformanceITest
* com.allanbank.mongodb.performance.PerformanceITest

`BsonPerformanceITest` provides a driver for measuring the performance of the
drivers BSON encoding an decoding for various document sizes and complexity. Sample 
results are provided on the [driver's website][1].

`PerformanceITest` provides a driver for measurung the performance of the driver when performing
various read and write operations against a MongoDB server or cluster. Again sample results are 
provided on the [driver's website][2].

Both classes can be run via the command line or via JUnit.


[1]: http://www.allanbank.com/mongodb-async-driver/performance/bson_performance.html
[2]: http://www.allanbank.com/mongodb-async-driver/performance/performance.html
