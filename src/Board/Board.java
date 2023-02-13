package Board;

import Utils.Pos;

import java.util.ArrayList;

public class Board
{
    final public int height;
    final public int width;

    private final ArrayList<ArrayList<Cell>> board;

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
