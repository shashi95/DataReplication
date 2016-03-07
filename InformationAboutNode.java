package org.action.extractrestAPI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.elasticsearch.Build;
import org.elasticsearch.Version;
import org.elasticsearch.action.admin.cluster.node.info.PluginsInfo;
import org.elasticsearch.action.support.replication.TransportReplicationAction;
import org.elasticsearch.client.Client;
import org.elasticsearch.cluster.node.DiscoveryNode;
import org.elasticsearch.common.Nullable;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.http.HttpInfo;
import org.elasticsearch.monitor.jvm.JvmInfo;
import org.elasticsearch.monitor.os.OsInfo;
import org.elasticsearch.monitor.process.ProcessInfo;
import org.elasticsearch.node.Node;
import org.elasticsearch.threadpool.ThreadPoolInfo;
import org.elasticsearch.transport.TransportInfo;

import com.google.common.collect.ImmutableMap;

public class InformationAboutNode {
	public Client client;
	public ImmutableMap<String, String> serviceAttributes;

    public Version version;
    public Build build;

    @Nullable
    public Settings settings;

    @Nullable
    public OsInfo os;

    @Nullable
    public ProcessInfo process;

    @Nullable
    public JvmInfo jvm;

    @Nullable
    public ThreadPoolInfo threadPool;

    @Nullable
    public TransportInfo transport;

    @Nullable
    public HttpInfo http;

    @Nullable
    public PluginsInfo plugins;

    public InformationAboutNode(Client client)
    {
    	this.client=client;
    }

    
    /**
     * System's hostname. <code>null</code> in case of UnknownHostException
     */
    @Nullable
   

    /**
     * The current ES version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * The build version of the node.
     */
    public Build getBuild() {
        return this.build;
    }

    /**
     * The service attributes of the node.
     */
    @Nullable
    public ImmutableMap<String, String> getServiceAttributes() {
        return this.serviceAttributes;
    }

    /**
     * The settings of the node.
     */
    @Nullable
    public Settings getSettings() {
        return this.settings;
    }

    /**
     * Operating System level information.
     */
    @Nullable
    public OsInfo getOs() {
        return this.os;
    }

    /**
     * Process level information.
     */
    @Nullable
    public ProcessInfo getProcess() {
        return process;
    }

    /**
     * JVM level information.
     */
    @Nullable
    public JvmInfo getJvm() {
        return jvm;
    }

    @Nullable
    public ThreadPoolInfo getThreadPool() {
        return this.threadPool;
    }

    @Nullable
    public TransportInfo getTransport() {
        return transport;
    }

    @Nullable
    public HttpInfo getHttp() {
        return http;
    }

    @Nullable
    public PluginsInfo getPlugins() {
        return this.plugins;
    }
	
	static Map<String,String> settingmap=new LinkedHashMap<String,String>();
	static Settings setting;
}
