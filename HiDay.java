
public class HiDay extends SPIEL{

    HiDayFigur farmer;
    RECHTECK boden;
    String punkteanzeige;
    int x;
    String lebensanzeige;
    int y;

    public HiDay(){
        super();

        zeigeKoordinatensystem(true);
        farmer=new HiDayFigur();
        x = 0;
        y = 3;

        setzeKamerafokus (farmer);
        punkteanzeige = new String("Punkte:int x");
        lebensanzeige = new String("Leben:int y");


        farmer.setzeMittelpunkt(0, -7.5);
        boden = new RECHTECK(1000,1);
        boden.setzeMittelpunkt(480,-10);
        boden.setzeFarbe("grün");


        setzeHintergrundgrafik("bauernhofhintergrund.png");

        
        farmer.macheAktiv();
        boden.machePassiv();
        
        hintergrundbild.machePassiv();
        lebensanzeige = y;
        punkteanzeige = x;
    




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
    public void anzeigeErstellen(){
        lebensanzeige.setzeMittelpunkt(5,7);
        punkteanzeige.setzeMittelpunkt(5,6);
        lebensanzeige.setzeFarbe("rot");
        punkteanzeige.setzeFarbe("blau");
        
        
    }

    // Figur hinzufügen
   
}

