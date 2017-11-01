package dlackovi2_zadaca_1.model;

/**
 *
 * @author dlackovi2
 */
public class Place
{
    private String naziv;
    private Type tip;
    private int brojSenzora;
    private int brojAktuatora;
    private boolean koristi;
    
    public Place()
    {
        
    }

    public Place(String naziv, Type tip, int brojSenzora, int brojAktuatora, boolean koristi)
    {
        this.naziv = naziv;
        this.tip = tip;
        this.brojSenzora = brojSenzora;
        this.brojAktuatora = brojAktuatora;
        this.koristi = koristi;
    }

    public String getNaziv()
    {
        return naziv;
    }

    public void setNaziv(String naziv)
    {
        this.naziv = naziv;
    }

    public Type getTip()
    {
        return tip;
    }

    public void setTip(Type tip)
    {
        this.tip = tip;
    }

    public int getBrojSenzora()
    {
        return brojSenzora;
    }

    public void setBrojSenzora(int brojSenzora)
    {
        this.brojSenzora = brojSenzora;
    }

    public int getBrojAktuatora()
    {
        return brojAktuatora;
    }

    public void setBrojAktuatora(int brojAktuatora)
    {
        this.brojAktuatora = brojAktuatora;
    }

    public boolean isKoristi()
    {
        return koristi;
    }

    public void setKoristi(boolean koristi)
    {
        this.koristi = koristi;
    }
    
    
}
