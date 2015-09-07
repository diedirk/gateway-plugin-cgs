package io.electrum.gateway.cgs.msg;

import java.util.Set;

import io.electrum.sdk.msg.FieldDefinition;
import io.electrum.sdk.msg.Message;
import io.electrum.sdk.msg.encoder.StringEncoder;
import io.electrum.sdk.msg.pack.OneByteFieldSeparatorPacker;
import io.electrum.sdk.msg.pack.RemainderPacker;
import io.electrum.sdk.msg.stream.FieldId;

@SuppressWarnings("serial")
public abstract class CgsMessage extends Message {

   public CgsMessage(Set<FieldDefinition<?>> template) {
      super(template);
   }

   public static FieldDefinition<String> packetVersion =
         new FieldDefinition<String>(
               new FieldId(1, "packet version", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "2");

   public static FieldDefinition<String> requestId =
         new FieldDefinition<String>(
               new FieldId(2, "request ID", false),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance());

   public static FieldDefinition<String> merchantId =
         new FieldDefinition<String>(
               new FieldId(3, "merchant ID", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> tillId =
         new FieldDefinition<String>(
               new FieldId(4, "till ID", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> userId =
         new FieldDefinition<String>(
               new FieldId(5, "user ID", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> userType =
         new FieldDefinition<String>(
               new FieldId(6, "user type", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> requestType =
         new FieldDefinition<String>(
               new FieldId(7, "request type", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");
   
   public static FieldDefinition<String> responseType =
         new FieldDefinition<String>(
               new FieldId(8, "response type", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");
   
   public static FieldDefinition<String> authNumber =
         new FieldDefinition<String>(
               new FieldId(9, "auth number", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");
   
   public static FieldDefinition<String> responseMessage =
         new FieldDefinition<String>(
               new FieldId(9, "respose message", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> idNumber =
         new FieldDefinition<String>(
               new FieldId(8, "ID number", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> companyNumber =
         new FieldDefinition<String>(
               new FieldId(9, "companyNumber", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> accountNumber =
         new FieldDefinition<String>(
               new FieldId(10, "account number", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> bankClearingCode =
         new FieldDefinition<String>(
               new FieldId(11, "bank clearing code", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> chequeNumber =
         new FieldDefinition<String>(
               new FieldId(12, "cheque number", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> amount =
         new FieldDefinition<String>(
               new FieldId(13, "amount", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> date =
         new FieldDefinition<String>(
               new FieldId(14, "date", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> contactNumber =
         new FieldDefinition<String>(
               new FieldId(15, "contact number", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> chequeReaderInstalled =
         new FieldDefinition<String>(
               new FieldId(16, "cheque reader installed", true),
               new OneByteFieldSeparatorPacker((byte) 0x2C),
               StringEncoder.instance(),
               "");

   public static FieldDefinition<String> chequeReaderScanned =
         new FieldDefinition<String>(
               new FieldId(17, "cheque reader scanned", true),
               new RemainderPacker(),
               StringEncoder.instance(),
               "");
  
}
