package com.rappi.wsrestvuelo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rappi.wsrestvuelo.modelo.I_Ticket;
import com.rappi.wsrestvuelo.modelo.TicketVuelo;

@RestController
@RequestMapping("/admonvuelo")
public class TicketControlador {
	
	@Autowired
	private I_Ticket iTicket;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody TicketVuelo ticketVuelo) {
		iTicket.save(ticketVuelo);
	}
	
	@GetMapping("/listar")
	public List<TicketVuelo> listar(){
		return iTicket.findAll();
	}
	
	@GetMapping(value = "/buscarPor/{id}")
	public Optional<TicketVuelo> listarPorId(@PathVariable("id") Integer id){
		return iTicket.findById(id);
	}
	

}
