package org.action.extractrestAPI;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;

public class SingletonClient {
	
	private static TransportClient client;

		   //create an object of SingleObject
	private SingletonClient()
	{
	Settings.Builder settings1 = Settings.settingsBuilder() 
            .put("cluster.name", "cluster2") 
            .put("node.name", "c2node1") 
            .put("network.host", "127.0.0.2") 
            .put("path.home", "C:\\Users\\shaskumar\\Downloads\\ES_demo\\c2\\node1\\elasticsearch-2.1.1")

            .put("path.logs", "C:\\Users\\shaskumar\\Downloads\\ES_demo\\c2\\node1\\elasticsearch-2.1.1\\logs")
            .put("node.data",true);
	   this.client = TransportClient.builder().settings(settings1).build();
	        
	
	
	}
            
  
	
	       
		   private static SingletonClient client1 = new SingletonClient();
		   
		   //make the constructor private so that this class cannot be
		   //instantiated
		   

		   //Get the only object available
		   public static SingletonClient getInstance(){
		      return client1;
		   }

		   
		   public TransportClient getClient()
		   {
			   return client;
		   }
		   public void connect(){
			   try {
				client.addTransportAddress((TransportAddress) new InetSocketTransportAddress(InetAddress.getByName("127.0.0.2"), 9300));
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		

}
