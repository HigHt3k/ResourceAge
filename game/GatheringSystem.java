package game;

import com.Game;
import com.ecs.Entity;
import com.ecs.System;
import game.components.Resource;
import game.components.UnitStack;

public class GatheringSystem extends System {

    @Override
    public void update() {
        for(Entity e : Game.scene().current().getEntities()) {
            Resource res = e.getComponent(Resource.class);
            UnitStack us = e.getComponent(UnitStack.class);
            if(res != null && us != null) {
                res.quantityAdd(us.getQuantity());
                java.lang.System.out.println(res.getQuantity());
            }
        }
    }
}
