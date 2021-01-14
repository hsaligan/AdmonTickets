package com.rappi.wsrestvuelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rappi.wsrestvuelo.modelo.I_Ticket;
import com.rappi.wsrestvuelo.modelo.TicketVuelo;

@SpringBootTest
class AdmonVueloApplicationTests {
	@Autowired
	private I_Ticket iTicket;

	@Test
	void contextLoads() {
	}
	
	
	  @Test public void crearTicket() throws ParseException { SimpleDateFormat
	  objSDF = new SimpleDateFormat("yyyy-MM-dd"); //Date dt_1 = (Date)
	  objSDF.parse("2020-10-01"); //Date dt_2 = (Date) objSDF.parse("2020-10-20");
	  //System.out.println("Date1:" + objSDF.format(dt_1));
	  
	  TicketVuelo ticketVuelo = new TicketVuelo();
	  //ticketVuelo.setFecha_salida(dt_1); ticketVuelo.setFecha_salida(new Date(2020)); 
	  ticketVuelo.setFecha_llegada(new Date(2021));
	  ticketVuelo.setCiudad_origen("CDMX"); ticketVuelo.setCiudad_destino("GUA");
	  ticketVuelo.setNombre_pasajero("Jorge Perez"); ticketVuelo.setEdad(40);
	  ticketVuelo.setTiene_bodega('N'); ticketVuelo.setPrecio(300.20);
	  ticketVuelo.setHora_llegada("10:00"); ticketVuelo.setHora_salida("12:00");
	  TicketVuelo valida = iTicket.save(ticketVuelo); 
	  //Ejecución de prueba falsa o con error para crear 
	  //Sólo descomentar para realización de prueba de error
	  //assertTrue(valida.getCiudad_origen().equalsIgnoreCase(ticketVuelo.getCiudad_destino())); 
	  //Ejecución de prueba verdadera o sin error para crear
	  assertTrue(valida.getCiudad_origen().equalsIgnoreCase(ticketVuelo.
	  getCiudad_origen())); }
	 
	/*
	 * @Test public Optional<TicketVuelo> listarPorId(){ int id = 1; TicketVuelo
	 * consultaTicketVuelo = new TicketVuelo();
	 * consultaTicketVuelo.getId_ticket_vuelo(); Optional<TicketVuelo> valida =
	 * iTicket.findById(id);
	 * 
	 * assertTrue(valida.isPresent());
	 * 
	 * return iTicket.findById(id); }
	 */
}
