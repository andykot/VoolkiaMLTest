package com.voolkia.modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Site {

	private String site_name;
	private ArrayList<Seller> vendedores;

	public Site(String siteName) {
		this.site_name = siteName;
		this.vendedores = new ArrayList<Seller>();

	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public ArrayList<Seller> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Seller> vendedores) {
		this.vendedores = vendedores;
	}

	public void mostrarRegistro() {

		if (vendedores.size() == 0) {

			System.out.println("El site no posee usuarios registrados");

		} else {

			System.out.println("El site tiene " + vendedores.size() + " registrados");
			for (int i = 0; i < vendedores.size(); i++) {

				System.out.println("usuario_codigo " + vendedores.get(i).getSeller_id());
			}

		}

	}

	public boolean ususarioVerificacion(String codigoUsuario) {
		boolean verificacion = false;
		for (int i = 0; i < vendedores.size(); i++) {
			if (codigoUsuario.equalsIgnoreCase(vendedores.get(i).getSeller_id())) {

				verificacion = true;
				break;

			} else {

				verificacion = false;
			}
		}
		return verificacion;
	}
	
	public void generarTXT(String codigoUsuario) {
		
		if(ususarioVerificacion(codigoUsuario)==false) {
			System.out.println("El codigo de usuario no existe/no registrado");
			
		}else {
			int w=0;
			while (codigoUsuario != vendedores.get(w).getSeller_id() && (w<vendedores.size()-1) ) {
				
				w++;
			}
			
			try {
				FileWriter archivo = new FileWriter(vendedores.get(w).getSeller_id()+"-"+vendedores.get(w).getSeller_name()+".txt" );
				archivo.write("Informacion del ususario:" + vendedores.get(w).getSeller_name() +" codigo:"+ vendedores.get(w).getSeller_id()+"\n");
				if(vendedores.get(w).getListaProductos().size()==0) {
					archivo.write("No posee articulos publicados");
				}else {
					for(int z=0;z<vendedores.get(w).getListaProductos().size(); z++) {
						archivo.write(vendedores.get(w).getListaProductos().get(z).mostrarDatos() +"\n");;
						
					}
					
				}
				archivo.close();
				System.out.println("archivo .txt generado con exito");
			} catch (IOException e) {
				System.out.println("llamar al administrador");
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
	}

}
