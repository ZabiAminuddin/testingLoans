package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DataRepository {

    @Autowired
    private JdbcTemplate jcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public List<User> findAll() {
        // User u= new User();
        // jdbcTemplate = ApplicationContextHolder.getContext().getBean(JdbcTemplate.class);
        System.out.println("Helloo jdbcTemplate" + jcTemplate);
        return jcTemplate.query("SELECT * FROM LOANS", (rs, rowNum) -> mapUserResult(rs));
    }
    private User mapUserResult(final ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("Id"));
        user.setUserName(rs.getString("NAME"));
        user.setSin(rs.getString("SIN"));
        System.out.println("Helloo user Sin " + user.getSin() + " user Name " + user.getUserName());
        return user;
    }
}
