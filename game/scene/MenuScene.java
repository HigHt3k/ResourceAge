package game.scene;

import com.ecs.component.IntentComponent;
import com.ecs.intent.ExitIntent;
import com.ecs.intent.StartIntent;
import com.graphics.scene.Scene;
import game.entities.gui.button.GUIButton;

public class MenuScene extends Scene {
    public MenuScene(String name, int id) {
        super(name, id);

        // create the scene
        GUIButton start = new GUIButton("New Game", 800, 400, 200, 100);
        StartIntent si = new StartIntent(1);
        si.setIntentComponent(start.getComponent(IntentComponent.class));
        start.getComponent(IntentComponent.class).addIntent(si);
        addEntityToScene(start);

        GUIButton settings = new GUIButton("Settings", 800, 550, 200, 100);
        //TODO: Add functionality
        addEntityToScene(settings);

        GUIButton exit = new GUIButton("Exit", 1200, 700, 200, 100);
        ExitIntent ei = new ExitIntent();
        ei.setIntentComponent(exit.getComponent(IntentComponent.class));
        exit.getComponent(IntentComponent.class).addIntent(ei);
        addEntityToScene(exit);
    }

    @Override
    public void update() {

    }
}
