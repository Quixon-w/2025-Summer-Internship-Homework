package cn.scu.edu.mapper;

import cn.scu.edu.domain.Admin;
import cn.scu.edu.query.AdminQuery;

import java.util.List;

public interface AdminMapper {

    void add(Admin admin);

    void delete(Long id);

    void update(Admin admin);

    Admin findById(Long id);

    List<Admin> findAll();

    void deleteByIds(List<Long> ids);

    Integer queryCount(AdminQuery query);

    List<Admin> queryData(AdminQuery query);
}
