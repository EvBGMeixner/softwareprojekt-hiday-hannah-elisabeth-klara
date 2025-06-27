
public class HiDay extends SPIEL{

    HiDayFigur figur;

    public HiDay(){
        super();

        zeigeKoordinatensystem(true);

        figur = new HiDayFigur();
        figur.setzeMittelpunkt(0, -8);
        


    }

    void setzeKamerafokus (HiDayFigur figur){
        super.setzeKamerafokus( figur );
    }
    

    // Figur hinzufügen
    
   
}

