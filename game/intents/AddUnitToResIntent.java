package game.intents;

import com.ecs.component.CollisionComponent;
import com.ecs.component.GraphicsComponent;
import com.ecs.component.IntentComponent;
import com.ecs.intent.Intent;
import game.components.Resource;
import game.components.UnitStack;
import game.entities.unit.UnitEntity;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class AddUnitToResIntent extends Intent {
    @Override
    public void handleIntent(KeyEvent e) {

    }

    @Override
    public void handleIntent(MouseEvent e) {
        IntentComponent ic = getIntentComponent();
        if(ic != null && ic.getEntity().getComponent(CollisionComponent.class) != null) {
            UnitStack us = ic.getEntity().getComponent(UnitStack.class);
            if(us == null) {
                return;
            }
            if(ic.getEntity().getComponent(CollisionComponent.class).contains(e.getPoint())) {
                if(e.getButton() == MouseEvent.BUTTON1) {
                    if(us.getConnectedHousing().getQuantity() > 0) {
                        us.quantityAdd(+1);
                        us.getConnectedHousing().quantityAdd(-1);
                    }
                } else if(e.getButton() == MouseEvent.BUTTON3) {
                    if(us.getQuantity() > 0) {
                        us.quantityAdd(-1);
                        us.getConnectedHousing().quantityAdd(+1);
                    }
                }
            }
        }
    }
}
