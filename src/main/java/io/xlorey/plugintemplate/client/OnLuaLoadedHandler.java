package io.xlorey.plugintemplate.client;

import io.xlorey.fluxloader.events.OnLuaFilesLoaded;
import io.xlorey.fluxloader.shared.LuaManager;
import io.xlorey.fluxloader.utils.Logger;

import java.nio.file.Path;

/**
 * Plugin group load event
 */
public class OnLuaLoadedHandler extends OnLuaFilesLoaded {
    @Override
    public void handleEvent(String groupName) {
        if (!groupName.equalsIgnoreCase("client")) return;

        Logger.print("~ Start single lua example ~");
        // test2.lua has a require, but the folder in which it is located is not added to the list of active ones
        Path testLua = ClientPlugin.instance.getMetadata().getLuaFolder().resolve("test2.lua");
        // Therefore we add
        LuaManager.addLuaActiveFolder(ClientPlugin.instance.getMetadata().getLuaFolder().toFile());
        LuaManager.runLua(testLua.toAbsolutePath().toString(), true);
        Logger.print("~ End single lua example ~");

        Logger.print("~ Start lua folder example ~");
        ClientPlugin.instance.loadLua();
        Logger.print("~ End lua folder example ~");
    }
}
