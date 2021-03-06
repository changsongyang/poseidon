package com.muggle.poseidon.repos;

import com.muggle.poseidon.entity.PoseidonUserDetail;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoseidonUserDetailsRepository extends CrudRepository<PoseidonUserDetail, String>, JpaSpecificationExecutor<PoseidonUserDetail> {
     PoseidonUserDetail findByUsernameAndDeleteTimeIsNull(String username);
}