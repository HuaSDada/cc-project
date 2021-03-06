package com.cjhme.system.impl.service.log;

import java.util.Map;

import com.cjhme.common.model.base.DataPaging;

/**
 * 
 * <p>  
 * Title: LoginLogService.java 
 * </p>  
 * Description: 登录日志
 * <p>
 * Modify histoty:
 * @author  cjh  
 * @version 1.0
 */
public interface LoginLogService {


	
	/**
	 * 添加登录日志 
	 * @param parameter
	 * @return
	 */
	public int saveLoginLog(Map<String, Object> parameter);
	
	/**
	 * 根据条件分页查询登录日志
	 * 
	 * @param parameter
	 * @return
	 */
	public DataPaging<Object> queryLoginLogByConditionPaging(DataPaging<Object> pageParameter);
}
