package cn.scu.edu.service.serviceimpl;

import cn.scu.edu.domain.Admin;
import cn.scu.edu.mapper.AdminMapper;
import cn.scu.edu.query.AdminQuery;
import cn.scu.edu.service.AdminService;
import cn.scu.edu.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    @Override
    public void add(Admin admin) {
        adminMapper.add(admin);
    }

    @Override
    public void delete(Long id) {
        adminMapper.delete(id);
    }

    @Transactional
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

    @Transactional
    @Override
    public void deleteByIds(List<Long> ids) {
        adminMapper.deleteByIds(ids);
    }

    @Override
    public PageList<Admin> queryPage(AdminQuery query) {
        //查询总数量
        Integer totals = adminMapper.queryCount(query);
        if (totals == 0) {
            return new PageList<>();
        }
        //查询当前页的数据
        List<Admin> list = adminMapper.queryData(query);
        return new PageList<>(list, totals);
    }
}
