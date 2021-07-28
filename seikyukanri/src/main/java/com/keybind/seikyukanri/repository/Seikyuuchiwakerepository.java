package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Seikyuuchiwake;

@Repository
public interface Seikyuuchiwakerepository extends JpaRepository<Seikyuuchiwake,String> {

}
