package com.voolkia.utilities;

import java.util.ArrayList;

import com.voolkia.modelos.Producto;
import com.voolkia.modelos.Seller;

public class Listas {
	
	
	public static ArrayList<Producto> listaProductos() {

		Producto p1 = new Producto("A01", "radio cotrol", "juguete-01", "juuguetes");
		Producto p2 = new Producto("A02", "OneToOne", "Perfurme-10", "perfumeria");
		Producto p3 = new Producto("A03", "Samsung S9", "Electronica", "Celulares");

		ArrayList<Producto> listaProductos = new ArrayList<Producto>();

		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);

		return listaProductos;
	}

	public static ArrayList<Seller> listaVendedores() {
		
		Seller vendedor1 = new Seller("01", "Carmine");
		Seller vendedor2 = new Seller("02", "Roberto");
		

		ArrayList<Seller> registroVendedores = new ArrayList<Seller>();

		registroVendedores.add(vendedor1);
		registroVendedores.add(vendedor2);
		
		
		return registroVendedores;
	}
	
	
}
