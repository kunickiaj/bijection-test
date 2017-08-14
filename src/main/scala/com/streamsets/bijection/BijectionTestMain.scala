package com.streamsets.bijection

import java.io.{ByteArrayInputStream, File}
import java.nio.file.{Files, Paths}

import com.streamsets.bijection.avro.BijectionTest
import com.twitter.bijection._
import com.twitter.bijection.avro.{GenericAvroCodecs, SpecificAvroCodecs}
import org.apache.avro.file.{DataFileReader, SeekableFileInput, SeekableInput}
import org.apache.avro.generic.GenericRecord
import org.apache.avro.io.DecoderFactory
import org.apache.avro.specific.{SpecificData, SpecificDatumReader}

object BijectionTestMain {
  def main(args: Array[String]): Unit = {
    // Read dumped Kafka message into byte array -- it does not contain a schema
    val avroRecordBytes = Files.readAllBytes(Paths.get(getClass.getResource("/genericmsg.avro").toURI))

    // Example of reading the message directly into a SpecificRecord using Avro APIs
    val datumReader = new SpecificDatumReader[BijectionTest](classOf[BijectionTest])

    val decoder = DecoderFactory.get.binaryDecoder(new ByteArrayInputStream(avroRecordBytes), null)
    val readDirectlyAsSpecific = datumReader.read(null, decoder)
    System.out.println("SpecificRecord using Avro API: " + readDirectlyAsSpecific.toString)

    // Example of reading the message using Bijection + GenericRecord and then converting to SpecificRecord
    val recordInjection: Injection[GenericRecord, Array[Byte]] = GenericAvroCodecs.toBinary(BijectionTest.SCHEMA$)
    val genericRecord: GenericRecord = recordInjection.invert(avroRecordBytes).get
    // This is the part you need to convert to a SpecificRecord
    val convertedFromGeneric = SpecificData.get.deepCopy(genericRecord.getSchema, genericRecord).asInstanceOf[BijectionTest]
    System.out.println("GenericRecord to SpecificRecord: " + convertedFromGeneric.toString)

    // Example of reading the message using Bijection directly into a SpecificRecord
    val specificInjection: Injection[BijectionTest, Array[Byte]] = SpecificAvroCodecs.toBinary[BijectionTest](BijectionTest.SCHEMA$)
    val specificDirect: BijectionTest = specificInjection.invert(avroRecordBytes).get
    System.out.println("SpecificRecord using Bijection: " + specificDirect.toString)
  }

}
