/*
 * Automatically generated
 */

package com.hosa.web.service;

import java.util.List;

import com.hosa.core.page.Page;
import com.hosa.web.model.UserFavoriteRelation;
import com.hosa.web.vo.query.UserFavoriteRelationQuery;
import com.hosa.core.exceptions.ServiceException;


public interface IUserFavoriteRelationService {
	
	/**
	 * 分页查询
	 * @param page
	 * @param query
	 * @return
	 */
	public Page<UserFavoriteRelation> findPage(Page<UserFavoriteRelation> page, UserFavoriteRelationQuery query);
	
	/**
	 * 删除
	 * @param idList
	 * @throws ServiceException
	 */
	public Integer deleteByMultipleId(List<java.lang.Long> idList) throws ServiceException;
	
	/**
	 * 删除
	 * @param id
	 * @throws ServiceException
	 */
	public Integer deleteById(java.lang.Long id) throws ServiceException;
	
	/**
	 * 保存
	 * @param entity
	 * @throws ServiceException
	 */
	public Integer saveOrUpdate(UserFavoriteRelation entity) throws ServiceException;
	
	/**
	 * 新增
	 * @param entity
	 * @return
	 * @throws ServiceException
	 */
	public Integer save(UserFavoriteRelation entity) throws ServiceException;
	
	/**
	 * 更新
	 * @param entity
	 * @return
	 * @throws ServiceException
	 */
	public Integer update(UserFavoriteRelation entity) throws ServiceException;
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	public UserFavoriteRelation getById(java.lang.Long id); 
	
	/**
	 * 查询
	 * @param idList
	 * @return
	 */
	public List<UserFavoriteRelation> getByMultipleId(List<java.lang.Long> idList); 
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	public UserFavoriteRelation getByIdFromCache(java.lang.Long id); 
	
	/**
	 * 查询
	 * @param query
	 * @return
	 */
	public List<UserFavoriteRelation> findList(UserFavoriteRelationQuery query);
	
	/**
	 * 查询
	 * @param query
	 * @param size
	 * @return
	 */
	public List<UserFavoriteRelation> findList(UserFavoriteRelationQuery query, Integer size);
	
	/**
	 * 查询
	 * @param query
	 * @param size
	 * @param offset
	 * @return
	 */
	public List<UserFavoriteRelation> findList(UserFavoriteRelationQuery query, Integer size, Integer offset);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<UserFavoriteRelation> findAllList();
	
}
