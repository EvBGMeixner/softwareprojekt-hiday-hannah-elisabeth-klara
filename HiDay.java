
public class HiDay extends SPIEL{

    FIGUR figur;
    

    public HiDay(){
        super();

     zeigeKoordinatensystem(true);
     figur = new FIGUR("farmer.png");
     
    
    }

     
    //void setzeKamerafokus (unsereFigur){
    //}

    void setzeKamerafokus (FIGUR figur){
        super.setzeKamerafokus( figur );
    }


    
}