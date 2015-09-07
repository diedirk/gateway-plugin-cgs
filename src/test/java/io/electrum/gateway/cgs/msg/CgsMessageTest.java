package io.electrum.gateway.cgs.msg;

import java.nio.ByteBuffer;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.electrum.sdk.msg.Message;
import io.electrum.sdk.msg.encoder.StringToByteArrayEncoder;
import io.electrum.sdk.msg.stream.StreamMessageEncoder;

public class CgsMessageTest {



   @Test
   public void deserialisePersonalChequeMessageTest() throws Exception {
      final StreamMessageEncoder<CgsVerifyPersonalChequeMessage> encoder = new StreamMessageEncoder<CgsVerifyPersonalChequeMessage>(CgsVerifyPersonalChequeMessage.class);
      
      String messageAsString =
            "2,theRequestId,theMerchantId,theTillId,theUserId,theUserType,theRequestType,theIdNumber,"
                  + "theAccountNumber,theClearingCode,theChequeNumber,theAmount,theDate,theContactNumber,theChequeReaderInstalled,theChequeReaderScanned";
      Message message = encoder.decode(ByteBuffer.wrap(StringToByteArrayEncoder.instance().encode(messageAsString)));

      Assert.assertEquals(message.getValue(CgsMessage.packetVersion), "2");
      Assert.assertEquals(message.getValue(CgsMessage.requestId), "theRequestId");
      Assert.assertEquals(message.getValue(CgsMessage.merchantId), "theMerchantId");
      Assert.assertEquals(message.getValue(CgsMessage.tillId), "theTillId");
      Assert.assertEquals(message.getValue(CgsMessage.userId), "theUserId");
      Assert.assertEquals(message.getValue(CgsMessage.userType), "theUserType");
      Assert.assertEquals(message.getValue(CgsMessage.requestType), "theRequestType");
      Assert.assertEquals(message.getValue(CgsMessage.idNumber), "theIdNumber");

      Assert.assertEquals(message.getValue(CgsMessage.accountNumber), "theAccountNumber");
      Assert.assertEquals(message.getValue(CgsMessage.bankClearingCode), "theClearingCode");
      Assert.assertEquals(message.getValue(CgsMessage.chequeNumber), "theChequeNumber");
      Assert.assertEquals(message.getValue(CgsMessage.amount), "theAmount");
      Assert.assertEquals(message.getValue(CgsMessage.date), "theDate");
      Assert.assertEquals(message.getValue(CgsMessage.contactNumber), "theContactNumber");
      Assert.assertEquals(message.getValue(CgsMessage.chequeReaderInstalled), "theChequeReaderInstalled");
      Assert.assertEquals(message.getValue(CgsMessage.chequeReaderScanned), "theChequeReaderScanned");
   }
   
