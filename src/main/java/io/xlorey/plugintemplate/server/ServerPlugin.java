package io.xlorey.plugintemplate.server;

import io.xlorey.fluxloader.enums.EventPriority;
import io.xlorey.fluxloader.plugin.Plugin;
import io.xlorey.fluxloader.server.core.CommandsManager;
import io.xlorey.fluxloader.shared.EventManager;

/**
 * Implementing a server plugin
 */
public class ServerPlugin extends Plugin {
    /**
     * Plugin entry point. Called when a plugin is loaded via FluxLoader.
     */
    @Override
    public void onInitialize() {
        EventManager.subscribe(new OnServerShutdownHandler(), EventPriority.HIGH);
        try {
            CommandsManager.addCommand(new ExampleCommands());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Executing the plugin
     */
    @Override
    public void onExecute() {

    }

    /**
     * Terminating the plugin
     */
    @Override
    public void onTerminate() {

    }
}
