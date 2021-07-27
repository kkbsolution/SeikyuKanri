package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Shainmaster;

@Repository
public interface Shainmasterrepository extends JpaRepository<Shainmaster, String> {

}