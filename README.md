# bijection-test

To execute the example simply run `sbt run`

Illustrated are the following:
1. Using Avro APIs to parse the bytes representing the Kafka message into a SpecificRecord
2. Using Bijection to parse the bytes representing the Kafka message into a GenericRecord and converting to a SpecificRecord
3. Using Bijection to parse the bytes representing the Kafka message directly into a SpecificRecord

The sample .avro file is a dump of a schema-less Kafka message payload produced by SDC.
It was captured by creating a pipeline that writes to Kafka in Avro format and a second pipeline that consumes from that
topic with Data Format set to Binary so that no parsing is performed and then written to Local FS with max records in file
set to 1 to capture a single message.
