package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Bushomaster;

@Repository
public interface Bushomasterrepository extends JpaRepository<Bushomaster, String> {

}