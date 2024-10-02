package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
private int idVuelo;
private LocalDate fecha;
private LocalTime horaSalida;
private LocalTime horaLlegada;
private Aeropuerto aeroPuertoSalida;
private Aeropuerto aeroPuertoLlegada;
private List<Pasajero> LstPasajeros ;
public int getIdVuelo() {
	return idVuelo;
}
public void setIdVuelo(int idVuelo) {
	this.idVuelo = idVuelo;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHoraSalida() {
	return horaSalida;
}
public void setHoraSalida(LocalTime horaSalida) {
	this.horaSalida = horaSalida;
}
public LocalTime getHoraLlegada() {
	return horaLlegada;
}
public void setHoraLlegada(LocalTime horaLlegada) {
	this.horaLlegada = horaLlegada;
}
public Aeropuerto getAeroPuertoSalida() {
	return aeroPuertoSalida;
}
public void setAeroPuertoSalida(Aeropuerto aeroPuertoSalida) {
	this.aeroPuertoSalida = aeroPuertoSalida;
}
public Aeropuerto getAeroPuertoLlegada() {
	return aeroPuertoLlegada;
}
public void setAeroPuertoLlegada(Aeropuerto aeroPuertoLlegada) {
	this.aeroPuertoLlegada = aeroPuertoLlegada;
}
public List<Pasajero> getLstPasajeros() {
	return LstPasajeros;
}
public void setLstPasajeros(List<Pasajero> lstPasajeros) {
	LstPasajeros = lstPasajeros;
}
public Vuelo(int idVuelo, LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada, Aeropuerto aeroPuertoSalida,
		Aeropuerto aeroPuertoLlegada) {
	super();
	this.idVuelo = idVuelo;
	this.fecha = fecha;
	this.horaSalida = horaSalida;
	this.horaLlegada = horaLlegada;
	this.aeroPuertoSalida = aeroPuertoSalida;
	this.aeroPuertoLlegada = aeroPuertoLlegada;
	LstPasajeros = new ArrayList <Pasajero>();
}
@Override
public String toString() {
	return "\nVuelo [idVuelo=" + idVuelo + ", fecha=" + fecha + ", horaSalida=" + horaSalida + ", horaLlegada="
			+ horaLlegada + ", aeroPuertoSalida=" + aeroPuertoSalida + ", aeroPuertoLlegada=" + aeroPuertoLlegada
			+ ", LstPasajeros=" + LstPasajeros + "]";
}


public int calcularTiempoVuelo() {
	int resultado=0;
	resultado=(int) ((horaLlegada.getHour()*60.+horaLlegada.getMinute())-(horaSalida.getHour()*60+horaSalida.getMinute()));
	return resultado;
}
public boolean agregar(Pasajero pasajero) {
	boolean aux=false;
	
	for (int i=0; i<LstPasajeros.size();i++) {
		if(LstPasajeros.get(i).equals(pasajero)) {
		aux=false;
		}
	}
		LstPasajeros.add(new Pasajero(pasajero.getIdPsajero(), pasajero.getApellido(), pasajero.getNombre(), pasajero.getDni(), pasajero.isViajeroFrecuente()));
		aux=true;
	
	return aux;
}


}