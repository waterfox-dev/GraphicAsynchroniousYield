package GameObject.Entity;

import Enums.Direction;
import Utils.Pos;

import java.util.Map;

public class MovingEntity extends Entity
{

    public MovingEntity(Map<String, Object> properties, String id, Pos pos) {
        super(properties, id, pos);
    }

    public Pos Move(Direction dir, int range)
    {
        switch(dir)
        {
            case NORTH: this.pos.y -= range;
            case EAST: this.pos.x += range;
            case SOUTH: this.pos.y += range;
            case WEST: this.pos.x -= range;
        }

        return this.pos;
    }
}
