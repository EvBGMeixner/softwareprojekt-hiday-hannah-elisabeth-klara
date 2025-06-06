
/**
 * Beschreiben Sie hier die Klasse HiDayFigur.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HiDayFigur extends FIGUR
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    FIGUR figur;

    /**
     * Konstruktor für Objekte der Klasse HiDayFigur
     */
    public HiDayFigur()
    {
        super("farmer.png");
        // Instanzvariable initialisieren
        
    }
    public void GrößeAnpassen(double skalierungsfaktor){
        super.skaliere(skalierungsfaktor);
    }
    

    
}
