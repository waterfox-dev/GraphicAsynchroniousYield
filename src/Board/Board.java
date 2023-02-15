package Board;

import Enums.CellType;
import Utils.Pos;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Board
{
    final public int height;
    final public int width;

    public JSONObject cellType = new JSONObject();
    public JSONArray cellArray = new JSONArray();
    public ArrayList<JSONArray> widthDim = new ArrayList<>();

    private final ArrayList<ArrayList<Cell>> board;

    public Board(String filename) throws IOException, ParseException {

        Object f = new JSONParser().parse(new FileReader(filename));
        JSONObject json = (JSONObject) f;

        this.cellType = (JSONObject) json.get("cellTypeDefinitions");
        this.cellArray = (JSONArray) json.get("cellArray");
        this.widthDim = new ArrayList<>();

        for(Object obj : cellArray)
        {
            JSONArray ja = (JSONArray) obj;
            this.widthDim.add(ja);
        }

        this.height = this.cellArray.size();
        this.width = this.widthDim.get(0).size();

        this.board = new ArrayList<>();

        int range = 0;

        for (JSONArray jsonArray : this.widthDim) {

            this.board.add(new ArrayList<>());

            for (Object o : jsonArray) {
                Long i = (Long) o;
                String strEnum = (String) this.cellType.get(i.toString());
                Cell c = new Cell(new HashMap<>(), Enum.valueOf(CellType.class, strEnum));
                this.board.get(range).add(c);
            }
            range = range+1;
        }
    }

    public Board(int height, int width)
    {

        this.board = new ArrayList<>();
        this.height = height;
        this.width = width;


        for(int x=0; x<height+1; x++)
        {
            board.add(new ArrayList<>());
            for(int y=0; y<width+1; y++)
            {
                board.get(x).add(new Cell());
            }
        }
    }

    public Object getBoard() {
        return board;
    }

    public Cell getCell(Pos p)
    {
        return this.board.get(p.x).get(p.y);
    }

    public void setCell(Pos p, Cell c){
        this.board.get(p.x).set(p.y, c);
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        for(int x = 0; x<this.height; x++)
        {
            for(int y = 0; y<this.width; y++)
            {
                str.append(" ").append(this.board.get(x).get(y).toString()).append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }

}
