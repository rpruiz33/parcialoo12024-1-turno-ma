package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AerolineasArgentinas {
private List<Aeropuerto> LstAeropuertos;
private List<Pasajero> LstPasajeros;
private List<Vuelo> LstVuelos;
public List<Aeropuerto> getLstAeropuertos() {
	return LstAeropuertos;
}
public void setLstAeropuertos(List<Aeropuerto> lstAeropuertos) {
	LstAeropuertos = lstAeropuertos;
}
public List<Pasajero> getLstPasajeros() {
	return LstPasajeros;
}
public void setLstPasajeros(List<Pasajero> lstPasajeros) {
	LstPasajeros = lstPasajeros;
}
public List<Vuelo> getLstVuelos() {
	return LstVuelos;
}
public void setLstVuelos(List<Vuelo> lstVuelos) {
	LstVuelos = lstVuelos;
}
public AerolineasArgentinas() {
	super();
	LstAeropuertos =new ArrayList<Aeropuerto>();
	LstPasajeros = new ArrayList<Pasajero>();
	LstVuelos = new ArrayList<Vuelo>();
}
public boolean agregarAeropuerto(String codAeropuerto, String aeropuerto) throws Exception{
	boolean aux=false;
	Aeropuerto a= traerAeropuerto(codAeropuerto);
	if(a!=null) {
		aux=false;
	}else {
		int id=1;
		if(LstAeropuertos.size()>0) {
	id= LstAeropuertos.get(LstAeropuertos.size()-1).getIdAeropueto()+1;
		}
			LstAeropuertos.add(new Aeropuerto (id,codAeropuerto,  aeropuerto));
			aux=true;
	}
	if(Funciones.esCadenaNros(codAeropuerto) || codAeropuerto.length()>3 ) {
		throw new Exception("no es valido el codigo");
	}
	return aux;
	
	
}

public Aeropuerto traerAeropuerto(String codAeropuerto) {
	int i=0; 
	Aeropuerto aux=null;
	while(i<LstAeropuertos.size() && aux==null) {
		if (LstAeropuertos.get(i).getCodAeropuerto().equals(codAeropuerto)) {
		aux=LstAeropuertos.get(i);
		}
		i++;
	}
	return aux;
}
public Pasajero traerPasajero(int dni) {
Pasajero aux=null;
int i=0;
while(i<LstPasajeros.size() && aux==null) {
if(	LstPasajeros.get(i).getDni()==dni) {
	aux=LstPasajeros.get(i);
}
i++;
}
return aux;

}

public boolean agregarPasajero( String apellido, String nombre, int dni, boolean viajeroFrecuente) {
	boolean aux=false;
	Pasajero auxPasajero=traerPasajero(dni);
	if(auxPasajero==null) {
		int id=1;
		if(LstPasajeros.size()>0) {
			id= LstPasajeros.get(LstPasajeros.size()-1).getIdPsajero()+1;
			
		}
		LstPasajeros.add(new Pasajero(id ,apellido,  nombre,  dni, viajeroFrecuente));
		aux=true;
	}
	
	return aux;
}
public boolean agregarVuelo(int idVuelo,  LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada, Aeropuerto aeroPuertoSalida,
		Aeropuerto aeroPuertoLlegada)throws Exception {
	boolean aux=false;
	Vuelo auxvuelo=traerVuelo(idVuelo);

	if (aeroPuertoSalida.getCodAeropuerto().equals(aeroPuertoLlegada.getCodAeropuerto())) {
		throw new Exception("tienen el mismo codigo de aropuerto");
	}

	if( auxvuelo==null) {
		int id=1;
		if(LstVuelos.size()>0) {
			id=LstVuelos.get(LstVuelos.size()-1).getIdVuelo()+1;
		}
			LstVuelos.add(new Vuelo(id ,fecha, horaSalida, horaLlegada,  aeroPuertoSalida,
					aeroPuertoLlegada));
				aux=true;
		
		}

	return aux;
}
public Vuelo traerVuelo(int idVuelo) {
	Vuelo vuelo=null;
	int i=0;
	while (i<LstVuelos.size() && vuelo==null) {
		if(LstVuelos.get(i).getIdVuelo()==idVuelo) {
			vuelo=LstVuelos.get(i);
		}
		i++;
	}
	
	return vuelo;
	
	
}
public List<Vuelo> traerVuelo(LocalDate fecha ,Aeropuerto aeroPuertoSalida) {
List<Vuelo> aux=null;
	for(int i=0;i<LstVuelos.size();i++) {
		if(LstVuelos.get(i).getAeroPuertoSalida().equals(aeroPuertoSalida) && LstVuelos.get(i).getFecha().equals(aeroPuertoSalida)){
			aux.add(LstVuelos.get(i));   
		}
		}
	return aux;
	}
	
	
	
	
	
}


