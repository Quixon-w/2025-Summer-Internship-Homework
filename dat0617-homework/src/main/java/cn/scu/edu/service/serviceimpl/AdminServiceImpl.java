package cn.scu.edu.service.serviceimpl;

import cn.scu.edu.domain.Admin;
import cn.scu.edu.mapper.AdminMapper;
import cn.scu.edu.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    AdminMapper adminMapper;
    @Override
    public void add(Admin admin) {
        adminMapper.add(admin);
    }

    @Override
    public void delete(Long id) {
        adminMapper.delete(id);
    }

    @Override
    public void update(Admin admin) {
        adminMapper.update(admin);
    }

    @Override
    public Admin findById(Long id) {
        return adminMapper.findById(id);
    }

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    @Override
    public void deleteByIds(List<Long> ids) {
        adminMapper.deleteByIds(ids);
    }
}
