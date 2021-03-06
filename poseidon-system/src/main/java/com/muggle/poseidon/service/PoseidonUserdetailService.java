package com.muggle.poseidon.service;

import com.muggle.poseidon.base.ResultBean;
import com.muggle.poseidon.entity.vo.UserVO;

public interface PoseidonUserdetailService {

    ResultBean getUsersByRoleId(String roleId);

    ResultBean getUserById(String id);


    ResultBean update(UserVO user,String oldPassword,String newPassword);

    ResultBean delete();
}
