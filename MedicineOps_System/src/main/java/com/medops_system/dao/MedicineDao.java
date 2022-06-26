package com.medops_system.dao;

import com.medops_system.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicineDao extends JpaRepository<Medicine,String>
{
    public List<Medicine> findAllByMNameContaining(String MName);
    public Medicine findByMID(String MID);
}

