package com.kishan.SpringPractice.models.mysql;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
* Mapper Class to map the database object with Java Object
*
* */

public class ActorMapper implements RowMapper<ActorModel> {

    public ActorModel mapRow(ResultSet resultSet, int i) throws SQLException {
        ActorModel actor = new ActorModel();
        actor.setFirst_name(resultSet.getString("first_name"));
        actor.setLast_name(resultSet.getString("last_name"));
        actor.setId(resultSet.getInt("actor_id"));
        return actor;
    }

}
