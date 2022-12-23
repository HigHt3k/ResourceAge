package com.ecs.intent;

import com.Game;
import com.ecs.component.CollisionComponent;
import com.ecs.component.IntentComponent;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class StartIntent extends Intent {
    private int sceneId;

    public StartIntent(int sceneId) {
        this.sceneId = sceneId;
    }

    @Override
    public void handleIntent(KeyEvent e) {

    }

    @Override
    public void handleIntent(MouseEvent e) {
        IntentComponent ic = getIntentComponent();
        if(ic != null && ic.getEntity().getComponent(CollisionComponent.class) != null) {
            if(ic.getEntity().getComponent(CollisionComponent.class).contains(e.getPoint()) && e.getButton() == MouseEvent.BUTTON1) {
                Game.logger().info("Setting scene to: " + sceneId);
                Game.scene().setCurrentScene(sceneId);
            }
        }
    }
}
