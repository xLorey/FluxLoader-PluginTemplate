package io.xlorey.plugintemplate.client;

import io.xlorey.fluxloader.plugin.Configuration;
import io.xlorey.fluxloader.plugin.Plugin;
import io.xlorey.fluxloader.shared.EventManager;
import io.xlorey.fluxloader.shared.LuaManager;
import io.xlorey.fluxloader.shared.ServiceManager;
import io.xlorey.fluxloader.utils.Logger;

import java.nio.file.Path;
import java.nio.file.Paths;

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
     * Class Instance
     */
    public static ClientPlugin instance;

    /**
     * Plugin entry point. Called when a plugin is loaded via FluxLoader.
     */
    @Override
    public void onInitialize() {
        instance = this;

        EventManager.subscribe(new OnLuaLoadedHandler());

        exampleCopy = new Configuration(getConfigPath("example.yml"), this);
        exampleCreate = new Configuration(getConfigPath("exampleOther.yml"), this);

        exampleCopy.load();
        exampleCreate.load();

        saveDefaultConfig();

        exampleCreate.setString("newStringKey", "Hello World!");
        exampleCreate.setString("newStringKey.nested", "Hello World nested!");

        exampleCreate.save();

        String defaultConfigText = getConfig().getString("message");

        ServiceManager.register(IExample.class, new ExampleImpl());

        mainWidget = new MainWidget();

        Logger.print("~ Start translation example ~");
        Logger.print(ClientPlugin.instance.getTranslate("hello"));
        Logger.print(ClientPlugin.instance.getTranslate("test.hello"));
        Logger.print(ClientPlugin.instance.getTranslate("test.unknown"));
        Logger.print(ClientPlugin.instance.getTranslate("unknown"));
        Logger.print("~ End translation example ~");
    }

    /**
     * Executing the plugin
     */
    @Override
    public void onExecute() {
        mainWidget.addToScreen();
    }

    /**
     * Terminating the plugin
     */
    @Override
    public void onTerminate() {
        mainWidget.removeFromScreen();
    }
}
