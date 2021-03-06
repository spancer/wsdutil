package org.gonetbar.ssa.dao.impl;

import java.util.List;

import org.gonetbar.ssa.dao.SsaUserDao;
import org.gonetbar.ssa.entity.UserInfoVo;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 
 * @Description:
 * 
 * @author weisd Email:xiyangdewuse@163.com
 * @date 2011-12-8 下午9:36:02
 * @version v1.0
 */
public class SsaUserDaoImpl extends BaseDaoImpl implements SsaUserDao {

	public List<UserDetails> loadUsersByUsername(String username) {
		return null;
	}

	@Override
	public UserInfoVo findUserByVo(UserInfoVo findVo) {
		return (UserInfoVo) this.findObject("org.gonetbar.ssa.entity.UserInfoVoMapper.findUserByVoId", findVo);
	}

}
