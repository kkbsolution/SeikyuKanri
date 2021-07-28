package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Mitumoriuchiwake;

@Repository
public interface Mitumoriuchiwakerepository extends JpaRepository<Mitumoriuchiwake, String> {

}
