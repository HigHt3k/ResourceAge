package game.components;

import com.ecs.component.Component;

public class UnitStack extends Component {
    private String name;
    private UnitType type;
    private long quantity = 0;

    private UnitStack connectedHousing = null;


    public UnitStack(String name, UnitType type) {
        this.name = name;
        this.type = type;
    }

    public void connectToHousing(UnitStack connectedHousing) {
        this.connectedHousing = connectedHousing;
    }

    public UnitStack getConnectedHousing() {
        return connectedHousing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitType getType() {
        return type;
    }

    public void setType(UnitType type) {
        this.type = type;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void quantityAdd(long delta) {
        this.quantity += delta;
    }

    @Override
    public void update() {

    }
}
