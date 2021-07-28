package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Seikyuusonota;

@Repository
public interface Seikyuusonotarepository extends JpaRepository<Seikyuusonota, String> {

}
