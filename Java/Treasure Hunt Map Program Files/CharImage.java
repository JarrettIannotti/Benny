package edu.iannotjf.Assign07;
import java.util.*;


public class CharImage {
    private char [][] chars;
    private char Privfillchar;
    private int PrivrowCnt;
    private int PrivcolCnt;


    public CharImage(int rowCnt, int colCnt, char fillChar){
      chars = new char[rowCnt][colCnt];
      Privfillchar = fillChar;
      PrivrowCnt = rowCnt;
      PrivcolCnt = colCnt;
      clear();

    }
    
    public void clear(){
        for (char[] row : chars)
            Arrays.fill(row, Privfillchar);

    }

    public int getRowCnt(){
        return PrivrowCnt;
    }

    public int getColCnt(){
        return PrivcolCnt;
    }

    public boolean isValidPosition(int row, int col){
        if ( 0 <= row && row < PrivrowCnt && 0 <= col && col < PrivcolCnt ){
            return true;
        }
        else {
            return false;
        }
        
    }

    public char getPos(int row,int col){
        if (isValidPosition(row, col) == true){
            return chars[row][col];
        }   
        else return ' ';
    }

    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row, col) == true){
            chars[row][col]=c;
            return true;
        } 

        else return false;
    }

    public String toString(){
        String toString;
        toString = PrivrowCnt + " x " + PrivcolCnt + " CharImage (default: " + Privfillchar + ")";
        return toString;
    }

    public String getMapString(){
        String MapString = "";
        for(int row = 0; row < PrivrowCnt; row++) {
            for(int col = 0; col < PrivcolCnt; col++) {
            MapString += chars[row][col];
            }
            MapString += "\n";
            }


        return MapString;
    }

}