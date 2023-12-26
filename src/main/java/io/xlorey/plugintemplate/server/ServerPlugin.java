package io.xlorey.plugintemplate.server;

import io.xlorey.FluxLoader.plugin.Plugin;
import io.xlorey.FluxLoader.server.core.CommandsManager;

/**
 * Implementing a server plugin
 */
public class ServerPlugin extends Plugin {
    /**
     * Plugin entry point. Called when a plugin is loaded via FluxLoader.
     */
    @Override
    public void onInitialize() {
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
