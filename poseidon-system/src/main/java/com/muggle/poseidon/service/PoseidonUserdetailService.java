package com.muggle.poseidon.service;

import com.muggle.poseidon.base.ResultBean;
import com.muggle.poseidon.model.PoseidonUserDetail;

public interface PoseidonUserdetailService {
    ResultBean create();

    ResultBean getVerification(PoseidonUserDetail poseidonUserDetail);
}
