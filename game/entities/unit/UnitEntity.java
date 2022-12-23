package game.entities.unit;

import com.ecs.Entity;
import com.ecs.component.CollisionComponent;
import com.ecs.component.GraphicsComponent;
import com.ecs.component.IntentComponent;
import com.ecs.intent.HoverIntent;
import com.util.IdGenerator;
import game.components.UnitStack;
import game.components.UnitType;

import java.awt.*;

public class UnitEntity extends Entity {
    private final Color FILL_COLOR = new Color(120, 200, 240, 255);
    private final Color HOVER_COLOR = new Color(60, 60, 60, 180);
    private final Color TEXT_COLOR = new Color(20, 20, 20, 255);

    public UnitEntity(String name, UnitType type, int x, int y, int width, int height) {
        super(name, IdGenerator.generateNextId());

        // Create Boundaries
        Rectangle r = new Rectangle(x, y, width, height);

        // Create Graphics Component
        GraphicsComponent gc = new GraphicsComponent();
        gc.setBounds(r);
        gc.setShape(r);
        gc.setFillColor(FILL_COLOR);
        gc.setHoverColor(HOVER_COLOR);
        gc.setTextColor(TEXT_COLOR);
        gc.setText(name);

        gc.setEntity(this);
        addComponent(gc);

        // Create Collision Detection
        CollisionComponent cc = new CollisionComponent();
        cc.setCollisionBox(r);

        cc.setEntity(this);
        addComponent(cc);

        // Create Intent Handling
        IntentComponent ic = new IntentComponent();
        HoverIntent hi = new HoverIntent();
        hi.setIntentComponent(ic);
        ic.addIntent(hi);
        ic.setEntity(this);
        addComponent(ic);

        // Create UnitStack Component
        UnitStack us = new UnitStack(name, type);
        us.setEntity(this);
        us.setQuantity(10);
        addComponent(us);

    }
}
