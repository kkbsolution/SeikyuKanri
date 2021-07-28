package com.keybind.seikyukanri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.keybind.seikyukanri.entity.Seikyuusonota_bp;

@Repository
public interface Seikyuusonota_bprepository extends JpaRepository<Seikyuusonota_bp, String> {

}
