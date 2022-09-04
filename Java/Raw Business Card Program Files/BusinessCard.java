package edu.iannotjf.Assign04;

public class BusinessCard {
private String Privname;
private String [] PrivsloganLines;
private char PrivboundaryChar;

    public BusinessCard(String name, String [] sloganLines, char boundaryChar){
        setName(name);
        setBoundaryChar(boundaryChar);
        setSlogan(sloganLines);
        
    }
        ///Sets
        public void setName(String name){
        Privname = name;
        }

        public void setBoundaryChar(char boundaryChar){
        PrivboundaryChar = boundaryChar;
        }

        public void setSlogan(String [] sloganLines){
            PrivsloganLines = new String[sloganLines.length];
            for(int i=0; i < sloganLines.length; i++){
           PrivsloganLines[i] = sloganLines[i];
            }
        }

        ///Gets
        
        public String getName(){
            return Privname;
        }

        public char getBoundaryChar(){
            return PrivboundaryChar;  
        }

        public String getSlogan(){
            String SloganString = String.join("\n",PrivsloganLines);
            if (PrivsloganLines.length != 0){
                SloganString += "\n";
            }
            
        return SloganString;
        }
       
        ///ToString Functions
        public String toString() {
            String cardString = ""; 
            char boundary = getBoundaryChar();

            cardString += TopBottomSet(boundary);
                cardString += "\n";
            cardString += PrintBorderLeft(boundary);
            cardString += getName();                
            int count = 2;                                           //initialize row tracker for printing spaces

            cardString += printSpaces(cardString, boundary, count, "");     // Fourth value is the length of the slogan string 
            count++;                                                        //which is added in its entirety, but required for adding spaces
                cardString += "\n";
            cardString += PrintBorderLeft(boundary);
            cardString += printSpaces(cardString, boundary, count, "");
            count ++;
        
                cardString += "\n";
            cardString += SloganString( boundary, cardString, count);
            cardString += TopBottomSet(boundary);

            
                cardString += "\n";
            
        return cardString;
        }

        // Establishes Slogan Lines and boundaries
        public String SloganString( char boundary, String cardString, int count){
         
            String SloganString = "";
            String LongSlogan = getSlogan();
            String[] arrOfSplitSlogan = LongSlogan.split("\n");
            int NumberofrowsCompleted = 0;
             for (int i = 0; i < (arrOfSplitSlogan.length); i++){           // Handles elements of the slogan that contain a string
                SloganString += PrintBorderLeft(boundary);
                SloganString += arrOfSplitSlogan[i];
                SloganString += printSpaces(cardString, boundary, count, SloganString);
                count ++;
                SloganString += "\n"; 
                NumberofrowsCompleted++;
                }  
                while (NumberofrowsCompleted != 4){                         //Fills the empty gaps where user did not input slogan
                    SloganString += PrintBorderLeft(boundary);
                    SloganString += printSpaces(cardString, boundary, count, SloganString);
                    SloganString += "\n";
                    NumberofrowsCompleted++;
                    count ++;
                }
        return SloganString;
        }

        //Sets top and bottom boundary
        public String TopBottomSet(char boundary){
            String Border = "";
                for(int i=0; i < 42; i++){              
                    Border += boundary;
                }
        return Border;
        }

        //Sets spaces and right boundary
        public String printSpaces(String cardString, char boundary, int count, String SloganString){
            String spacesadd = "";
                for(int i=2; i < ((count * 43 ) - (cardString.length() + SloganString.length())); i++){              
                    spacesadd += " ";
                }
            spacesadd += boundary;
        return spacesadd;
        }

        // Sets left boundary
        public String PrintBorderLeft(char boundary){
            String BorderLeft = boundary + " ";
        return BorderLeft;   
        }
    }