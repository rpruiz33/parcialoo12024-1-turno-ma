package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.AerolineasArgentinas;
import modelo.Aeropuerto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AerolineasArgentinas aerolineas=new AerolineasArgentinas();
			try {
				System.out.println(aerolineas.agregarAeropuerto("CDR", "COMODORO RIVADAVIA"));
				System.out.println(aerolineas.agregarAeropuerto("BUE", "BUENOS AIRES"));
				System.out.println(aerolineas.agregarAeropuerto("COR", "CORDOBA"));
				System.out.println(aerolineas.agregarAeropuerto("BRC", "BARILOCHE"));
				System.out.println(aerolineas.agregarAeropuerto("3", "JUJUY"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(aerolineas.traerAeropuerto("BUE"));

			System.out.println(aerolineas.agregarPasajero("Ruina","oscar",11111111, false));
			System.out.println(aerolineas.agregarPasajero("Scordamaglia","Ezequiel",2222222, true));
			System.out.println(aerolineas.agregarPasajero("Siciliano","Gustavo",33333333, true));
			System.out.println(aerolineas.agregarPasajero("Vranic","Alejandra",44444444, false));
			System.out.println(aerolineas.agregarPasajero("RUiz Pereia","Ruiz Pereira",55555555, true));
	
			System.out.println(aerolineas.traerPasajero(33333333));
			
			try {
				System.out.println(aerolineas.agregarVuelo(1, LocalDate.of(2024,9,28), LocalTime.of(10,30),LocalTime.of(12,30), aerolineas.traerAeropuerto("BUE"),  aerolineas.traerAeropuerto("COR")));
				System.out.println(aerolineas.agregarVuelo(2, LocalDate.of(2024,9,29), LocalTime.of(18,0),LocalTime.of(20,0), aerolineas.traerAeropuerto("COR"),  aerolineas.traerAeropuerto("BUE")));
				System.out.println(aerolineas.agregarVuelo(3, LocalDate.of(2024,9,30), LocalTime.of(6,0),LocalTime.of(8,0), aerolineas.traerAeropuerto("BUE"),  aerolineas.traerAeropuerto("BRC")));
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println(aerolineas.agregarVuelo(4, LocalDate.of(2024,3,10), LocalTime.of(7,0),LocalTime.of(9,0), aerolineas.traerAeropuerto("COR"),  aerolineas.traerAeropuerto("COR")));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(aerolineas.getLstVuelos());
			
			

			System.out.println(aerolineas.traerVuelo(2));
			
			
			System.out.println(aerolineas.traerVuelo(2).calcularTiempoVuelo());
			
			System.out.println(aerolineas.traerVuelo(2).agregar(aerolineas.traerPasajero(33333333)));
			System.out.println(aerolineas.traerVuelo(2).agregar(aerolineas.traerPasajero(44444444)));
			System.out.println(aerolineas.traerVuelo(2).toString());
			
			System.out.println(aerolineas.traerVuelo(LocalDate.of(2024,9,29), aerolineas.traerAeropuerto("COR")) );
	
	}
	
	
	
}
