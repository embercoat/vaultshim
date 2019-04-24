package se.arcticgroup.img.lab.soapapplication.database;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EntityScan
@Entity
@Table(name = "password")
public class PasswordModel {

    @Id
    @Column(name="name", unique=true, updatable=false, nullable=false)
    private String name;

    private String password;


    // Getters and setters

    public PasswordModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}