package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.keybind.seikyukanri.entity.Seikyuu_bp;

@Repository
public interface Seikyuu_bprepository extends JpaRepository<Seikyuu_bp, String> {
	
}