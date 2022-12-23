package game.scene;

import com.Game;
import com.graphics.scene.Scene;
import game.entities.resource.Forest;
import game.entities.unit.Housing;

public class GameScene extends Scene {
    public GameScene(String name, int id) {
        super(name, id);

        Forest forest = new Forest("Forest 1", 500, 400, 250, 150);
        addEntityToScene(forest);

        Housing housing = new Housing("Housing 1", 800 , 400, 250, 150);
        addEntityToScene(housing);

    }

    @Override
    public void update() {

    }
}
