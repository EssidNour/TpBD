// SOAP

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace= "http://www.test.fr")
public class MonserviceWeb {

    @WebMethod(operationName = "convertir")
    public double conversion(double mt){
        return mt*0.9;
    }

    public double somme(@WebParam(name = "parametre1") double a, double b ){
        return a+b;
    }


}