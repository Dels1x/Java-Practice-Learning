import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String [] args) {

        // bind an Action to a KeyStroke
        // don't require you to click a component to give it focus
        // all Swing components have ability to use KeyBindings
        // increased flexibility (гибкость) compared to KeyListeners
        // can assign key strokes to invidual Swing components
        // more difficult to utilize and set up

        new Game();

    }
}
