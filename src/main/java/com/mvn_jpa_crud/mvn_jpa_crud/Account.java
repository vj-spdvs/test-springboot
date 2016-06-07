package com.mvn_jpa_crud.mvn_jpa_crud;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name = "account")
@Table
public class Account {

    // The columns.
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;               // Column: user_id.
	
	@NotNull
    private String username;          // Column: username.
	
	@NotNull
    private Timestamp created_on;     // Column: created_on.

    public Account() {
    }

    public Account(Integer uid, String user, Timestamp creat) {
            this.id = uid;
            this.username = user;
            this.created_on = creat;
    }

    // Getters.
    public Timestamp getCreated_on() {
            return created_on;
    }

    public String getUsername() {
            return username;
    }

    public Integer getId() {
            return id;
    }

    // Setters.
    public void setCreated_on(Timestamp time) {
            this.created_on = time;
    }

    public void setUsername(String user) {
            this.username = user;
    }

    public void setId(Integer uid) {
            this.id = uid;
    }

    // To string helper.
    @Override
    public String toString() {
            return String.format("Account[id=%d, username='%s', created_on='%s']", id, username, created_on.toString());
    }



}
