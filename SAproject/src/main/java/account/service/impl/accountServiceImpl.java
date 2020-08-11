package account.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import account.dao.accountDao;
import account.dto.member;
import account.service.accountService;

public class accountServiceImpl implements accountService {
	private accountDao ad;
	
	@Override
	public List<member> show() {
		// TODO Auto-generated method stub
		return ad.show();
	}

}
