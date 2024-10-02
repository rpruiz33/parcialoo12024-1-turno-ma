package modelo;

public class Aeropuerto {
private int idAeropueto;
private String codAeropuerto;
private String Aeropuerto;
public int getIdAeropueto() {
	return idAeropueto;
}
public void setIdAeropueto(int idAeropueto) {
	this.idAeropueto = idAeropueto;
}
public String getCodAeropuerto() {
	return codAeropuerto;
}
public void setCodAeropuerto(String codAeropuerto) {
	this.codAeropuerto = codAeropuerto;
}
public String getAeropuerto() {
	return Aeropuerto;
}
public void setAeropuerto(String aeropuerto) {
	Aeropuerto = aeropuerto;
}
public Aeropuerto(int idAeropueto, String codAeropuerto, String aeropuerto) {
	super();
	this.idAeropueto = idAeropueto;
	this.codAeropuerto = codAeropuerto;
	Aeropuerto = aeropuerto;
}
public boolean equals(Aeropuerto a) {
	return a.getAeropuerto().equals(codAeropuerto)&& a.getIdAeropueto()==(idAeropueto) && a.getAeropuerto().equals(a.Aeropuerto);
}
@Override
public String toString() {
	return "Aeropuerto [idAeropueto=" + idAeropueto + ", codAeropuerto=" + codAeropuerto + ", Aeropuerto=" + Aeropuerto
			+ "]";
}

}
