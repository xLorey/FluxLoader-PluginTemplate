package io.xlorey.plugintemplate.client;

import imgui.ImGui;
import imgui.flag.ImGuiWindowFlags;
import io.xlorey.FluxLoader.client.ui.ScreenWidget;
import zombie.GameWindow;
import zombie.gameStates.MainScreenState;

/**
 * Implementation of the main widget
 */
public class MainWidget extends ScreenWidget {
    /**
     * Child widget component
     */
    private final ChildWidget childWidget;

    /**
     * Initializing the main widget
     */
    public MainWidget() {
        childWidget = new ChildWidget();
        addChild(childWidget);
    }

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

        childWidget.render();

        ImGui.end();
    }
}
