
public class HiDay extends SPIEL{

    HiDayFigur figur;

    public HiDay(){
        super();

        zeigeKoordinatensystem(true);
        figur = new FIGUR("farmer.png");

    }
    zeigeKoordinatensystem(true);
     
    //void setzeKamerafokus (unsereFigur){
    //}

}
void setzeKamerafokus (FIGUR figur){
super.setzeKamerafokus( figur );
}


