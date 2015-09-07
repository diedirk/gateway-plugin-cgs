package io.electrum.gateway.cgs.msg;

import java.io.Serializable;
import java.nio.ByteBuffer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.electrum.gateway.msg.GatewayMessage;
import io.electrum.sdk.msg.stream.StreamMessageEncoder;
import io.electrum.sdk.util.Format;

public class CgsMessageAdapter extends GatewayMessage {

   private static final Logger logger = LoggerFactory.getLogger(CgsMessageAdapter.class);

   private final CgsMessage msg;

   public CgsMessageAdapter(CgsMessage msg) {
      if (msg == null) {
         throw new IllegalArgumentException("Cannot instantiate a CgsMessageAdapter with a null msg.");
      }

      this.msg = msg;
   }
   
   @Override
   public byte[] serialize() throws Exception {
      ByteBuffer buf = new StreamMessageEncoder<CgsMessage>(CgsMessage.class).encode(msg);
      return Format.byteRead(buf);
   }

   @Override
   public Serializable getMessageIdentifier() throws Exception {
      return msg.getValue(CgsMessage.requestId);
   }

   @Override
   public boolean isOnline() throws Exception {
      return true;
   }

   @Override
   public boolean isRequest() throws Exception {
      return false;
   }

   @Override
   public String getMessageDescription() {
      return null;
   }

   @Override
   public String toString() {
      return null;
   }

}
