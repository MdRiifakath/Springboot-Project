package com.shoppingMallManagement.adminrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingMallManagement.adminentity.Adminservice;
@Repository
public interface AdminRepository extends JpaRepository<Adminservice, Long>{

}
