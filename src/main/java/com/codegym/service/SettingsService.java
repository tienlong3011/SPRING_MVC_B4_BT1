package com.codegym.service;

import com.codegym.model.Settings;

import java.util.ArrayList;
import java.util.List;

public class SettingsService implements ISettingsService {
    private List<Settings> settingsList = new ArrayList<>();

    @Override
    public List<Settings> findAll() {
        return null;
    }

    @Override
    public void save(Settings settings) {
        settingsList.add(settings);
    }

    @Override
    public Settings findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Settings settings) {

    }

    @Override
    public void remove(int id) {

    }
}
