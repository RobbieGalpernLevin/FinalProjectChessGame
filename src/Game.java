import java.util.Arrays;
public class Game
{
    private String[][] boardArray;
    String piece;
    String square;
    int fromRow;
    int fromCol;
    int toRow;
    int toCol;

    public Game()
    {
        String[][] startingBoard =
                {{"BRL","BND","BBL","BQD","BKL","BBD","BNL","BRD"},
                 {"BPD","BPL","BPD","BPL","BPD","BPL","BPD","BPL"},
                 {"LSQ","DSQ","LSQ","DSQ","LSQ","DSQ","LSQ","DSQ"},
                 {"DSQ","LSQ","DSQ","LSQ","DSQ","LSQ","DSQ","LSQ"},
                 {"LSQ","DSQ","LSQ","DSQ","LSQ","DSQ","LSQ","DSQ"},
                 {"DSQ","LSQ","DSQ","LSQ","DSQ","LSQ","DSQ","LSQ"},
                 {"WPL","WPD","WPL","WPD","WPL","WPD","WPL","WPD"},
                 {"WRD","WNL","WBD","WQL","WKD","WBL","WND","WRL"}};
        boardArray = startingBoard;
        piece = "";
        fromRow = -1;
        fromCol = -1;
        toRow = -1;
        toCol = -1;

    }

    public String getPiece()
    {
        return piece;
    }

    public String getSquare()
    {
        return square;
    }

    public int getFromRow()
    {
        return fromRow;
    }

    public int getFromCol()
    {
        return fromCol;
    }

    public int getToRow()
    {
        return toRow;
    }

    public int getToCol()
    {
        return toCol;
    }
    public void setPiece(int r, int c)
    {
        piece = boardArray[r][c];
        fromRow = r;
        fromCol = c;
    }

    public void setSquare(int r, int c)
    {
        changeBoard(piece, r, c, fromRow, fromCol);
        fromRow = -1;
        fromCol = -1;
        piece = "";
        square = "";
    }

    private void changeBoard(String newStr, int toRow, int toCol, int fromRowL, int fromColL)
    {
        if(boardArray[toRow][toCol].substring(2).equals("D"))
        {
            boardArray[toRow][toCol] = newStr.substring(0, 2) + "D";
        }
        else
        {
            boardArray[toRow][toCol] = newStr.substring(0, 2) + "L";
        }
        if(boardArray[fromRow][fromCol].substring(2).equals("D"))
        {
            boardArray[fromRowL][fromColL] = "DSQ";
        }
        else
        {
            boardArray[fromRowL][fromColL] = "LSQ";
        }

    }
}
