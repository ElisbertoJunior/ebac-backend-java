package br.com.elisbjr.controllers;

import br.com.elisbjr.entity.Pedido;
import br.com.elisbjr.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Pedido> save (@RequestBody Pedido pedido) {
        return ResponseEntity.ok().body(service.save(pedido));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscaPedido(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @GetMapping(value = "/busca-todos")
    public ResponseEntity<List<Pedido>> buscaTodos() {
        return ResponseEntity.ok().body(service.findAll());
    }

}
