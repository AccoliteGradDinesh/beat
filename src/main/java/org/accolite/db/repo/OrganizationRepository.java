package org.accolite.db.repo;

import org.accolite.db.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Long>{
    List<Organization> findAllByOrgName(String name);
}