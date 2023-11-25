package io.xlorey.plugintemplate.client;

import io.xlorey.FluxLoader.annotations.SubscribeEvent;
import io.xlorey.FluxLoader.plugin.Plugin;
import io.xlorey.FluxLoader.utils.Logger;

/**
 * Implementing a client plugin
 */
public class ClientPlugin extends Plugin {
    /**
     * Plugin entry point. Called when a plugin is loaded via FluxLoader.
     */
    public void onInitialize() {
        Logger.print("Hello world in client!");
        Logger.print("Test info:" + getPluginInfo().getName());
    }

    /**
     * Example implementation of event subscription. Calls every frame and prints a message to the console
     */
    @SubscribeEvent(eventName = "OnRenderTick")
    public void renderHandler(){
        Logger.print("Render Tick");
    }
}
