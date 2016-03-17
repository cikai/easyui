package me.cikai.dao;

import java.util.List;

import me.cikai.dto.LoginDto;

public interface MainDao {

    public List<LoginDto> login(String name);

}
