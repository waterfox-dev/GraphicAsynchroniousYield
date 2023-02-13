package GameObject.Entity;

import Utils.Pos;

import java.util.HashMap;
import java.util.Map;

public abstract class Entity
{
    public Map<String, Object> properties;
    public Pos pos;

    private final String id;

    public Entity(Map<String, Object> properties, String id, Pos pos)
    {
        this.properties = properties;
        this.id = id;
        this.pos = pos;
    }

    public String getId()
    {
        return id;
    }
}


