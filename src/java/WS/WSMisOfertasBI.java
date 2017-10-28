/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Controllers.OfertaController;
import Entity.OfertaBI;
import Entity.ResultsOfertaBI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Seba
 */
@WebService(serviceName = "WSMisOfertasBI")
public class WSMisOfertasBI implements WSInterfaces{
        
    @WebMethod(operationName = "BI")
    public OfertaBI[] BI(@WebParam(name= "fechaInicio") String fechaInicio, @WebParam(name="fechaFin") String fechaFin){
            OfertaController ofertaController = new OfertaController();
            
            if(fechaInicio.length()==0 && fechaFin.length()==0){
                OfertaBI[] list = ofertaController.selectOfertasBI2(null, null);
                return list;
            }
            else{
                try {
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateFechaInicio = format.parse(fechaInicio);
                    Date dateFechaFin = format.parse(fechaFin);
                    java.sql.Date sqlFechaInicio = new java.sql.Date(dateFechaInicio.getTime());
                    java.sql.Date sqlFechaFin = new java.sql.Date(dateFechaFin.getTime());
                    
                    OfertaBI[] list = ofertaController.selectOfertasBI2(sqlFechaInicio, sqlFechaFin);
                    return list;
                } catch (ParseException ex) {
                    Logger.getLogger(WSMisOfertasBI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return null;
            //OfertaBI[] list = ofertaController.selectOfertasBI2(null, null);
    }

    @Override
    public OfertaBI[] ListData() {
        OfertaController ofertaController = new OfertaController();
        OfertaBI[] list = ofertaController.selectOfertasBI2(null, null);
        return list;
    }
}


