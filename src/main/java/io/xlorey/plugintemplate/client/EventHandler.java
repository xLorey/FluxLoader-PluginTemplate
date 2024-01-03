package io.xlorey.plugintemplate.client;

import io.xlorey.FluxLoader.annotations.SubscribeEvent;
import io.xlorey.FluxLoader.annotations.SubscribeSingleEvent;

/**
 * Custom and game event handler
 */
public class EventHandler {
    /**
     * Event handler that is called every tick
     */
    @SubscribeEvent(eventName = "OnTick")
    public void onTickHandler(){

    }

    /**
     * Event handler that is called when a key is pressed
     * @param keyID key ID LWJGL3
     */
    @SubscribeEvent(eventName = "OnCustomUIKey")
    public void onCustomUIKeyHandler(int keyID){

    }

    /**
     * Custom event for communication between plugins
     * @param text transmitted text
     */
    @SubscribeSingleEvent(eventName = "pt-log")
    public void customLogHandler(String text) {
        /**
         * implementation
         */
    }

    /**
     * Custom event for communication between plugins
     */
    @SubscribeSingleEvent(eventName = "pt-getText")
    public String customGetObjectHandler() {
        return "Example text";
    }
}
