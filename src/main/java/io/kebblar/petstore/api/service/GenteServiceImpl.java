package io.kebblar.petstore.api.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import io.kebblar.petstore.api.mapper.GenteMapper;
import io.kebblar.petstore.api.model.domain.Gente;
import io.kebblar.petstore.api.model.exceptions.BusinessException;

@Service
public abstract class GenteServiceImpl implements GenteService {
	private GenteMapper genteMapper;
	
	public int salvaDatos(int id, String correo, String clave) throws BusinessException {
		try {
			Gente gente = genteMapper.getById(id);
			if(gente == null) {
				gente = new Gente(id, correo, clave, 0);
				return genteMapper.insert(gente);
			}else {
				return genteMapper.update(gente);
			}
		}catch(SQLException e) {
			throw new BusinessException("error", e.getMessage());
		}
	}
	
	public List<Gente> dameDatos() throws BusinessException {
		try {
			return genteMapper.getNonBlockedUsers();
		}catch(SQLException e) {
			throw new BusinessException("error", e.getMessage());
		}
	}
}
