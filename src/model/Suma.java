package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import controller.Prueba;

public class Suma  implements Prueba {

	public Suma() {

	}

    public  static final long serialVersionUID = 1;
    
	@Override
	public String suma(String a, String b) throws RemoteException {	
		System.out.println("Conecto");
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
}
