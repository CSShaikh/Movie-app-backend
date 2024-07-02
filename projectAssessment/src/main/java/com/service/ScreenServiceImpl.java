package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ScreenRepository;
import com.model.Screen;

@Service
public class ScreenServiceImpl implements ScreenService {

    @Autowired
    private ScreenRepository screenRepo;

    @Override
    public List<Screen> getAllScreens() {
        return screenRepo.findAll();
    }

    @Override
    public Screen addScreen(Screen screen) {
        return screenRepo.save(screen);
    }

    @Override
    public Screen getScreenById(Long screenId) {
        return screenRepo.findById(screenId).orElse(null);
    }
}
