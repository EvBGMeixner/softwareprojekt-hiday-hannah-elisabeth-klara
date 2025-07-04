
public class HiDay extends SPIEL{

    HiDayFigur farmer;
    RECHTECK boden;
    TEXT punkteanzeige;
    int x;
    TEXT lebensanzeige;
    int y;
    FIGUR[] strohballen;
    FIGUR[] milchkanne;
    public HiDay(){
        super();

        zeigeKoordinatensystem(true);
        farmer=new HiDayFigur();
        x = 0;
        y = 3;
        strohballen=new FIGUR[10];

        for(int i=0; i<10; i++){

            strohballen[i]=new FIGUR("strohballen.jpg");

            strohballen[i].machePassiv();

        }

        milchkanne=new FIGUR[10];

        for(int i=0; i<10; i++){

            milchkanne[i]=new FIGUR("milchkanne.jpg");

            milchkanne[i].machePassiv();

        }

        setzeKamerafokus (farmer);
        punkteanzeige = new TEXT(5,7,2,"Punkte: " + x);
        lebensanzeige = new TEXT(5,5,2,"Leben:int y");

        farmer.setzeMittelpunkt(0, -7.5);
        boden = new RECHTECK(1000,1);
        boden.setzeMittelpunkt(480,-10);
        boden.setzeFarbe("grün");

        setzeHintergrundgrafik("bauernhofhintergrund.png");

        farmer.macheAktiv();
        boden.machePassiv();

        hintergrundbild.machePassiv();
        

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

    

    public void punkteErhöhen(int x){
        for (int i =0 ; i < 10; i++){
            if (farmer.beruehrt(milchkanne[i] )){
                    x=x+1;
                }
            }

            // Figur hinzufügen
        }
    }
