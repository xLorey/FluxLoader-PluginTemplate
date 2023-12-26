package io.xlorey.plugintemplate.client;

import imgui.ImGui;
import io.xlorey.FluxLoader.client.ui.ComponentWidget;

/**
 * Implementation of the child widget
 */
public class ChildWidget extends ComponentWidget {
    /**
     * Widget rendering
     */
    @Override
    public void render() {
        ImGui.button("Example Button", -1, 40);
    }
}
