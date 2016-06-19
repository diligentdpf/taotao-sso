package diao.taotao.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diao.taotao.common.util.TaotaoResult;
import diao.taotao.pojo.TbUser;

public interface UserService {
	/**
	 * 数据较验
	 */
	public TaotaoResult checkData(String content, Integer type);

	/**
	 * 用户注册
	 */
	public TaotaoResult createUser(TbUser user);

	/**
	 * 用户登陆
	 */
	public TaotaoResult userLogin(String username, String password, HttpServletRequest request,
			HttpServletResponse response);

	/**
	 * 根据token查询用户信息
	 */
	public TaotaoResult getUserByToken(String token);
}
