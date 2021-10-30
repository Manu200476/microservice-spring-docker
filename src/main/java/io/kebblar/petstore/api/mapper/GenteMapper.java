package io.kebblar.petstore.api.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import io.kebblar.petstore.api.model.domain.Gente;

public interface GenteMapper {
	@Results(id="GenteMapping", value = {
		@Result(property="id", column="id"),
		@Result(property="correo", column="correo"),
		@Result(property="clave", column="clave"),
		@Result(property="instante_bloqueo", column="instante_bloqueo"),
	})
	@Select("SELECT id, correo, clave, instante_bloqueo FROM gente WHERE id = #{id}")
	Gente getById(int id) throws SQLException;
	
	@ResultMap("GenteMapping")
	@Select("SELECT id, correo, clave, instante_bloqueo FROM gente WHERE instante_bloqueo = 0")
	List<Gente> getNonBlockedUsers() throws SQLException;
	
	@Insert("INSERT INTO gente(correo, clave, instante_bloqueo) VALUES(#{correo}, #{clave}, #{instanteBloqueo})")
	int insert(Gente gente) throws SQLException;
	
	@Update("UPDATE gente SET correo = #{correo}, clave = #{clave}, instante_bloqueo = #{instanteBloqueo} WHERE id = #{id}")
	int update(Gente gente) throws SQLException;
	
	@Delete("DELETE FROM gente WHERE id = #{id}")
	int delete(int id) throws SQLException;
}
