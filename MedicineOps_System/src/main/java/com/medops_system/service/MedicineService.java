package com.medops_system.service;


import com.medops_system.dao.MedicineDao;
import com.medops_system.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {
    @Autowired
    MedicineDao medicineDao;
    public void addMedicine(Medicine medicine)
    {
        medicineDao.save(medicine);
    }
    public void deleteMedicine(String MID)
    {
        medicineDao.deleteById(MID);
    }
    public void updateMedicine(Medicine medicine)
    {
        medicineDao.save(medicine);
    }
    public List<Medicine> getMedicine()
    {
        return medicineDao.findAll();
    }
    public List<Medicine> findAllByMNameContaining(String MName)
    {
        return medicineDao.findAllByMNameContaining(MName);
    }
    public Medicine findByMID(String MID)
    {
        return medicineDao.findByMID(MID);
    }

}

