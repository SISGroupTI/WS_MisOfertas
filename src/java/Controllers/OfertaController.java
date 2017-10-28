
package Controllers;

import Entity.OfertaBI;
import Models.OfertaModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OfertaController {
    

    public OfertaBI[] selectOfertasBI2(Date fechaInicio, Date fechaFin){
        try {
            OfertaModel ofertaModel = new OfertaModel();
            ResultSet set = ofertaModel.selectOfertasBI(fechaInicio, fechaFin);
            
            int count = countSelectOfertas(fechaInicio, fechaFin);
            OfertaBI[] arrayOferta = new OfertaBI[count];
            OfertaBI oferta;
            if(set!=null){
                int aux = 0;
                while(set.next()){
                    oferta = new OfertaBI();
                    oferta.setNombre_empresa(set.getString(1));
                    oferta.setNumero_local(set.getInt(2));
                    oferta.setRubro(set.getString(3));
                    oferta.setId_oferta(set.getInt(4));
                    oferta.setTitulo_oferta(set.getString(6));
                    oferta.setPrecio_oferta(set.getInt(7));
                    oferta.setFecha_creacion(set.getString(8));
                    oferta.setFecha_publicacion(set.getString(9));
                    oferta.setFecha_finalizacion(set.getString(10));
                    oferta.setCant_valoraciones_negativas(set.getInt(11));
                    oferta.setCant_valoraciones_medias(set.getInt(12));
                    oferta.setCant_valoraciones_positivas(set.getInt(13));
                    oferta.setCant_valoraciones_total(set.getInt(14));
                    oferta.setProducto(set.getString(15));
                    oferta.setCant_visitas(set.getInt(16));
                    arrayOferta[aux] = oferta;
                    aux++;   
                }
                return arrayOferta;
            }
            return null;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(OfertaController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int countSelectOfertas(Date fechaInicio, Date fechaFin){
        try {
            OfertaModel ofertaModel = new OfertaModel();
            return ofertaModel.selectCountOfertasBI(fechaInicio, fechaFin);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(OfertaController.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
}
