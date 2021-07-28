package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.keybind.seikyukanri.entity.Codemaster;

@Repository
public interface Codemasterrepository extends JpaRepository<Codemaster, String> {

}
