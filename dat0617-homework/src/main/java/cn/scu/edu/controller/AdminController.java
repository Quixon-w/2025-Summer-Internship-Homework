package cn.scu.edu.controller;

import cn.scu.edu.domain.Admin;
import cn.scu.edu.query.AdminQuery;
import cn.scu.edu.service.AdminService;
import cn.scu.edu.util.AjaxResult;
import cn.scu.edu.util.PageList;
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
    public AjaxResult delete(@PathVariable("id") Long id) {
        adminService.delete(id);
        return AjaxResult.ok();
    }

    @PatchMapping
    public AjaxResult deleteByIds(@RequestBody List<Long> ids) {
        adminService.deleteByIds(ids);
        return AjaxResult.ok();
    }

    @PutMapping
    public AjaxResult update(@RequestBody Admin admin) {
        if (admin.getId() == null) {
            adminService.add(admin);
        } else {
            adminService.update(admin);
        }
        return AjaxResult.ok();
    }

    @PostMapping
    public PageList<Admin> queryPage(@RequestBody AdminQuery query) {
        return adminService.queryPage(query);
    }

}
