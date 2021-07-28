package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Seikyuuchiwake_bp;

@Repository
public interface Seikyuuchiwake_bprepository extends JpaRepository<Seikyuuchiwake_bp,String> {

}
