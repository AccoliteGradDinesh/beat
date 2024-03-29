package org.accolite.db.services;

import org.accolite.db.entities.Organization;
import org.accolite.pojo.OrgView;
import org.accolite.pojo.OrganizationCard;
import org.accolite.pojo.OrganizationUpdateDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OrganizationService {
    Organization createOrganization(Organization organization);
    Optional<Organization> getOrganizationById(long id);
    List<Organization> getOrganization();
    boolean disableOrganization(long id);
    boolean saveUpdateOrganization(Organization organization);
    OrganizationUpdateDetails cloneToOrganizationUpdateDetails(OrganizationUpdateDetails organizationUpdateDetailsFromDb, Organization organizationDetailsFromDb);
    Organization cloneToOrganization(Organization organizationDetailsFromDb, OrganizationUpdateDetails organizationUpdateDetailsFromClient);
    String getOrganizationName(long organizationId);
    OrganizationCard getParentCard(long parentOrg);
    OrganizationCard cloneToOrganizationCard(OrganizationCard curOrganizationCard, Organization curOrganization);
    List<Organization> getOrganizationsByName(String name);
    OrgView cloneToOrgView(OrgView orgView, Organization organization);
}