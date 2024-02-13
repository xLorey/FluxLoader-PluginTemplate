package io.xlorey.plugintemplate.client;

import io.xlorey.fluxloader.utils.Logger;

/**
 * An example of implementing a service using an interface
 */
public class ExampleImpl implements IExample{
    @Override
    public int getInt() {
        return 111;
    }

    @Override
    public void sayHello(String text) {
        Logger.print("Hello " + text);
    }
}
