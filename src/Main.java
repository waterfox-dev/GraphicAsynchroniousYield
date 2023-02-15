import Board.Board;
import Enums.Direction;
import GameObject.Entity.Entity;
import GameObject.Entity.MovingEntity;
import Utils.Pos;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        GameEngine game = new GameEngine("assets/map/world_1.json");
        MovingEntity player = new MovingEntity("player", new Pos(1,1));
        game.addEntity(player);
        game.render();
        System.out.println(game.map);
        player.Move(Direction.SOUTH, 1);
        game.render();
        System.out.println(game.map);

    }
}