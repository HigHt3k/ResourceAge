package game.entities.resource;

import game.components.ResourceType;

public class Forest extends ResourceEntity {

    public Forest(String name, int x, int y, int width, int height) {
        super(name, ResourceType.Wood, 0.03, x, y, width, height);
    }
}
