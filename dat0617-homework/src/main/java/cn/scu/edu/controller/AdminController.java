package cn.scu.edu.controller;

import cn.scu.edu.domain.Admin;
import cn.scu.edu.service.AdminService;
import cn.scu.edu.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping
    public List<Admin> getAll() {
        return adminService.findAll();
    }
    @GetMapping("/{id}")
    public Admin getOne(@PathVariable("id") Long id) {
        return adminService.findById(id);
    }
    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable("id")Long id){
        try {
            adminService.delete(id);
            return AjaxResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.fail();
        }
    }
    @DeleteMapping("/{ids}")
    public AjaxResult deleteByIds(@RequestBody List<Long> ids){
        try {
            adminService.deleteByIds(ids);
            return AjaxResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.fail();
        }
    }
    @PutMapping
    public AjaxResult update(@RequestBody Admin admin){
        try {
            if(admin.getId() == null){
                adminService.add(admin);
            }else{
                adminService.update(admin);
            }
            return AjaxResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.fail();
        }
    }
}
