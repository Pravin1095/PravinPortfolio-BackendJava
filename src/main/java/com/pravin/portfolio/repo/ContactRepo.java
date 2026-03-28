package com.pravin.portfolio.repo;

import com.pravin.portfolio.model.ContactDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<ContactDetailsModel,Integer> {

}
