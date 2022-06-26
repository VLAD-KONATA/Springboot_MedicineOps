package com.medops_system.controller;

import com.medops_system.model.Medicine;
import com.medops_system.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MedicineController {
    @Autowired
    MedicineService medicineService;
    @GetMapping("/medicine")
    public ModelAndView medicine()
    {
        List<Medicine> medicine = new ArrayList<>();
        medicine=medicineService.getMedicine();
        ModelAndView mv = new ModelAndView();
        mv.addObject("medicine", medicine);
        mv.setViewName("medicine");
        return mv;
    }
    @GetMapping("/Search")
    public ModelAndView Search(String MName)
    {
        List<Medicine> medicine = new ArrayList<>();
        medicine=medicineService.findAllByMNameContaining(MName);
        ModelAndView mv = new ModelAndView();
        mv.addObject("medicine", medicine);
        mv.setViewName("medicine");
        return mv;
    }
    @RequestMapping("/toAdd")
    public String toAdd()
    {
        return "/medicine_add";
    }
    @RequestMapping("/Add")
    public String Add(Medicine medicine)
    {
        medicineService.addMedicine(medicine);
        System.out.println(medicine);
        return "redirect:/medicine";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(String MID, Model model){
        Medicine m = medicineService.findByMID(MID);
        model.addAttribute("medicine",m);
        return "/medicine_update";
    }

    @RequestMapping("/Update")
    public String Update(Medicine medicine){
        medicineService.updateMedicine(medicine);
        return "redirect:/medicine";
    }

    @RequestMapping("/Delete")
    public String Delete(String MID){
        medicineService.deleteMedicine(MID);
        return "redirect:/medicine";
    }

}
