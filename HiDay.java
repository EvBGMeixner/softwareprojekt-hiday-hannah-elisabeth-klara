
public class HiDay extends SPIEL{

    HiDayFigur figur;

    public HiDay(){
        super();

        zeigeKoordinatensystem(true);
        figur = new HiDayFigur();
        

    }
    void setzeKamerafokus (HiDayFigur figur){
        super.setzeKamerafokus( figur );
    }
}

