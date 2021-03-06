package org.gonetbar.ssa.dao;

import java.util.List;

import org.gonetbar.base.entity.PageBean;
import org.gonetbar.base.entity.ParamPageVo;

public interface BaseDao {

	public Object addObject(String sqlid, Object obj);

	public int updateObject(String sqlid, Object obj);

	public int deleteObject(String sqlid, Object obj);

	public Object findObject(String sqlid, Object obj);

	@SuppressWarnings("rawtypes")
	public List queryList(String sqlid, Object obj);

	public int queryTotalRows(String countSqlid, Object obj);

	public PageBean queryListPage(ParamPageVo paramPageVo);

}
