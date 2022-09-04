package edu.iannotjf.Assign07;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;

public class TreasureMap extends CharImage{
    private int CurrentRow;
    private int CurrentCol;
   
    public TreasureMap(int rowCnt, int colCnt, char fillChar) {
        super(rowCnt, colCnt, fillChar);
    }

    public void clear(){
        super.clear();
        CurrentCol = 0;
        CurrentRow = 0;
    }

    public int getCurRow(){
        return CurrentRow;   
    }

    public int getCurCol(){
        return CurrentCol;
    }

    public void setCurRow(int row){
        CurrentRow = row;   
    }
    
    public void setCurCol(int col){
        CurrentCol = col;
    }

    public void parseDirection(String dirLine) throws TreasureMapException{
        try{
         
        Scanner input = new Scanner(dirLine);
        String direction = input.next();
        int steps = input.nextInt();
    

        if (direction.equals("north")){
            for (int i = 0; i < steps; i++){
                setPos(getCurRow(), getCurCol(), '.');
                setCurRow(getCurRow() - 1);
            } 
            setPos(getCurRow(), getCurCol(), '.');
        }
        else
        if (direction.equals("south")){
            for (int i = 0; i < steps; i++){
                setPos(getCurRow(), getCurCol(), '.');
                setCurRow(getCurRow() + 1);
            }    
            setPos(getCurRow(), getCurCol(), '.');
        }
        else
        if (direction.equals("east")){
            for (int i = 0; i < steps; i++){
                setPos(getCurRow(), getCurCol(), '.');
                setCurCol(getCurCol() + 1);
            }   
            setPos(getCurRow(), getCurCol(), '.'); 
        }
        else
        if (direction.equals("west")){
            for (int i = 0; i < steps; i++){
                setPos(getCurRow(), getCurCol(), '.');
                setCurCol(getCurCol() - 1);
            }  
            setPos(getCurRow(), getCurCol(), '.'); 
        }
        else{ 
        input.close();
        throw new TreasureMapException("BAD COMMAND!");
        }
        input.close();
        
        
        }
        catch (Exception e) {
           throw new TreasureMapException("YE CANNOT MOVE SO!", e);
        }
    }

    public void loadInstructions(String filename) throws TreasureMapException{
        try{        
           Scanner input = new Scanner(new File(filename));
              while (input.hasNextLine()){
                String NextLine = input.nextLine();
                parseDirection(NextLine);
            }
            setPos(getCurRow(), getCurCol(), 'X');
            input.close();
        }
        catch (Exception e){
            clear();
            throw new TreasureMapException("YE CANNOT READ THIS MAP!", e);
            
        }
        
    }

    public void saveMap(String filename) throws TreasureMapException{
        try {
            PrintWriter output = new PrintWriter(filename);
            output.print(getMapString());
            output.close();
        } 
        catch (Exception e) {
            throw new TreasureMapException("SUCH TREASURE NEEDS BE SECRET!", e);
        }
    }
}