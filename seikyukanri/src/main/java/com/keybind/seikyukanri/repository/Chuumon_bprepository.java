package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Chuumon_bp;

@Repository
public interface Chuumon_bprepository extends JpaRepository<Chuumon_bp,String> {

}
