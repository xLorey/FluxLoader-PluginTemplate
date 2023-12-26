package io.xlorey.plugintemplate.client;

import imgui.ImGui;
import imgui.type.ImString;
import io.xlorey.FluxLoader.interfaces.IControlsWidget;

/**
 * Class for creating plugin controls
 */
public class Controls implements IControlsWidget {
    /**
     * Rendering controls using ImGui
     */
    @Override
    public void render() {
        ImGui.beginChild("#Controls", -1, 120);

        ImGui.button("Hello");

        ImGui.inputText("Example", new ImString());

        ImGui.endChild();
    }
}
