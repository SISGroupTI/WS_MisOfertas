
package WS;

import Entity.OfertaBI;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface WSInterfaces {
    
    @WebMethod(operationName = "AllBi")
    OfertaBI[] ListData();
}
