package com.example.aceros_arequipa_test.service;


import com.example.aceros_arequipa_test.mapper.SolicitudMapper;
import com.example.aceros_arequipa_test.model.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudService {
    @Autowired
    private SolicitudMapper solicitudMapper;

    public List<Solicitud> findAll() {
        return solicitudMapper.findAll();
    }

    public Solicitud findById(int id) {
        return solicitudMapper.findById(id);
    }

    public void save(Solicitud solicitud) {
        if (solicitud.getId() == 0) {
            solicitudMapper.insert(solicitud);
        } else {
            solicitudMapper.update(solicitud);
        }
    }

    public void delete(int id) {
        solicitudMapper.delete(id);
    }
}
