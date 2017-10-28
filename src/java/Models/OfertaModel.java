
package Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;


public class OfertaModel {
 
    
    public ResultSet selectOfertasBI(Date fechaInicio, Date fechaFin) throws SQLException, ClassNotFoundException{
        Connection con =  BD.Conexion.getConnection();
        String spSelectOferta = "{call SP_SELECT_OFERTAS_BI(?,?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOferta);
        stmt.setDate(1, fechaInicio);
        stmt.setDate(2, fechaFin);
        stmt.registerOutParameter(3, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(3);
        if(set!=null){
            return set;
        }
        return null;
    }    
    
    public int selectCountOfertasBI(Date fechaInicio, Date fechaFin) throws SQLException, ClassNotFoundException{
        Connection con =  BD.Conexion.getConnection();
        String spSelectOferta = "{call SP_SELECT_COUNT_OFERTAS_BI(?,?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOferta);
        stmt.setDate(1, fechaInicio);
        stmt.setDate(2, fechaFin);
        stmt.registerOutParameter(3, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(3);
        if(set!=null){
            while(set.next()){
                return set.getInt(1);
            }
        }
        return 0;
    }
    
}
