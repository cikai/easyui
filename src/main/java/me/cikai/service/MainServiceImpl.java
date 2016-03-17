package me.cikai.service;

import java.util.List;

import me.cikai.dao.MainDao;
import me.cikai.dto.LoginDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    MainDao dao = null;

    @Override
    public List<LoginDto> login(String name) {
        List<LoginDto> loginCheck = dao.login(name);
        return loginCheck;
    }

}
