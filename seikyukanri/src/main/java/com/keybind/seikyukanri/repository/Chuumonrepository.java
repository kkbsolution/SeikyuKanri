package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Chuumon;

@Repository
public interface Chuumonrepository extends JpaRepository<Chuumon,String> {
	
}
