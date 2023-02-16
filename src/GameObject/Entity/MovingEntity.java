package GameObject.Entity;

import Enums.Direction;
import Utils.Pos;

import java.util.HashMap;
import java.util.Map;

public class MovingEntity extends Entity
{

    public MovingEntity(Map<String, Object> properties, String id, Pos pos) {
        super(properties, id, pos);
    }

    public MovingEntity(String id, Pos pos){
        super(new HashMap<>(), id, pos);
    }

    public void Move(Direction dir, int range)
    {
        switch (dir) {
            case NORTH -> this.pos.x -= range;
            case EAST -> this.pos.y += range;
            case SOUTH -> this.pos.x += range;
            case WEST -> this.pos.y -= range;
        }
    }
}
