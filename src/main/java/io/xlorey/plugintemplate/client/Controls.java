package io.xlorey.plugintemplate.client;

import imgui.ImGui;
import imgui.type.ImString;
import io.xlorey.fluxloader.interfaces.IControlsWidget;

/**
 * Class for creating plugin controls
 */
public class Controls implements IControlsWidget {
    /**
     * Rendering controls using ImGui
     */
    @Override
    public void render(float panelWidth) {
        ImGui.beginChild("#Controls", -1, 120);

        ImGui.button("Hello", panelWidth - 10, 30);

        ImGui.inputText("Example", new ImString());

        ImGui.endChild();
    }
}
