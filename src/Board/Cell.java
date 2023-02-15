package Board;

import java.util.HashMap;
import java.util.Map;
import Enums.CellType;
import Utils.ConsoleColor;

public class Cell
{
    public Map<String, Object> properties;
    final CellType type;

    public Cell(){
        this.properties = new HashMap<String, Object>();
        this.type = CellType.GROUND;
    }
    public Cell(Map<String, Object> properties, CellType type)
    {
        this.properties = properties;
        this.type = type;
    }

    @Override
    public String toString()
    {
        if(this.properties.containsKey("player") && (boolean) this.properties.get("player"))
        {
            System.out.println("test");
            return ConsoleColor.ANSI_CYAN + "+" + ConsoleColor.ANSI_RESET;
        }
        switch(this.type)
        {
            case GROUND: return ConsoleColor.ANSI_GREEN + "■" + ConsoleColor.ANSI_RESET;
            case WALL: return ConsoleColor.ANSI_BLACK + "≡" + ConsoleColor.ANSI_RESET;
            case DOOR: return ConsoleColor.ANSI_RED + "x" + ConsoleColor.ANSI_RESET;
        }

        return "V";
    }
}
