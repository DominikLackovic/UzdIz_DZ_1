package dlackovi2_zadaca_1.model;

/**
 *
 * @author dlackovi2
 */
public class Type
{
    private int vrijednost;
    private String naziv;
    
    public Type()
    {
        
    }
    
    public Type(int vrijednost, String naziv)
    {
        this.vrijednost = vrijednost;
        this.naziv = naziv;
    }

    public int getVrijednost()
    {
        return vrijednost;
    }

    public void setVrijednost(int vrijednost)
    {
        this.vrijednost = vrijednost;
    }

    public String getNaziv()
    {
        return naziv;
    }

    public void setNaziv(String naziv)
    {
        this.naziv = naziv;
    }
    
    
}
