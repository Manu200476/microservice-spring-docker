package io.kebblar.petstore.api.service;

import java.util.List;

import io.kebblar.petstore.api.model.domain.Gente;
import io.kebblar.petstore.api.model.exceptions.BusinessException;

public interface GenteService {
	int salvaDatos(int id, String correo, String clave, int instBlo) throws BusinessException;
	List<Gente> dameDatos() throws BusinessException;
	int salvaDatos(int id, String correo, String clave) throws BusinessException;
}
