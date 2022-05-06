package controller;

import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;


import model.Suma;

public class Controlador {
	
	public static void main(String[] args) {

		try {
			
			Suma s = new Suma();
			
			Prueba stub = (Prueba) UnicastRemoteObject.exportObject(s,1093);
			
			Registry r = LocateRegistry.createRegistry(1093);
			
			
			r.rebind("Prueba", stub);
			
			System.out.println("El servidor esta en linea");
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
