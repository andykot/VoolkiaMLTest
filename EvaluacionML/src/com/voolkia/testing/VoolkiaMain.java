package com.voolkia.testing;

import com.voolkia.modelos.Site;
import com.voolkia.utilities.Listas;

public class VoolkiaMain {

	public static void main(String[] args) {

		Site ml = new Site("Mercado Libre");
		Site az = new Site("Amazon");
		ml.setVendedores(Listas.listaVendedores());
		ml.getVendedores().get(0).setListaProductos(Listas.listaProductos());
		
		//ml.imprimirArticulosVendedor("10");
		//ml.mostrarRegistro();
		//System.out.println(ml.ususarioVerificacion("02"));
		//ml.generarTXT("02");
		az.mostrarRegistro();
		ml.getVendedores().get(0).showProductbyConsole();
		
	}

}
