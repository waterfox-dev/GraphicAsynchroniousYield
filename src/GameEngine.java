import Board.Board;
import GameObject.Entity.Entity;
import Utils.Pos;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameEngine{

    protected Board map;

    private final Map<Pos, ArrayList<Entity>> entityList;

    public GameEngine(String filename) throws IOException, ParseException {
        this.map = new Board(filename);
        this.entityList = new HashMap<>();
    }

    public void addEntity(Entity e) {
        if(this.entityList.containsKey(e.pos)) {
            this.entityList.get(e.pos).add(e);
        }else{
            ArrayList<Entity> temp = new ArrayList<>();
            temp.add(e);
            this.entityList.put(e.pos, temp);
        }
    }

    public Map<Pos, ArrayList<Entity>> getEntityList() {
        return entityList;
    }


}
