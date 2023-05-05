package ma.enset.server.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    @WebMethod
    public double convert(@WebParam double montant){
        return montant * 11.2;
    }
    @WebMethod
    public Compte getCompte (@WebParam int id) {
        return new Compte(id, Math.random() * 2000, new Date());
    }
    @WebMethod
    public List<Compte> listComptes (){
        return List.of(new Compte(1,Math.random() * 2000, new Date()),
                new Compte(2,Math.random() * 3000, new Date()),
                new Compte(3,Math.random() * 4000, new Date())
        );
    }
}
