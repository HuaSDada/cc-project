package com.cjhme.system.impl.dao.button.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cjhme.common.model.base.DataPaging;
import com.cjhme.common.model.button.ButtonBean;
import com.cjhme.system.impl.base.dao.BaseDao;
import com.cjhme.system.impl.dao.button.ButtonDao;

/**
 * 
 * <p>  
 * Title: ButtonDaoImpl.java 
 * </p>  
 * Description: 按钮
 * <p>
 * Modify histoty:
 * @author  cjh  
 * @version 1.0
 */
@Repository("system.buttonDao")
public class ButtonDaoImpl extends BaseDao implements ButtonDao {

	/**
	 * 根据条件分页查询按钮
	 * @param pageParameter
	 * @return
	 */
	public DataPaging<Object> queryButtonByConditionPaging(DataPaging<Object> pageParameter){
		return this.selectPaging("com.cjhme.system.core.dao.button.ButtonDao.queryButtonByConditionPaging", pageParameter);
	}
	
	/**
	 * 判断按钮是否存在
	 * @param parameter
	 * @return
	 */
	public int queryButtonIsExists(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().selectOne("com.cjhme.system.core.dao.button.ButtonDao.queryButtonIsExists",parameter);
	}
	
	/**
	 * 添加按钮
	 * @param parameter
	 * @return
	 */
	public int saveButton(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().insert("com.cjhme.system.core.dao.button.ButtonDao.saveButton",parameter);
	}
	
	/**
	 * 根据id查询按钮
	 * @param parameter
	 * @return
	 */
	public ButtonBean queryButtonById(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().selectOne("com.cjhme.system.core.dao.button.ButtonDao.queryButtonById",parameter);
	}
	
	/**
	 *  根据id修改按钮
	 * @param parameter
	 * @return
	 */
	public int updateButtonById(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().update("com.cjhme.system.core.dao.button.ButtonDao.updateButtonById",parameter);
	}
	
	/**
	 * 根据ids删除按钮
	 */
	public int deleteButtonByIds(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().delete("com.cjhme.system.core.dao.button.ButtonDao.deleteButtonByIds",parameter);
	}
	
	
	/**
	 * 查询所有按钮列表
	 * @return
	 */
	public List<ButtonBean> queryAllButtonList(){
		return this.getSqlSessionTemplate().selectList("com.cjhme.system.core.dao.button.ButtonDao.queryAllButtonList");
	}
	
	/**
	 * 根据业务标识与用户id查询按钮
	 * @param parameter
	 * @return
	 */
	public List<ButtonBean> queryBtnByBusniessMarkAndUserId(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().selectList("com.cjhme.system.core.dao.button.ButtonDao.queryBtnByBusniessMarkAndUserId", parameter);
	}
	
	/**
	 * 根据按钮ids删除按钮角色映射
	 * @param parameter
	 * @return
	 */
	public int deleteButtonRoleMappingByIds(Map<String,Object> parameter){
		return this.getSqlSessionTemplate().delete("com.cjhme.system.core.dao.button.ButtonDao.deleteButtonRoleMappingByIds",parameter);
	}
	
}
