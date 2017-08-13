package com.streamsets.bijection

import java.nio.file.{Files, Paths}

import com.streamsets.bijection.avro.BijectionTest
import com.twitter.bijection._
import com.twitter.bijection.avro.GenericAvroCodecs
import org.apache.avro.generic.GenericRecord
import org.apache.avro.specific.SpecificData

object BijectionTestMain {
  def main(args: Array[String]): Unit = {
    val avroRecordBytes = Files.readAllBytes(Paths.get(getClass.getResource("/genericmsg.avro").toURI))
    val recordInjection: Injection[GenericRecord, Array[Byte]] = GenericAvroCodecs.toBinary(BijectionTest.SCHEMA$)
    val genericRecord: GenericRecord = recordInjection.invert(avroRecordBytes).get
    // This is the part you need to convert to a SpecificRecord
    val specificRecord = SpecificData.get.deepCopy(genericRecord.getSchema, genericRecord).asInstanceOf[BijectionTest]
    System.out.println("GenericRecord as SpecificRecord: " + specificRecord.toString)
  }

}
