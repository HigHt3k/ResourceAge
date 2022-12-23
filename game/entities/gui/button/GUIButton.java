package game.entities.gui.button;

import com.ecs.Entity;
import com.ecs.component.CollisionComponent;
import com.ecs.component.GraphicsComponent;
import com.ecs.component.IntentComponent;
import com.ecs.intent.HoverIntent;
import com.util.IdGenerator;

import java.awt.*;

public class GUIButton extends Entity {
    private final Color BORDER_COLOR = new Color(40, 40, 40, 255);
    private final Color FILL_COLOR = new Color(150, 150, 40, 255);
    private final Color HOVER_COLOR = new Color(60, 60, 60, 180);

    public GUIButton(String name, int x, int y, int width, int height) {
        super(name, IdGenerator.generateNextId());

        // define the button size
        Rectangle r = new Rectangle(x, y, width, height);

        // Create graphics component
        GraphicsComponent gc = new GraphicsComponent();
        gc.setBounds(r);
        gc.setShape(r);
        gc.setBorderColor(BORDER_COLOR);
        gc.setFillColor(FILL_COLOR);
        gc.setHoverColor(HOVER_COLOR);
        gc.setText(name);

        gc.setEntity(this);
        addComponent(gc);

        // Create Collision box
        CollisionComponent cc = new CollisionComponent();
        cc.setCollisionBox(r);

        cc.setEntity(this);
        addComponent(cc);

        // Create Intent Component
        IntentComponent ic = new IntentComponent();
        // create intents
        HoverIntent hi = new HoverIntent();
        hi.setIntentComponent(ic);
        ic.addIntent(hi);

        ic.setEntity(this);
        addComponent(ic);
    }
}
