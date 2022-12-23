package game.components;

import com.ecs.component.Component;

public class Resource extends Component {
    private String name;
    private ResourceType type;
    private double multiplier = 1;
    private double quantity = 0;


    public Resource(String name, ResourceType type, double multiplier) {
        this.name = name;
        this.type = type;
        this.multiplier = multiplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void quantityAdd(double delta) {
        this.quantity += (delta * multiplier);
    }

    @Override
    public void update() {

    }
}
