package org.gonetbar.ssa.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录成功后，如果没有跳转到第3方平台这在我方平台显示登录成功 如果用户刷新则又需要重新登录， 用这个action跳转到成功界面
 * 
 * @author Administrator
 * 
 */
@Controller
public final class UserAction {

	@RequestMapping(value = "/user/index.do")
	public String registerBind(HttpServletRequest request, ModelMap model) {
		return "user_index";
	}

	private static final Logger logger = LoggerFactory.getLogger(UserAction.class);

}
