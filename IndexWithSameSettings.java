package org.action.extractrestAPI;

import java.io.IOException;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentFactory;

public class CreateIndexWithSameSettings {
	
	// create index if it doesn't already exist
	public CreateIndexWithSameSettings(Client client,String index,String no_of_primay,String no_of_replicas){
    if (!client.admin().indices().prepareExists(index).execute().actionGet().isExists()) {

    	CreateIndexRequestBuilder cirb = null;
		try {
			cirb = client.admin().indices().prepareCreate(index).setSource(XContentFactory.jsonBuilder()
				      .startObject()
				        .startObject("settings")
				          .field("number_of_shards", no_of_primay)
				          .field("number_of_replicas", no_of_replicas)
				        .endObject()
				      .endObject());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		  
    		  CreateIndexResponse response = cirb.execute().actionGet();
    		  if(response.isAcknowledged()) {
    		    System.out.println("Index created.");
    		  } else {
    		    System.err.println("Index creation failed.");
    		  }
    	
    	
    	
    	
        //final CreateIndexRequestBuilder createIndexRequestBuilder = client.admin().indices().prepareCreate(index);
     /*   if (settings != null) {
            //logger.debug("index settings are provided, will apply them {}", settings);
            createIndexRequestBuilder.setSettings(settings);
        } else {
           // logger.debug("no settings given for index '{}'",index);
        }
        
        
        if (mapping != null) {
           // logger.debug("mapping for type '{}' is provided, will apply {}", type, mapping);
            createIndexRequestBuilder.addMapping(type, mapping);
        } else {
            //logger.debug("no mapping given for type '{}', will apply default mapping",type);
            createIndexRequestBuilder.addMapping(type, getDefaultTypeMapping());
        }
        
        final CreateIndexResponse res = createIndexRequestBuilder.get();
        
        if (!res.isAcknowledged()) {
            throw new IOException("Could not create index " + index);
        }
        
        //IMAPImporter.waitForYellowCluster(client);
        
       // logger.info("Index {} created", index);    
        
    }   
    else {
        //logger.debug("Index {} already exists", index);
    }*/
    	}
    else
    	System.out.println("Already Exists !!");
	}
}

 


