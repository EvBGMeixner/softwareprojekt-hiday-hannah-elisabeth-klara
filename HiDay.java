
public class HiDay extends SPIEL{

    HiDayFigur farmer;
    RECHTECK boden;

    public HiDay(){
        super();

        
        zeigeKoordinatensystem(true);
        farmer=new HiDayFigur();
        farmer.setzeMittelpunkt(0, -7.5);
        boden = new RECHTECK(1000,1);
        boden.setzeMittelpunkt(480,-10);
        boden.setzeFarbe("grün");
        


    

     




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

   
}

