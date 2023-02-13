package GameObject.Entity;

import java.util.HashMap;
import java.util.Map;

public abstract class Entity
{
    public Map<String, Object> properties = new HashMap<String, Object>();

    private final String id;

    public Entity(Map<String, Object> properties, String id)
    {
        this.properties = properties;
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
}


