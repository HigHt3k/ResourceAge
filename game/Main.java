package game;

import com.Game;
import game.scene.GameScene;
import game.scene.MenuScene;

public class Main {

    public static void main(String[] args) {
        // set game information
        Game.info().setTitle("Resource Age");
        Game.info().setAuthor("Johann Töpfer");
        Game.info().setDescription("An incremental game about resource management and building through the ages. Includes a tower defense" +
                "and fighting simulation.");
        Game.info().setVersion("SNAPSHOT-0.0.1");

        // Add scenes
        Game.scene().addScene(new MenuScene("Menu", 0));
        Game.scene().addScene(new GameScene("Main Panel", 1));

        // initialize game and set starting scene
        Game.init();
        Game.scene().setCurrentScene(0);

        // start game
        Game.start();
    }
}
