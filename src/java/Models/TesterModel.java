
package Models;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TesterModel {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        OfertaModel ofertaModel = new OfertaModel();
        int set = ofertaModel.selectCountOfertasBI(null, null);
        System.out.println("dat:"+set);
        
        
        
    }
}