   @Test
   public void deserialisePersonalChequeMessageOptionalFieldsNotSetTest() throws Exception {
      final StreamMessageEncoder<CgsVerifyPersonalChequeMessage> encoder = new StreamMessageEncoder<CgsVerifyPersonalChequeMessage>(CgsVerifyPersonalChequeMessage.class);
      
      String messageAsString =
            "2,theRequestId,theMerchantId,theTillId,,,theRequestType,theIdNumber,"
                  + "theAccountNumber,theClearingCode,theChequeNumber,theAmount,theDate,theContactNumber,theChequeReaderInstalled,theChequeReaderScanned";
      Message message = encoder.decode(ByteBuffer.wrap(StringToByteArrayEncoder.instance().encode(messageAsString)));

      Assert.assertEquals(message.getValue(CgsMessage.packetVersion), "2");
      Assert.assertEquals(message.getValue(CgsMessage.requestId), "theRequestId");
      Assert.assertEquals(message.getValue(CgsMessage.merchantId), "theMerchantId");
      Assert.assertEquals(message.getValue(CgsMessage.tillId), "theTillId");
      Assert.assertEquals(message.getValue(CgsMessage.userId),"");
      Assert.assertEquals(message.getValue(CgsMessage.userType),"");
      Assert.assertEquals(message.getValue(CgsMessage.requestType), "theRequestType");
      Assert.assertEquals(message.getValue(CgsMessage.idNumber), "theIdNumber");

      Assert.assertEquals(message.getValue(CgsMessage.accountNumber), "theAccountNumber");
      Assert.assertEquals(message.getValue(CgsMessage.bankClearingCode), "theClearingCode");
      Assert.assertEquals(message.getValue(CgsMessage.chequeNumber), "theChequeNumber");
      Assert.assertEquals(message.getValue(CgsMessage.amount), "theAmount");
      Assert.assertEquals(message.getValue(CgsMessage.date), "theDate");
      Assert.assertEquals(message.getValue(CgsMessage.contactNumber), "theContactNumber");
      Assert.assertEquals(message.getValue(CgsMessage.chequeReaderInstalled), "theChequeReaderInstalled");
      Assert.assertEquals(message.getValue(CgsMessage.chequeReaderScanned), "theChequeReaderScanned");
   }

   
   @Test
   public void deserialiseCompanyChequeMessageTest() throws Exception {
      final StreamMessageEncoder<CgsVerifyCompanyChequeMessage> encoder = new StreamMessageEncoder<CgsVerifyCompanyChequeMessage>(CgsVerifyCompanyChequeMessage.class);
      
      String messageAsString =
            "2,theRequestId,theMerchantId,theTillId,theUserId,theUserType,theRequestType,theIdNumber,theCompanyNumber,"
                  + "theAccountNumber,theClearingCode,theChequeNumber,theAmount,theDate,theContactNumber,theChequeReaderInstalled,theChequeReaderScanned";
      Message message = encoder.decode(ByteBuffer.wrap(StringToByteArrayEncoder.instance().encode(messageAsString)));

      Assert.assertEquals(message.getValue(CgsMessage.packetVersion), "2");
      Assert.assertEquals(message.getValue(CgsMessage.requestId), "theRequestId");
      Assert.assertEquals(message.getValue(CgsMessage.merchantId), "theMerchantId");
      Assert.assertEquals(message.getValue(CgsMessage.tillId), "theTillId");
      Assert.assertEquals(message.getValue(CgsMessage.userId), "theUserId");
      Assert.assertEquals(message.getValue(CgsMessage.userType), "theUserType");
      Assert.assertEquals(message.getValue(CgsMessage.requestType), "theRequestType");
      Assert.assertEquals(message.getValue(CgsMessage.idNumber), "theIdNumber");
      Assert.assertEquals(message.getValue(CgsMessage.companyNumber), "theCompanyNumber");

      Assert.assertEquals(message.getValue(CgsMessage.accountNumber), "theAccountNumber");
      Assert.assertEquals(message.getValue(CgsMessage.bankClearingCode), "theClearingCode");
      Assert.assertEquals(message.getValue(CgsMessage.chequeNumber), "theChequeNumber");
      Assert.assertEquals(message.getValue(CgsMessage.amount), "theAmount");
      Assert.assertEquals(message.getValue(CgsMessage.date), "theDate");
      Assert.assertEquals(message.getValue(CgsMessage.contactNumber), "theContactNumber");
      Assert.assertEquals(message.getValue(CgsMessage.chequeReaderInstalled), "theChequeReaderInstalled");
      Assert.assertEquals(message.getValue(CgsMessage.chequeReaderScanned), "theChequeReaderScanned");
   }
   
   
   @Test
   public void serialisePersonalChequeMessageTest() throws Exception {
      final StreamMessageEncoder<CgsMessage> encoder = new StreamMessageEncoder<CgsMessage>(CgsMessage.class);
      CgsMessage msg = new CgsVerifyPersonalChequeMessage();
      msg.putValue(CgsMessage.packetVersion, "2");
      msg.putValue(CgsMessage.requestId, "theRequestId");
      msg.putValue(CgsMessage.merchantId, "theMerchantId");
      msg.putValue(CgsMessage.tillId, "theTillId");
      msg.putValue(CgsMessage.userId, "theUserId");
      msg.putValue(CgsMessage.userType, "theUserType");
      msg.putValue(CgsMessage.requestType, "theRequestType");
      msg.putValue(CgsMessage.idNumber, "theIdNumber");

      msg.putValue(CgsMessage.accountNumber, "theAccountNumber");
      msg.putValue(CgsMessage.bankClearingCode, "theClearingCode");
      msg.putValue(CgsMessage.chequeNumber, "theChequeNumber");
      msg.putValue(CgsMessage.amount, "theAmount");
      msg.putValue(CgsMessage.date, "theDate");
      msg.putValue(CgsMessage.contactNumber, "theContactNumber");
      msg.putValue(CgsMessage.chequeReaderInstalled, "theChequeReaderInstalled");
      msg.putValue(CgsMessage.chequeReaderScanned, "theChequeReaderScanned");

      ByteBuffer encodedValue = encoder.encode(msg);
      String messageAsString = new String(encodedValue.array(), encodedValue.position(), encodedValue.limit());

      Assert.assertEquals(
            "2,theRequestId,theMerchantId,theTillId,theUserId,theUserType,theRequestType,theIdNumber,"
                  + "theAccountNumber,theClearingCode,theChequeNumber,theAmount,theDate,theContactNumber,theChequeReaderInstalled,theChequeReaderScanned",
            messageAsString);
   }
   
