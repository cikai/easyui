package me.cikai.service;

import java.util.List;

import me.cikai.dto.LoginDto;

public interface MainService {

	public List<LoginDto> login(String name);

}
