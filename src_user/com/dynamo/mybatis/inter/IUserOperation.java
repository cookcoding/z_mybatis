package com.dynamo.mybatis.inter;

import com.dynamo.mybatis.domain.User;

public interface IUserOperation {
	public User selectUserByID(int id);
}
