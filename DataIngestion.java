package org.action.extractrestAPI;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.replication.TransportReplicationAction;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.node.Node;

import static org.elasticsearch.common.xcontent.XContentFactory.*;

import java.io.IOException;
import java.util.Date;

import copydir.WriteToFile;

public class DataIngestion {
	//static InformationAboutNode info;
	//static Node node;       //details of the node which is provided to me 
	Client client;
	
	//static GetRestAPICommand command;
	public DataIngestion(Client client)
	{
		this.client=client;
		
	}
	/*String index="library1";//restapi.getIndex();
	String type="mylibrary1";//restapi.getType();
	String id="1";//restapi.getId();  */
	public void ingestData(String json,String index,String type,String id) throws IOException{
	
		/*if(command.getMethod()=="GET")
		{
			WriteToFile writetofile=new WriteToFile(command.getcommand(),"C:\\Users\\shaskumar\\Downloads\\commandfile.txt");
			
		}
		
		XContentBuilder builder = jsonBuilder()
			    .startObject()
			        .field("user", "yo boy!")
			        .field("postDate", new Date())
			        .field("message", "check it")
			    .endObject();
		
		//String json=builder.string();
		
	/*	IndexResponse response = info.client.prepareIndex(command.getIndex(), command.getType(), command.getId())
		        .setSource(json)
		        .get();  */
		/*GetRestAPICommand restapi=new GetRestAPICommand();  */
		
		IndexResponse response = client.prepareIndex(index, type, id)
		        .setSource(json)
		        .get();
		
		String _index = response.getIndex();
		
		String _type = response.getType();
		
		String _id = response.getId();
		
		long _version = response.getVersion();
		
		boolean created = response.isCreated();
		
		System.out.println(_index+" "+_type+" "+_id+" "+_version+" "+created);
		
	}
	
	
	 
    

}
