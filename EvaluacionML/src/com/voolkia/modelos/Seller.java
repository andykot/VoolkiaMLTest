package com.voolkia.modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Seller {
	
	private String seller_id;
	private String seller_name;
	private ArrayList<Producto> productos;

	public Seller(String id, String name) {

		this.seller_id = id;
		this.seller_name = name;
		this.productos = new ArrayList<Producto>();

	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public ArrayList<Producto> getListaProductos() {
		return productos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.productos = listaProductos;
	}

	
	
	public void showProductbyConsole() {

		if (productos.size() == 0) {

			System.out.println("El User no tiene publicaciones");

		} else {

			for (int i = 0; i < productos.size(); i++) {

				System.out.println(productos.get(i).toString());

			}
		}
	}
	
	
	
		
	}


