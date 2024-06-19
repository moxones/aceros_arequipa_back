package com.example.aceros_arequipa_test.controller;

import com.example.aceros_arequipa_test.model.Solicitud;
import com.example.aceros_arequipa_test.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
@CrossOrigin(origins = "http://localhost:4200")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    public List<Solicitud> getAllSolicitudes() {
        return solicitudService.findAll();
    }

    @GetMapping("/{id}")
    public Solicitud getSolicitudById(@PathVariable int id) {
        return solicitudService.findById(id);
    }

    @PostMapping
    public void createSolicitud(@RequestBody Solicitud solicitud) {
        solicitudService.save(solicitud);
    }

    @PutMapping("/{id}")
    public void updateSolicitud(@PathVariable int id, @RequestBody Solicitud solicitud) {
        solicitud.setId(id);
        solicitudService.save(solicitud);
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitud(@PathVariable int id) {
        solicitudService.delete(id);
    }
}
