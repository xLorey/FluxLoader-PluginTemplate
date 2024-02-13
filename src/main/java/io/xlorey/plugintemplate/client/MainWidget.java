package io.xlorey.plugintemplate.client;

import imgui.ImGui;
import imgui.flag.ImGuiWindowFlags;
import io.xlorey.fluxloader.client.ui.Widget;

/**
 * Implementation of the main widget
 */
public class MainWidget extends Widget {
    /**
     * Update window state
     */
    @Override
    public void update() {
        super.update();
    }

    /**
     * Widget rendering
     */
    @Override
    public void render() {
        ImGui.setNextWindowSize(650, 400);

        ImGui.begin("Example Widget", ImGuiWindowFlags.NoResize | ImGuiWindowFlags.NoCollapse);

        captureMouseFocus();

        ImGui.end();
    }
}
