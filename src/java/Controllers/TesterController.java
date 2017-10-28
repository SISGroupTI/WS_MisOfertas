
package Controllers;

import Entity.OfertaBI;
import java.sql.ResultSet;
import java.util.List;


public class TesterController {
    
    public static void main(String[] args){
        /*
        List<OfertaBI> lista = controller.selectOfertasBI(null, null);
        System.out.println("size:"+lista.size());*/
        Controllers.OfertaController controller = new OfertaController();
        OfertaBI[] arrayOferta = controller.selectOfertasBI2(null, null);
        System.out.println("size array:"+arrayOferta.length);
    }
    
}
