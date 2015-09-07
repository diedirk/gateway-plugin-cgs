package io.electrum.gateway.cgs.msg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.electrum.gateway.msg.GatewayMessageFactory;

public class CgsMessageAdapterFactory implements GatewayMessageFactory<CgsMessageAdapter>{
   private static final Logger logger = LoggerFactory.getLogger(CgsMessageAdapterFactory.class);

   @Override
   public CgsMessageAdapter deserialize(byte[] msg) throws Exception {
      
      
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public CgsMessageAdapter newEchoRequest() throws Exception {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public CgsMessageAdapter newEchoResponse(CgsMessageAdapter echoRequest) throws Exception {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Iterable<String> getPerfStatsTags() {
      // TODO Auto-generated method stub
      return null;
   }
}
