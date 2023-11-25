package io.xlorey.plugintemplate.server;

import io.xlorey.FluxLoader.annotations.SubscribeEvent;
import io.xlorey.FluxLoader.plugin.Plugin;
import io.xlorey.FluxLoader.utils.Logger;

/**
 * Implementing a server plugin
 */
public class ServerPlugin extends Plugin {
    /**
     * Plugin entry point. Called when a plugin is loaded via FluxLoader.
     */
    public void onInitialize() {
        Logger.print("Hello world in server!");
        Logger.print("Test info: " + getPluginInfo().getName());
    }

    /**
     * Example implementation of event subscription. Called after the server is fully initialized
     */
    @SubscribeEvent(eventName="onServerInitialize")
    public void onServerInitializeHandler(String[] serverStartupArgs){
        Logger.print("Server is initialized!");
    }
}
