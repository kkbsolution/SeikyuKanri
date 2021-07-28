package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Seikyuu;

@Repository
public interface Seikyuurepository extends JpaRepository<Seikyuu, String> {
	
}