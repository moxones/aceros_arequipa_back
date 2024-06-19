package com.example.aceros_arequipa_test.mapper;


import org.apache.ibatis.annotations.*;

import com.example.aceros_arequipa_test.model.Solicitud;

import java.util.List;

@Mapper
public interface SolicitudMapper {
    @Select("SELECT * FROM solicitudes")
    List<Solicitud> findAll();

    @Select("SELECT * FROM solicitudes WHERE id = #{id}")
    Solicitud findById(int id);

    @Insert("INSERT INTO solicitudes(nombres, apellidos, area, nombre_solicitud, descripcion, anexo) VALUES(#{nombres}, #{apellidos}, #{area}, #{nombreSolicitud}, #{descripcion}, #{anexo})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Solicitud solicitud);

    @Update("UPDATE solicitudes SET nombres=#{nombres}, apellidos=#{apellidos}, area=#{area}, nombre_solicitud=#{nombreSolicitud}, descripcion=#{descripcion}, anexo=#{anexo} WHERE id = #{id}")
    void update(Solicitud solicitud);

    @Delete("DELETE FROM solicitudes WHERE id = #{id}")
    void delete(int id);
}
