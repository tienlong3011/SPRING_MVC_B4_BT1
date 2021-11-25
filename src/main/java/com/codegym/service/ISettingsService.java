package com.codegym.service;

import com.codegym.model.Settings;

import java.util.List;

public interface ISettingsService {
    List<Settings> findAll();

    void save(Settings settings);

    Settings findById(int id);

    void update(int id, Settings settings);

    void remove(int id);
}