package io.electrum.gateway.cgs.msg;

import java.util.HashSet;
import java.util.Set;

import io.electrum.sdk.msg.FieldDefinition;

@SuppressWarnings("serial")
public class CgsVerifyCompanyChequeMessage extends CgsMessage {

   public CgsVerifyCompanyChequeMessage() {
      super(template);
   }
   
   @Override
   public String describeMessage() {
      return "CGS verify company cheque";
   }


   public static Set<FieldDefinition<?>> template = new HashSet<FieldDefinition<?>>();

   static {
      template.add(packetVersion);
      template.add(requestId);
      template.add(merchantId);
      template.add(tillId);
      template.add(userId);
      template.add(userType);
      template.add(requestType);
      template.add(tillId);
      template.add(idNumber);
      template.add(companyNumber);
      template.add(accountNumber);
      template.add(bankClearingCode);
      template.add(chequeNumber);
      template.add(amount);
      template.add(date);
      template.add(contactNumber);
      template.add(chequeReaderInstalled);
      template.add(chequeReaderScanned);
   }

}
