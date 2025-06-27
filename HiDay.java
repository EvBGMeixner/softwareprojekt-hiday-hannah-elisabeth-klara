
public class HiDay extends SPIEL{

    HiDayFigur farmer;

    public HiDay(){
        super();

        zeigeKoordinatensystem(true); 
        figur = new HiDayFigur();
        figur.setzeMittelpunkt(0, -8);
        



    

    public void setzeKamerafokus (HiDayFigur figur){
        super.setzeKamerafokus( figur );

    }
    
    public void tasteReagieren(int taste){
        if(taste == TASTE.RAUF){
            farmer.springe(12);
        }
        
    }

    public void bildAktualisierungReagieren(double s){
        if(istTasteGedrueckt(TASTE.RECHTS)){
            farmer.verschiebenUm(0.1, 0);
        }
        if(istTasteGedrueckt(TASTE.LINKS)){
            farmer.verschiebenUm(-0.1, 0);
        }

    }
    

    // Figur hinzufügen
    
   
}

