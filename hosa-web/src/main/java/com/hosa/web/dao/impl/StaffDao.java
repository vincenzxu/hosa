/*
 * Automatically generated
 */

package com.hosa.web.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hosa.core.mybatis.BaseMybatisDao;
import com.hosa.web.dao.IStaffDao;
import com.hosa.web.model.Staff;


@Repository
public class StaffDao extends BaseMybatisDao<Staff, java.lang.Long> implements IStaffDao {
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "Staff";
	}
	
	public Integer saveOrUpdate(Staff entity) {
		if(entity.getId() == null) {
			return save(entity);
		} else {
			return update(entity);
		}
	}
	
	public Staff getByMobile(java.lang.String val) {
		return (Staff)getSqlSessionTemplate().selectOne("Staff.getByMobile", val);
	}	
	
	public Staff getByLoginId(java.lang.String val) {
		return (Staff)getSqlSessionTemplate().selectOne("Staff.getByLoginId", val);
	}	
	
	public List<Long> findDepartmentIdByMultipleId(List<Long> idList) {
		return getSqlSessionTemplate().selectList("Staff.findDepartmentIdByMultipleId", idList);
	} 
	
	public Long getDepartmentIdById(Long id) {
		return getSqlSessionTemplate().selectOne("Staff.getDepartmentIdById", id);
	}
}
