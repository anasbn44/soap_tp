package ma.enset.client;

import ma.enset.client.proxy.BanqueService;
import ma.enset.client.proxy.BanqueServiceService;
import ma.enset.client.proxy.Compte;

public class Client {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        System.out.println(stub.convert(45));
        Compte compte = stub.getCompte(4);
        System.out.println("ID : " + compte.getId() + " Solde " + compte.getSolde());
        for (Compte c : stub.listComptes()){
            System.out.println(String.format("ID : %d, SOLDE : %f", c.getId(), c.getSolde()));
        }
    }
}
