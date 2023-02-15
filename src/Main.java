import Board.Board;
import GameObject.Entity.Entity;
import GameObject.Entity.MovingEntity;
import Utils.Pos;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        GameEngine game = new GameEngine("assets/map/world_1.json");
        game.addEntity(new MovingEntity("player", new Pos(1,1)));
        game.render();
        System.out.println(game.map);
    }
}