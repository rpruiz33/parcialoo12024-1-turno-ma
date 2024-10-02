package modelo;

public class Pasajero {
private int idPsajero;
private String apellido;
private String nombre;
private int dni;
private boolean viajeroFrecuente;
public int getIdPsajero() {
	return idPsajero;
}
public void setIdPsajero(int idPsajero) {
	this.idPsajero = idPsajero;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public boolean isViajeroFrecuente() {
	return viajeroFrecuente;
}
public void setViajeroFrecuente(boolean viajeroFrecuente) {
	this.viajeroFrecuente = viajeroFrecuente;
}
public Pasajero(int idPsajero, String apellido, String nombre, int dni, boolean viajeroFrecuente) {
	super();
	this.idPsajero = idPsajero;
	this.apellido = apellido;
	this.nombre = nombre;
	this.dni = dni;
	this.viajeroFrecuente = viajeroFrecuente;
}
@Override
public String toString() {
	return "\nPasajero [idPsajero=" + idPsajero + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
			+ ", viajeroFrecuente=" + viajeroFrecuente + "]";
}

public boolean equals(Pasajero p) {
	return p.getDni()==dni;
}
}
