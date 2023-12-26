package io.xlorey.plugintemplate.client;

import io.xlorey.FluxLoader.plugin.Configuration;
import io.xlorey.FluxLoader.plugin.Plugin;
import io.xlorey.FluxLoader.shared.EventManager;

/**
 * Implementing a client plugin
 */
public class ClientPlugin extends Plugin {
    /**
     * Example of a custom configuration file
     */
    private Configuration exampleCopy;
    /**
     * Example of a custom configuration file
     */
    private Configuration exampleCreate;
    /**
     * Main widget
     */
    private MainWidget mainWidget;

    /**
     * Plugin entry point. Called when a plugin is loaded via FluxLoader.
     */
    @Override
    public void onInitialize() {
        exampleCopy = new Configuration(getConfigPath("example.yml"), this);
        exampleCreate = new Configuration(getConfigPath("exampleOther.yml"), this);

        exampleCopy.copyOrLoadConfig();
        exampleCreate.create();

        saveDefaultConfig();

        exampleCreate.setString("newStringKey", "Hello World!");
        exampleCreate.setString("newStringKey.nested", "Hello World nested!");

        exampleCreate.save();

        String defaultConfigText = getConfig().getString("message");

        EventManager.subscribe(new EventHandler());
        mainWidget = new MainWidget();
    }

    /**
     * Executing the plugin
     */
    @Override
    public void onExecute() {
        EventManager.invokeSingleEventAndReturn("pt-log");
        mainWidget.addToScreenDraw();
    }

    /**
     * Terminating the plugin
     */
    @Override
    public void onTerminate() {
        mainWidget.removeFromScreenDraw();
    }
}
