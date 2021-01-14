package com.rappi.wsrestvuelo.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketVuelo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ticket_vuelo;
	@Column
	private Date fecha_salida;
	@Column
	private Date fecha_llegada;
	@Column
	private String ciudad_origen;
	@Column
	private String ciudad_destino;
	@Column
	private String nombre_pasajero;
	@Column
	private int edad;
	@Column
	private char tiene_bodega;
	
	@Column
	private double precio;
	@Column(length = 5)
	private String hora_salida;

	@Column(length = 5)
	private String hora_llegada;

	public int getId_ticket_vuelo() {
		return id_ticket_vuelo;
	}
	public void setId_ticket_vuelo(int id_ticket_vuelo) {
		this.id_ticket_vuelo = id_ticket_vuelo;
	}
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public Date getFecha_llegada() {
		return fecha_llegada;
	}
	public void setFecha_llegada(Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}
	public String getCiudad_origen() {
		return ciudad_origen;
	}
	public void setCiudad_origen(String ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}
	public String getCiudad_destino() {
		return ciudad_destino;
	}
	public void setCiudad_destino(String ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}
	public String getNombre_pasajero() {
		return nombre_pasajero;
	}
	public void setNombre_pasajero(String nombre_pasajero) {
		this.nombre_pasajero = nombre_pasajero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getTiene_bodega() {
		return tiene_bodega;
	}
	public void setTiene_bodega(char tiene_bodega) {
		this.tiene_bodega = tiene_bodega;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}
	public String getHora_llegada() {
		return hora_llegada;
	}
	public void setHora_llegada(String hora_llegada) {
		this.hora_llegada = hora_llegada;
	}
	
}
