package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Prueba extends Remote {

	public String suma(String a, String b) throws RemoteException;
	
}
