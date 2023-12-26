package io.xlorey.plugintemplate.server;

import io.xlorey.FluxLoader.annotations.CommandAccessLevel;
import io.xlorey.FluxLoader.annotations.CommandChatReturn;
import io.xlorey.FluxLoader.annotations.CommandExecutionScope;
import io.xlorey.FluxLoader.annotations.CommandName;
import io.xlorey.FluxLoader.enums.AccessLevel;
import io.xlorey.FluxLoader.enums.CommandScope;
import io.xlorey.FluxLoader.interfaces.ICommand;
import zombie.core.raknet.UdpConnection;

/**
 * The class that implements the new command
 * Implementing classes must use the @CommandName annotation to specify the command name.
 * They may also use the @UserAccessLevel annotation to specify the required access level for the command.
 * The @CommandChatReturn annotation can be used to provide text that will be displayed in chat when the command is invoked.
 * The @CommandExecutionScope annotation should be used to define where the command is available (e.g., in chat, in console, or both).
 */
@CommandName(command = "Example")
@CommandAccessLevel(accessLevel = AccessLevel.ADMIN)
@CommandExecutionScope(scope = CommandScope.BOTH)
@CommandChatReturn(text = "The command was executed")
public class ExampleCommands implements ICommand {
    /**
     * Executing a command
     * @param udpConnection connection of the object that called the command. If the server - will be equal to null
     * @param strings passed arguments
     */
    @Override
    public void onInvoke(UdpConnection udpConnection, String[] strings) {

    }
}
