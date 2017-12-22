package com.github.mongodb.springbootmongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document
public class User implements Serializable{

    @Id
    private int id;
    private String name;
    private String teamName;
    private Long salary;


    public User(int id, String name, String teamName, Long salary){
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public Long getSalary(){
        return salary;
    }

    public void setSalary(Long salary){
        this.salary = salary;
    }
}
