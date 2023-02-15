import Board.Board;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Board b = new Board("/home/clement/IdeaProjects/GraphicAsynchronousYield/assets/map/world_1.json");
        System.out.println(b);
    }
}