   @Test
   public void serialisePersonalChequeMessageOptionalFieldsNotSetTest() throws Exception {
      final StreamMessageEncoder<CgsMessage> encoder = new StreamMessageEncoder<CgsMessage>(CgsMessage.class);
      CgsMessage msg = new CgsVerifyPersonalChequeMessage();
      msg.putValue(CgsMessage.packetVersion, "2");
      msg.putValue(CgsMessage.requestId, "theRequestId");
      msg.putValue(CgsMessage.merchantId, "theMerchantId");
      msg.putValue(CgsMessage.tillId, "theTillId");
      msg.putValue(CgsMessage.requestType, "theRequestType");
      msg.putValue(CgsMessage.idNumber, "theIdNumber");

      msg.putValue(CgsMessage.accountNumber, "theAccountNumber");
      msg.putValue(CgsMessage.bankClearingCode, "theClearingCode");
      msg.putValue(CgsMessage.chequeNumber, "theChequeNumber");
      msg.putValue(CgsMessage.amount, "theAmount");
      msg.putValue(CgsMessage.date, "theDate");
      msg.putValue(CgsMessage.contactNumber, "theContactNumber");
      msg.putValue(CgsMessage.chequeReaderInstalled, "theChequeReaderInstalled");
      msg.putValue(CgsMessage.chequeReaderScanned, "theChequeReaderScanned");

      ByteBuffer encodedValue = encoder.encode(msg);
      String messageAsString = new String(encodedValue.array(), encodedValue.position(), encodedValue.limit());

      Assert.assertEquals(
            "2,theRequestId,theMerchantId,theTillId,,,theRequestType,theIdNumber,"
                  + "theAccountNumber,theClearingCode,theChequeNumber,theAmount,theDate,theContactNumber,theChequeReaderInstalled,theChequeReaderScanned",
            messageAsString);
   }

   @Test
   public void serialiseCompanyChequeMessageTest() throws Exception {
      final StreamMessageEncoder<CgsMessage> encoder = new StreamMessageEncoder<CgsMessage>(CgsMessage.class);
      CgsMessage msg = new CgsVerifyCompanyChequeMessage();
      msg.putValue(CgsMessage.packetVersion, "2");
      msg.putValue(CgsMessage.requestId, "theRequestId");
      msg.putValue(CgsMessage.merchantId, "theMerchantId");
      msg.putValue(CgsMessage.tillId, "theTillId");
      msg.putValue(CgsMessage.userId, "theUserId");
      msg.putValue(CgsMessage.userType, "theUserType");
      msg.putValue(CgsMessage.requestType, "theRequestType");
      msg.putValue(CgsMessage.idNumber, "theIdNumber");
      msg.putValue(CgsMessage.companyNumber, "theCompanyNumber");
      msg.putValue(CgsMessage.accountNumber, "theAccountNumber");
      msg.putValue(CgsMessage.bankClearingCode, "theClearingCode");
      msg.putValue(CgsMessage.chequeNumber, "theChequeNumber");
      msg.putValue(CgsMessage.amount, "theAmount");
      msg.putValue(CgsMessage.date, "theDate");
      msg.putValue(CgsMessage.contactNumber, "theContactNumber");
      msg.putValue(CgsMessage.chequeReaderInstalled, "theChequeReaderInstalled");
      msg.putValue(CgsMessage.chequeReaderScanned, "theChequeReaderScanned");

      ByteBuffer encodedValue = encoder.encode(msg);
      String messageAsString = new String(encodedValue.array(), encodedValue.position(), encodedValue.limit());

      Assert.assertEquals(
            "2,theRequestId,theMerchantId,theTillId,theUserId,theUserType,theRequestType,theIdNumber,theCompanyNumber,"
                  + "theAccountNumber,theClearingCode,theChequeNumber,theAmount,theDate,theContactNumber,theChequeReaderInstalled,theChequeReaderScanned",
            messageAsString);
   }

}
