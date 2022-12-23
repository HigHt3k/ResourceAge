package game.entities.unit;

import game.components.UnitType;

public class Housing extends UnitEntity {

    public Housing(String name, int x, int y, int width, int height) {
        super(name, UnitType.Worker, x, y, width, height);
    }
}
