package me.cikai.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import me.cikai.dto.LoginDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MainDaoImpl implements MainDao {

    private NamedParameterJdbcTemplate jdbcTemplate = null;

    @Autowired
    public void setDatasource(DataSource ds) {
        jdbcTemplate = new NamedParameterJdbcTemplate(ds);
    }

    @Override
    public List<LoginDto> login(String name) {
        MapSqlParameterSource paramMap = new MapSqlParameterSource();

        StringBuilder sql = new StringBuilder();
        sql.append(" select ");
        sql.append(" password ");
        sql.append(" from ");
        sql.append(" order_form ");
        sql.append(" where ");
        sql.append(" name = :name; ");

        paramMap.addValue("name", name);

        List<LoginDto> loginCheckList = jdbcTemplate.query(sql.toString(), paramMap, new LoginCheckRowMapper());
        return loginCheckList;
    }

    protected class LoginCheckRowMapper implements RowMapper<LoginDto> {
        @Override
        public LoginDto mapRow(ResultSet rs, int arg1) throws SQLException {
            LoginDto loginDto = new LoginDto();
            loginDto.setPassword(rs.getInt("password"));
            return loginDto;
        }
    }

}
