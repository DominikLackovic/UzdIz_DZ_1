package dlackovi2_zadaca_1.model;

/**
 *
 * @author dlackovi2
 */
public class Sensor
{
    private String name;
    private Type type;
    private String kind;
    private int minValue;
    private int maxValue;
    private String comment;
    
    public Sensor()
    {
        
    }

    public Sensor(String naziv, Type tip, String vrsta, int minVrijednost, int maxVrijednost, String komentar)
    {
        this.name = naziv;
        this.type = tip;
        this.kind = vrsta;
        this.minValue = minVrijednost;
        this.maxValue = maxVrijednost;
        this.comment = komentar;
    }

    public String getNaziv()
    {
        return name;
    }

    public void setNaziv(String naziv)
    {
        this.name = naziv;
    }

    public Type getTip()
    {
        return type;
    }

    public void setTip(Type tip)
    {
        this.type = tip;
    }

    public String getVrsta()
    {
        return kind;
    }

    public void setVrsta(String vrsta)
    {
        this.kind = vrsta;
    }

    public int getMinVrijednost()
    {
        return minValue;
    }

    public void setMinVrijednost(int minVrijednost)
    {
        this.minValue = minVrijednost;
    }

    public int getMaxVrijednost()
    {
        return maxValue;
    }

    public void setMaxVrijednost(int maxVrijednost)
    {
        this.maxValue = maxVrijednost;
    }

    public String getKomentar()
    {
        return comment;
    }

    public void setKomentar(String komentar)
    {
        this.comment = komentar;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return this;
    }
}
