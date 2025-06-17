package cn.scu.edu.service;

import cn.scu.edu.domain.Admin;

import java.util.List;

public interface AdminService {
    void add(Admin admin);
    void delete(Long id);
    void update(Admin admin);
    Admin findById(Long id);
    List<Admin> findAll();
    void deleteByIds(List<Long> ids);
}
