package dlackovi2_zadaca_1;

import dlackovi2_zadaca_1.model.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dlackovi2
 */
public class Aplikacija
{
    private List<Type> tipoviLista = new ArrayList<>();
    
    public Aplikacija()
    {
        tipoviLista.add(new Type(0, "vanjski"));
        tipoviLista.add(new Type(1, "unutarnji"));
        tipoviLista.add(new Type(2, "vanjski i unutarnji"));
    }
}
