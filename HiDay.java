
public class HiDay extends SPIEL{

    FIGUR figur;
    

    public HiDay(String _zustandName , String _gifPfad){
     zeigeKoordinatensystem(true);
     figur = new FIGUR("farmer.png" );
     
    
    }

    void setzeKamerafokus (FIGUR focus){
        super.setzeKamerafokus( focus );
    }

    
}