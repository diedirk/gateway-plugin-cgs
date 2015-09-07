package io.electrum.gateway.cgs.sinknode;

import io.electrum.gateway.msg.postbridge.PostBridgeMessageAdapter;
import io.electrum.gateway.node.LeafNode;
import io.electrum.gateway.node.MessageHandlerFactory;
import io.electrum.gateway.node.Node;
import io.electrum.gateway.node.NodeConfig;

public class CgsClient extends LeafNode<PostBridgeMessageAdapter> {

   public CgsClient(NodeConfig config, Node<?, PostBridgeMessageAdapter> parent) throws Exception {
      super(config, parent);
   }

   @Override
   public void processParentDisconnected() throws Exception {
   }

   @Override
   public void processParentConnected() throws Exception {
   }

   @Override
   public MessageHandlerFactory<PostBridgeMessageAdapter> getMessageFromParentHandlerFactory() {
      return null;
   }
}
