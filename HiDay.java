
public class HiDay extends SPIEL{

    HiDayFigur farmer;

    public HiDay(){
        super();

        
        zeigeKoordinatensystem(true);

        farmer=new HiDayFigur();
        farmer.setzeMittelpunkt(0, -8);
        


    

     



    

     


    }
    
    void setzeKamerafokus (HiDayFigur farmer){
        super.setzeKamerafokus( farmer );
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

